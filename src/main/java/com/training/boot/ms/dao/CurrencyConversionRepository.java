package com.training.boot.ms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.boot.ms.model.CurrencyConverter;

public interface CurrencyConversionRepository extends JpaRepository<CurrencyConverter, Long>{

}
