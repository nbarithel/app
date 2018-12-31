package com.github.nbarithel.app.lib.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.github.nbarithel.app.lib.Greeter;

@RunWith(JUnitPlatform.class)
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
