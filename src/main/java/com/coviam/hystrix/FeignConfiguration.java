package com.coviam.hystrix;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * Created by khan on 3/27/18.
 */
@Configuration
@EnableCircuitBreaker
@EnableFeignClients
public class FeignConfiguration {

}
