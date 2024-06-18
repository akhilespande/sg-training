package com.sg.training.ems.service;

import com.sg.training.ems.domain.Employee;
import com.sg.training.ems.domain.IDCard;
import com.sg.training.ems.repository.IDCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class IDCardService {
    @Autowired
    private IDCardRepository idCardRepository;

    public IDCard issueIDCard(Employee employee, String cardNumber) {
        IDCard idCard = new IDCard();
        idCard.setEmployee(employee);
        idCard.setCard_number(cardNumber);
        idCard.setIssue_date(new Date());
        return idCardRepository.save(idCard);
    }

    public List<IDCard> getAllIDCards() {
        return idCardRepository.findAll();
    }
}
