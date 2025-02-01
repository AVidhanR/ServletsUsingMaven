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

> [!IMPORTANT]
> - This is a template to create a `Servlet` using `Maven` in `IntelliJ IDE`.
> - One can create either an `HTML` or a `JSP` file under the `webapp` directory.
> - Below is the directory structure of the project. Check for the `src` and `webapp` directories to create the `Servlet` and (`HTML` or `JSP`) files respectively.

```txt
Directory structure:
└── avidhanr-servletsusingmaven/
    ├── README.md
    ├── pom.xml
    ├── .prettierignore
    ├── .prettierrc
    ├── src/
    │   └── main/
    │       ├── java/
    │       │   └── com/
    │       │       └── itsvidhanreddy/
    │       │           └── ServletMiddlewareToAddData.java
    │       └── webapp/
    │           ├── index.html
    │           └── WEB-INF/
    │               └── web.xml
    └── .smarttomcat/
        └── ServletsUsingMaven/
            └── conf/
                ├── catalina.policy
                ├── catalina.properties
                ├── context.xml
                ├── jaspic-providers.xml
                ├── jaspic-providers.xsd
                ├── logging.properties
                ├── server.xml
                ├── tomcat-users.xml
                ├── tomcat-users.xsd
                └── web.xml
```

## Project Startup process

- `Step 1:` Install the latest `Apache Tomcat 11.x` from the [official]() site. or it can also be a `Apache Tomcat 10.x`

- Created and maintained by [_AVidhanR_](https://linkedin.com/in/AVidhanR)
