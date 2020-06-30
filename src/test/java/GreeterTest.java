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
    String actual = Greeter.greeting("Kent");
    String expected = "Hello, Kent";

    assertEquals(expected, actual);
  }

  @Test
  void greetingNull() {
    String actual = Greeter.greeting(null);
    String expected = "Hello, World";

    assertEquals(expected, actual);
  }

    @Test
    void greetingEmptyString() {
        String actual = Greeter.greeting("");
        String expected = "Hello, World";

        assertEquals(expected, actual);
    }

}
