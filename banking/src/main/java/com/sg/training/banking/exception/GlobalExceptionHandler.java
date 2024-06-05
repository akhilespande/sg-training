package com.sg.training.banking.exception;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(AccountNotFoundException.class)
    public ResponseEntity<Map<String, Object>> handleAccountNotFoundException(AccountNotFoundException accountNotFoundException){
        log.error("AccountNotFoundException : [{}]",accountNotFoundException.getMessage());
        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("timestamp", LocalDateTime.now());
        responseMap.put("status", HttpStatus.NOT_FOUND.value());
        responseMap.put("message", accountNotFoundException.getMessage());
        responseMap.put("path", "api/accounts");
        return new ResponseEntity<>(responseMap, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(InsufficientFundsException.class)
    public ResponseEntity<Map<String, Object>> handleInsufficientFundsException(InsufficientFundsException insufficientFundsException){
        log.error("InsufficientFundsException : [{}]", insufficientFundsException.getMessage());
        Map<String , Object> responseMap = new HashMap<>();
        responseMap.put("timestamp", LocalDateTime.now());
        responseMap.put("status", HttpStatus.BAD_REQUEST.value());
        responseMap.put("message", insufficientFundsException.getMessage());
        responseMap.put("path", "api/accounts/withdraw");
        return new ResponseEntity<>(responseMap, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> handleGeneralException(Exception exception){
        log.error("Exception : [{}]", exception.getMessage());
        Map<String , Object> responseMap = new HashMap<>();
        responseMap.put("timestamp", LocalDateTime.now());
        responseMap.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        responseMap.put("message", exception.getMessage());
        responseMap.put("path", "api/accounts");
        return new ResponseEntity<>(responseMap, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
