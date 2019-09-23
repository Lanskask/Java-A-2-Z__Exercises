package ru.smurtazin;

import java.util.List;

public class Tuple2<X> {

  public X left;
  public X right;

  public Tuple2(X left, X right) {
    this.left = left;
    this.right = right;
  }
}