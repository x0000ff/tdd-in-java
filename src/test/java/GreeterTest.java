import hello_world.Greeter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {

  @Nested
  @DisplayName("English")
  class English {
    @Test
    void simpleGreeting() {
      String actual = Greeter.greeting(Greeter.Language.ENGLISH);
      String expected = "Hello, World";

      assertEquals(expected, actual);
    }

    @Test
    void greetingWithName() {
      String actual = Greeter.greeting("Kent", Greeter.Language.ENGLISH);
      String expected = "Hello, Kent";

      assertEquals(expected, actual);
    }

    @Test
    void greetingNull() {
      String actual = Greeter.greeting(null, Greeter.Language.ENGLISH);
      String expected = "Hello, World";

      assertEquals(expected, actual);
    }

    @Test
    void greetingEmptyString() {
      String actual = Greeter.greeting("", Greeter.Language.ENGLISH);
      String expected = "Hello, World";

      assertEquals(expected, actual);
    }

    @Test
    void greetingWhitespacedString() {
      String actual = Greeter.greeting("\n\n\t\t\t\n", Greeter.Language.ENGLISH);
      String expected = "Hello, World";

      assertEquals(expected, actual);
    }
  }

  @Nested
  @DisplayName("Spanish")
  class Spanish {

    @Test
    void simpleGreeting() {
      String actual = Greeter.greeting(Greeter.Language.SPANISH);
      String expected = "Hola, Mundo";

      assertEquals(expected, actual);
    }

    @Test
    void greetingWithName() {
      String actual = Greeter.greeting("Antonio", Greeter.Language.SPANISH);
      String expected = "Hola, Antonio";

      assertEquals(expected, actual);
    }

    @Test
    void greetingNull() {
      String actual = Greeter.greeting(null, Greeter.Language.SPANISH);
      String expected = "Hola, Mundo";

      assertEquals(expected, actual);
    }

    @Test
    void greetingEmptyString() {
      String actual = Greeter.greeting("", Greeter.Language.SPANISH);
      String expected = "Hola, Mundo";

      assertEquals(expected, actual);
    }

    @Test
    void greetingWhitespacedString() {
      String actual = Greeter.greeting("\n\n\t\t\t\n", Greeter.Language.SPANISH);
      String expected = "Hola, Mundo";

      assertEquals(expected, actual);
    }

  }

}
