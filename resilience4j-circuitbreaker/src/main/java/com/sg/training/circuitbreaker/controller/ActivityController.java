package com.sg.training.circuitbreaker.controller;

import com.sg.training.circuitbreaker.model.Activity;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;

@Slf4j
@RequestMapping("/activity")
@RestController
public class ActivityController {

    private final RestTemplate restTemplate;

    @Autowired
    public ActivityController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    @CircuitBreaker(name = "randomDog", fallbackMethod = "fallbackRandomActivity" )
    public String getRandomActivity() {
        try {
            log.info("Calling Dog API for a random dog picture.");
            ResponseEntity<Activity> responseEntity = restTemplate.getForEntity("https://dog.ceo/api/breeds/image/random", Activity.class);
            Activity activity = responseEntity.getBody();
            if (activity != null && "success".equals(activity.getStatus())) {
                log.info("Activity received: {}", activity.getMessage());
                return activity.getMessage();
            } else {
                log.warn("No activity received from Dog API, response body is null or status is not success.");
                return fallbackRandomActivity(new RuntimeException("No activity received from Dog API"));
            }
        } catch (HttpClientErrorException | ResourceAccessException e) {
            log.error("Error occurred while fetching activity: {}", e.getMessage());
            return fallbackRandomActivity(e);
        }
    }

    public String fallbackRandomActivity(Throwable throwable) {
        log.error("Fallback method called due to: {}", throwable.getMessage());
        return "Watch a video from sg.training";
    }
}

@Configuration
class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
