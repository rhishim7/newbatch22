package com.zensar.stockapplication.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
///info /health /beans
@Endpoint(id = "custom")

public class CustomEndpoint {

	// Because we are reading the /custom endpoint
	@ReadOperation
	public String myOwnCustomEndpoint() {
		return "Custom Endpoint";
	}
}
