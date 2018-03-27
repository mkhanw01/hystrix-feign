package com.coviam.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by khan on 3/27/18.
 */
@RestController
public class HystrixController {

  @Autowired
  Client client;

  @GetMapping(value = "/demo")
  public String demo() {
    return "demo";
  }

  @GetMapping(value = "/demo/fallback")
  public String demoFallback() {
    return client.fallback();
  }

  @GetMapping(value = "/demo/feign")
  public String demoFeign() {
    return client.demo();
  }
}
