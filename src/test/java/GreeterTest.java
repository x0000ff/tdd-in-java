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

}
