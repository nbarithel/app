package com.github.nbarithel.app.main;

import com.github.nbarithel.app.lib.Greeter;

public final class AppMain {

  public static void main(String[] args) {
    Greeter helloWorld = new Greeter();
    System.out.println(helloWorld.saySomething());
  }

  private AppMain() {}
}
