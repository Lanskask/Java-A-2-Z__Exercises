package ru.smurtazin.cinema.controllers;

import java.io.IOException;

@RestController
public class HallController {

  @RequestMapping("/payment")
  void handleFoo(HttpServletResponse response) throws IOException {
    response.sendRedirect("payment");
  }

}