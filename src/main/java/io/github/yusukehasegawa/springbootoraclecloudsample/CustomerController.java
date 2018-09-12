package io.github.yusukehasegawa.springbootoraclecloudsample;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.yusukehasegawa.springbootoraclecloudsample.domain.Customer;
import io.github.yusukehasegawa.springbootoraclecloudsample.repository.CustomerRepository;

@CrossOrigin
@RestController
@RequestMapping("/")
public class CustomerController {

	private final CustomerRepository customerRepository;

	public CustomerController(final CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@RequestMapping
	public List<Customer> get() {
		return customerRepository.findAll();
	}
}
