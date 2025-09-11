package com.mycompany.app;

/**
 * Hello world app.
 */
public class App {

  private final String message = "Hello World!";

  // compute 1 + 1 = ?
  public App() {
    System.out.println("created!");
  }

  public static void main(String[] args) {
    System.out.println(new App().getMessage());
  }

  private final String getMessage() {
    return message;
  }
}
