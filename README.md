## Servlets using `Maven`

- This requires `Maven` to be installed in your system, which can be obtainer via intellij IDE (Community/Ultimate) or from the official website of `Maven`.
- This project is a simple demonstration of how to create a `Servlet` using `Maven` in `IntelliJ IDE`.
- Check the `dependencies` in the [`pom.xml`](./pom.xml) file. The below are the new dependencies to be added in you `pom.xml` file.

```xml
    <!-- https://mvnrepository.com/artifact/jakarta.servlet/jakarta.servlet-api -->
    <dependency>
      <groupId>jakarta.servlet</groupId>
      <artifactId>jakarta.servlet-api</artifactId>
      <version>6.1.0</version>
      <scope>provided</scope>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.apache.tomcat.embed/tomcat-embed-core -->
    <dependency>
      <groupId>org.apache.tomcat.embed</groupId>
      <artifactId>tomcat-embed-core</artifactId>
      <version>11.0.2</version>
    </dependency>
```

- This is a template to create a `Servlet` using `Maven` in `IntelliJ IDE`.
- Created and maintained by, [$$AVidhanR$$](https://linkedin.com/in/AVidhanR)
