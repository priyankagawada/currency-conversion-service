package com.training.boot.ms;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.training.boot.ms.dao.CurrencyConversionRepository;
import com.training.boot.ms.model.CurrencyConverter;

@Component
public class BootStrapRepository implements CommandLineRunner {

	private CurrencyConversionRepository repository;

	public BootStrapRepository(CurrencyConversionRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public void run(String... args) throws Exception {

		CurrencyConverter converter1 = new CurrencyConverter(1L, "USD", "INR", BigDecimal.valueOf(74.18));
		CurrencyConverter converter2 = new CurrencyConverter(2L, "USD", "JPY", BigDecimal.valueOf(111.12));

		repository.save(converter1);
		repository.save(converter2);

	}

}
