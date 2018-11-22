package ru.smurtazin;

import java.util.List;

public class TwoTuple<X> {

  public X left;
  public X right;

  public TwoTuple(X left, X right) {
    this.left = left;
    this.right = right;
  }
}