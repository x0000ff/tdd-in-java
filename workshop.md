# ✅ TDD in Java

🙏 Inspired by chapter [Hello, World](https://quii.gitbook.io/learn-go-with-tests/go-fundamentals/hello-world) from great book [Learn Go with tests](https://quii.gitbook.io/learn-go-with-tests/go-fundamentals/hello-world)

## `Hello, Greeter!` 

> ⚠️ To see finished "project" you can checkout branch `finish`:
> 
> ```terminal
> $ git checkout finish
> ```

First we have to create test and define desired API.
I would like too call my class `Greeter`.
 

`GreeterTest.java`

```java
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
```

🔴 We are in the **RED** state.

Let's write the **minimum** amount of code to compile and run the test.

`Greeter.java`

```java
package hello_world;

public class Greeter {

  public static String greeting() {
      return "";
  }
  
}
```

🔴 We're still in **RED** phase but now we have failed test! Yeah!

So, complete the implementation.

`Greeter.java`

```java
package hello_world;

public class Greeter {

  public static String greeting() {
      return "Hello, World";
  }

}
```

✅ Yeah! **GREEN** phase. 

Now we can refactor something. Any ideas? I have no one.

Ad we can use `Greeter` in the App.

`App.java`

```java
package hello_world;

public class App {

    public static void main(String[] args) {
        System.out.println(Greeter.greeting());
    }

}
```

## Say my name!

We want to greet user by name, aren't we?

Let's start with test:

`Greeter.java`

```java
@Test
void greetingWithName() {
    String actual = Greeter.greeting("Kent");
    String expected = "Hello, Kent";

    assertEquals(expected, actual);
}
```

> ☝️ It's propable that you will run your tests frequently.  
> Learn hotkey for it. It's worth 😉   
> In my IntelliJ IDEA it's `CTRL + R`

Run tests. Failed? Sure, we've changed the API.

Fix the implementation.

```java
package hello_world;

public class Greeter {

  public static String greeting() {
      return "Hello, World";
  }

  public static String greeting(String name) {
      return "Hello, " + name;
  }

}
```

## Border cases...

Let's think about abnormal situations

### Oh, wait! It'a `null`

`GreeterTest.java`

```java
@Test
void greetingNull() {
    String actual = Greeter.greeting(null);
    String expected = "Hello, World";

    assertEquals(expected, actual);
}
```

`Greeter.java`

```java
if (Objects.isNull(name)) {
  return greeting();
}
```

> ❓ Why didn't we just use ternary operator? 

### Another border case... Empty strings

`GreeterTest.java`

```java
@Test
void greetingEmptyString() {
    String actual = Greeter.greeting("");
    String expected = "Hello, World";

    assertEquals(expected, actual);
}
```

`Greeter.java`

```java
if (name.isEmpty()) {
  return greeting();
}
```

### Oh, no... Whitespace???

`GreeterTest.java`

```java
@Test
void greetingWhitespacedString() {
    String actual = Greeter.greeting("\n\n\t\t\t\n");
    String expected = "Hello, World";

    assertEquals(expected, actual);
}
```

`Greeter.java`

```java
if (name.trim().isEmpty()) {
  return greeting();
}
```

## 🤔 Some refactor

Do we respect [DRY](https://en.wikipedia.org/wiki/Don%27t_repeat_yourself)?

Let's extract "Hello, " to constant:

```java
static final String PREFIX = "Hello, ";
```

## 🇪🇸 Hola, mundo

Let's add some diversity. What about greet in Spanish?

`GreeterTest.java`

```java
@Test
void greetingInSpanish() {
String actual = Greeter.greeting("Antonio", Greeter.Language.SPANISH);
String expected = "Hola, Antonio";

assertEquals(expected, actual);
}
```

Nothing compiles... Fix it.

`Greeter.java`

```java
public enum Language {
    ENGLISH,
    SPANISH
}

public static String greeting(String name, Language language) {
	...
}
```

## 👮🏻‍♂️ Order, please!

Let's group our tests with `@Nested`

```java
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
    void simpleGreeting() { ... }

    @Test
    void greetingWithName() { ... }

    @Test
    void greetingNull() { ... }

    @Test
    void greetingEmptyString() { ... }

    @Test
    void greetingWhitespacedString() { ... }
  }

  @Nested
  @DisplayName("Spanish")
  class Spanish {

    @Test
    void simpleGreeting() { ... }

  }

}
```

## 🙄 Hey, wait! `Hola, World`?

Should we support empty (default) greeting for Spanish?
Again, TDD, tests go first. 
Use/copy tests for English.

`GreeterTest.java`

```
@Nested
@DisplayName("Spanish")
class Spanish {
	@Test
	void simpleGreeting() { ... }
	
	@Test
	void greetingWithName() { ... }
	
	@Test
	void greetingNull() { ... }
	
	@Test
	void greetingEmptyString() { ... }
	
	@Test
	void greetingWhitespacedString() { ... }
}

```

Try to compile and run.

### 🛠 Fix Fix Fix

...

## ♻️ Refactor time!

```java
private static String prefixForLanguage(Language language) {
	return (language == Language.SPANISH) ? PREFIX_SPANISH : PREFIX_ENGLISH;
}
```

## 🇫🇷👨🏻‍🎨 Parlez-vous français?

Now it's your action time!

- Add support of French language
- Don't forget: `RED` - `GREEN` - `REFACTOR` (`TEST` - `IMPLEMENTATION` - `REFACTOR`)

### ✅ Let's check

- Do you support empty message `Salut, Monde`?
- Did you refactor `prefixForLanguage`?
- Did you create `worldForLanguage`?


## 💬 Discuss time

- Is `worldForLanguage` good name?
- What do you think about all this?
- How do you feel right now? Sounds like we have safety net?
- Did you feel that tests have their cost?
- How many times did you change test? implementation? 