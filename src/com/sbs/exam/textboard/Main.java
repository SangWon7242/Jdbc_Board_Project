package com.sbs.exam.textboard;

import com.sbs.exam.textboard.exception.SQLErrorException;

public class Main {
  public static void main(String[] args) {
    try {
      new App().run();
    }
    catch (SQLErrorException e) {
      System.out.println(e.getMessage());
      e.getOrigin().printStackTrace();
    }
  }
}