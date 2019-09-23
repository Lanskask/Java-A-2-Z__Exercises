package ru.smurtazin.cinema.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class HallController {

  @RequestMapping("/payment")
  void handleFoo(HttpServletResponse response) throws IOException {
    response.sendRedirect("payment");
  }

}