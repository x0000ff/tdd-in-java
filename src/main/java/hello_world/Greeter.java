package hello_world;

import java.util.Objects;

public class Greeter {

  public static String greeting() {
    return "Hello, World";
  }

  public static String greeting(String name) {

    if (Objects.isNull(name)) {
      return greeting();
    }

    if (name.isEmpty()) {
      return greeting();
    }

    if (name.trim().isEmpty()) {
      return greeting();
    }

    return "Hello, " + name;
  }

}
