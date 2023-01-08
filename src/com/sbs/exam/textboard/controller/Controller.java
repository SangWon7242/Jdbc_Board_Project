package com.sbs.exam.textboard.controller;

import com.sbs.exam.textboard.Container;

import java.sql.Connection;
import java.util.Scanner;

public abstract class Controller {
  protected Scanner sc;

  public Controller() {
    this.sc = Container.scanner;
  }
}
