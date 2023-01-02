``@FunctionalInterface``
public interface BeanFactoryPostProcessor


Factory hook that allows for custom modification of an application context's bean definitions, adapting the bean property values of the context's underlying bean factory.
Useful for custom config files targeted at system administrators that override bean properties configured in the application context. See PropertyResourceConfigurer and its concrete implementations for out-of-the-box solutions that address such configuration needs.


A BeanFactoryPostProcessor may interact with and modify bean definitions, but never bean instances. Doing so may cause premature bean instantiation, violating the container and causing unintended side effects. If bean instance interaction is required, consider implementing BeanPostProcessor instead.


###### Registration
An ApplicationContext auto-detects BeanFactoryPostProcessor beans in its bean definitions and applies them before any other beans get created. A BeanFactoryPostProcessor may also be registered programmatically with a ConfigurableApplicationContext.

###### Ordering
BeanFactoryPostProcessor beans that are autodetected in an ApplicationContext will be ordered according to PriorityOrdered and Ordered semantics. In contrast, BeanFactoryPostProcessor beans that are registered programmatically with a ConfigurableApplicationContext will be applied in the order of registration; any ordering semantics expressed through implementing the PriorityOrdered or Ordered interface will be ignored for programmatically registered post-processors. Furthermore, the @Order annotation is not taken into account for BeanFactoryPostProcessor beans.


Source: https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/config/BeanFactoryPostProcessor.html