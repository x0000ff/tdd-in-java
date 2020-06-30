package hello_world;

import java.util.Objects;

public class Greeter {

  public enum Language {
    ENGLISH,
    SPANISH
  }

  static final String PREFIX_ENGLISH = "Hello, ";
  static final String PREFIX_SPANISH = "Hola, ";

  static final String WORLD_IN_ENGLISH = "World";
  static final String WORLD_IN_SPANISH = "Mundo";

  public static String greeting(Language language) {

    String world = (language == Language.SPANISH) ? WORLD_IN_SPANISH : WORLD_IN_ENGLISH;

    return prefixForLanguage(language) + world;
  }

  public static String greeting(String name, Language language) {

    if (Objects.isNull(name)) {
      return greeting(language);
    }

    if (name.isEmpty()) {
      return greeting(language);
    }

    if (name.trim().isEmpty()) {
      return greeting(language);
    }

    return prefixForLanguage(language) + name;
  }

  private static String prefixForLanguage(Language language) {
    return (language == Language.SPANISH) ? PREFIX_SPANISH : PREFIX_ENGLISH;
  }

}
