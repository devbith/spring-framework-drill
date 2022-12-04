## Spring bean and container lifecycle

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


## What is the concept of container?
Container are execution environment which provides additional technical aspects or services to run the code and allows
you to focus on business aspect of the code. 

In spring, spring provides container for beans. spring container manages bean lifecycle of the bean and also provides
additional service through the usage of application context.


## What is Bean Definition in Spring?
In Spring, a bean definition describes bean instance, which has property values, constructor arguments values and further
information supplied by concrete implementations.

Bean definition contains the information called configuration metadata, which is needed for the container to know the following −

- How to create a bean
- Bean's lifecycle details
- Bean's dependencies


## Bean Lifecycle

                   Load Bean Definitions 
    --------------------------------------------------------------
    | Bean Definitions Loaded ---> Post Process Bean Definitions |
    --------------------------------------------------------------
                              |
                              |
                      Create and Assembled Beans
             ----------------------------------------
             | Instantiate Beans --> Setter Called  |  
             ----------------------------------------
                              |
                              | 
                     Bean Post Processor
              ------------------------------------ 
              |  BPP      Initializer   BPP      |
              ------------------------------------ 
                              |
                    ------------------------
                    |  Bean Ready For Use  |
                    ------------------------
                       
#### Load Bean Definitions Phase:
- The @Configuration classes are processed and @Components are scanned and XML files are parsed.
- Beandefinitions are added to BeanFactory.
- Special BeanFactoryPostProcessor beans invoked, it can modify the definition of any bean (for example for
  the property-placeholder values replacements).

#### Bean Creation Phase:
- Each bean is egerly instantiated by default (created in right order with its dependencies injected).
- After dependencies injection each beans goes through a post-processing phase in which further configuration
  and initilization may occur.
- After post processing the bean is fully initialized and ready for use (tracked by its id until the context is destroyed).

### Bean Post Processor:
- Pass the bean instance to the postProcessBeforeInitialization() method of each bean post processor.
- Call the initialization callback methods.
- Pass the bean instance to the postProcessAfterInitialization() method of each bean post processor.

#### Bean Ready For Use:


























source: https://stackoverflow.com/questions/29743320/how-exactly-does-the-spring-beanpostprocessor-work
