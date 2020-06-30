package hello_world;

import java.util.Objects;

public class Greeter {

  public enum Language {
    ENGLISH,
    SPANISH
  }

  static final String PREFIX_ENGLISH = "Hello, ";
  static final String PREFIX_SPANISH = "Hola, ";

  public static String greeting() {
    return PREFIX_ENGLISH + "World";
  }

  public static String greeting(String name, Language language) {

    if (Objects.isNull(name)) {
      return greeting();
    }

    if (name.isEmpty()) {
      return greeting();
    }

    if (name.trim().isEmpty()) {
      return greeting();
    }

    String prefix = (language == Language.SPANISH) ? PREFIX_SPANISH : PREFIX_ENGLISH;

    return prefix + name;
  }

}
