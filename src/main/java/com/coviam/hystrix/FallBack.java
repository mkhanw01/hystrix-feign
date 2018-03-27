package com.coviam.hystrix;

import org.springframework.stereotype.Component;

/**
 * Created by khan on 3/27/18.
 */
@Component
public class FallBack implements Client {

  @Override
  public String demo() {
    return "demo";
  }

  @Override
  public String fallback() {
    return "fallback";
  }
}
