package com.xx.practice.configclient.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "client")
public class ClientUI {

  @Autowired
  private Environment environment;

  @GetMapping(value = "/testClient")
  public String testClient() {
    return environment.getProperty("profile");
  }
}
