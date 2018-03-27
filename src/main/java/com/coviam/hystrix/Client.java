package com.coviam.hystrix;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by khan on 3/27/18.
 */
@FeignClient(name = "hystrixDemo", url = "http://localhost:8080/hystrixDemo", fallback = FallBack.class)
public interface Client {
  @GetMapping(value = "/demo")
  String demo();

  @GetMapping(value = "/falback")
  String fallback();
}
