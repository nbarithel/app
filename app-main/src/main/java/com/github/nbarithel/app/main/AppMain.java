package com.github.nbarithel.app.main;

import com.github.nbarithel.app.lib.Greeter;

public final class AppMain {

  public static void main(String[] args) { // NOPMD - args must be defined even if unused
    Greeter helloWorld = new Greeter();
    System.out.println(helloWorld.saySomething()); // NOPMD - allow System.out logging only this once
  }

  private AppMain() {}
}
