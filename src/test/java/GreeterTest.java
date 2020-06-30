import hello_world.Greeter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {

  @Test
  void simpleGreeting() {
    String actual = Greeter.greeting();
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

  @Test
  void simpleGreetingInSpanish() {
    String actual = Greeter.greeting("Antonio", Greeter.Language.SPANISH);
    String expected = "Hola, Antonio";

    assertEquals(expected, actual);
  }

}
