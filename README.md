# TDD in Java

This repository created for workshop **TDD with Java with JUnit 5**

🙏 Inspired by chapter [Hello, World](https://quii.gitbook.io/learn-go-with-tests/go-fundamentals/hello-world) from great book [Learn Go with tests](https://quii.gitbook.io/learn-go-with-tests/go-fundamentals/hello-world) ❤️.

## Requirements

| Tool | Version |
|---|---|
| **Java** | `8` |
| **Gradle** | `6` |

<details><summary>Check your Java version</summary>

```terminal
java -version
openjdk version "1.8.0_242"
OpenJDK Runtime Environment (AdoptOpenJDK)(build 1.8.0_242-b08)
OpenJDK 64-Bit Server VM (AdoptOpenJDK)(build 25.242-b08, mixed mode)
```

</details>

<details><summary>Check your Gradle version</summary>

```terminal
gradle --version

Welcome to Gradle 6.2.2!

Here are the highlights of this release:
 - Dependency checksum and signature verification
 - Shareable read-only dependency cache
 - Documentation links in deprecation messages

For more details see https://docs.gradle.org/6.2.2/release-notes.html


------------------------------------------------------------
Gradle 6.2.2
------------------------------------------------------------

Build time:   2020-03-04 08:49:31 UTC
Revision:     7d0bf6dcb46c143bcc3b7a0fa40a8e5ca28e5856

Kotlin:       1.3.61
Groovy:       2.5.8
Ant:          Apache Ant(TM) version 1.10.7 compiled on September 1 2019
JVM:          13.0.2 (Oracle Corporation 13.0.2+8)
OS:           Mac OS X 10.15.5 x86_64
```

</details>

## 🤔 How to...

### run the app?

```
$ gradle run
```

### run the tests?

```
$ gradle clean test
```

If you see `BUILD SUCCESSFUL` - your tests passed.  
But if you see `BUILD FAILED` - bad news, some tests failed.