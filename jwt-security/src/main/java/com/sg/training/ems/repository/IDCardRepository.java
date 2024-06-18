package com.sg.training.ems.repository;

import com.sg.training.ems.domain.IDCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDCardRepository extends JpaRepository<IDCard, Long> {
}

