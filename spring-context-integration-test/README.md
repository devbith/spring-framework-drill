Integration testing can be done easily with spring framework.

### Create application-context (bean-factory) in an integration-test

1. We need to have below dependency.
```
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-test</artifactId>
      <version>5.3.23</version>
      <scope>test</scope>
    </dependency>
```
2. Add SpringRunner in test class.

``@RunWith(SpringRunner.class) ``


3. Add context configuration to the test class. 

`` @ContextConfiguration() ``