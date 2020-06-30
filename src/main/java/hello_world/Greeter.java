package hello_world;

import java.util.Objects;

public class Greeter {

  static final String PREFIX = "Hello, ";

  public static String greeting() {
    return PREFIX + "World";
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

    return PREFIX + name;
  }

}
