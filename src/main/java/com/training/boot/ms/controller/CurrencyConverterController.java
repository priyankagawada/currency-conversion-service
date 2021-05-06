package com.training.boot.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.boot.ms.dao.CurrencyConversionRepository;
import com.training.boot.ms.model.CurrencyConverter;

@RestController
@RequestMapping(value = "/api/v1")
public class CurrencyConverterController {

	@Autowired
	private CurrencyConversionRepository repository;

	@RequestMapping(value = "/from/{from}/to/{to}")
	public CurrencyConverter convertCurrency(@PathVariable String from, @PathVariable String to) {

		CurrencyConverter converter = new CurrencyConverter(null, from, to, null);
		Example<CurrencyConverter> conversionFilter = Example.of(converter);
		return repository.findOne(conversionFilter).get();
	}
}
