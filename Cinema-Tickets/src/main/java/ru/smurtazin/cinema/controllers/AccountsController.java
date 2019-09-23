package ru.smurtazin.cinema.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class AccountsController {

  @RequestMapping("/foo")
  void handleFoo(HttpServletResponse response) throws IOException {
    response.sendRedirect("some-url");
  }

}