package com.example.hello;

import com.google.errorprone.annotations.Var;

public class HelloVar {

  // private static String message = "This is marked @Var, because it changes.";

  public static void main(String[] args) {
    String message = "This is marked @Var, because it changes.";
    message = "Hello! " + message;
    System.out.println(message);
  }
}
