package com.zensar.stockapplication.endpoint;

import java.util.Random;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator extends AbstractHealthIndicator {
//To check database is up or down so that we can use it.
// Here we are overrding the http://localhost:9090/actuator/health
	@Override
	protected void doHealthCheck(Builder builder) throws Exception {
		Random random = new Random();
		
		int randomNumber = random.nextInt(100);
		System.out.println(randomNumber);
		if(randomNumber%2==0)
		{
			builder.up();
		}
		else
		{
			builder.down();
		}
		
	}

}
