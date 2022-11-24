#### Spring bean and container lifecycle

1. Application is started.
2. Spring Container is created.
3. Container reads configuration.
4. Beans definition are created from configuration.
5. BeanFactoryPostProcessors are processing beans definitions.
6. Instances of spring beans are created.
7. Spring beans are configured and assembled - resolve property values and inject dependencies.
8. BeanPostProcessor are called.
9. Application runs.
10. Application gets shutdown.
11. Spring Context is closed.
12. Destruction callbacks are called.

#### What is the concept of container?
Container are execution environment which provides additional technical aspects or services to run the code and allows
you to focus on business aspect of the code. 

In spring, spring provides container for beans. spring container manages bean lifecycle of the bean and also provides
additional service through the usage of application context.
