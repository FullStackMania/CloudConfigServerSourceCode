package com.fullstackmania.paymentservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstackmania.paymentservice.ServiceConfiguration;

@RestController
public class MainController {

	@Autowired
	private ServiceConfiguration configuration;

	@GetMapping("/values")
	public String getAllValues() {
		return configuration.getHost() + ":->" + configuration.getPort() + ":->" + configuration.getUsername() + ":->"
				+ configuration.getPassword();
	}

}
