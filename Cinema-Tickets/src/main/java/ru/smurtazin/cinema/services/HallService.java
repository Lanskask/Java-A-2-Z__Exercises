package ru.smurtazin.cinema.services;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;

@Service
@Transactional
public class HallService {

  public void someMethod() {
    List list = new LinkedList();
  }

}
