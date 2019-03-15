package com.github.nbarithel.app.lib.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.github.nbarithel.app.lib.Greeter;

public class GreeterTest {

  private static Greeter greeter;

  @BeforeAll
  public static void initGreeter() {
    greeter = new Greeter();
  }

  @Test
  @DisplayName("Say Hello World!")
  public void sayHelloWorld() {
    assertEquals("Hello World!", greeter.saySomething());
  }
}
