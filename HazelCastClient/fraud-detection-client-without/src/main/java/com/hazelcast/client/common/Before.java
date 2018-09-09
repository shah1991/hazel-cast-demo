package com.hazelcast.client.common;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Instant;

/**
 * Capture the timestamp before testing begins.
 * <p>
 * The {@code @Order} annotation ensures this method
 * runs before the {@link FraudService} has been tested.
 */
@Component
@Order(Integer.MIN_VALUE)
public class Before implements CommandLineRunner {

    private Instant before;
    
    public Instant getBefore() {
		return before;
	}



	public void setBefore(Instant before) {
		this.before = before;
	}



	@Override
    public void run(String... arg0) {
        before = Instant.now();
    }
}
