### What is an initialization method and how is it declared on a Spring bean?

Initialization method is a method that you can write for Spring Bean if you need to perform some initialization code that depends on properties and/or dependencies injected into Spring Bean.
You can declare Initialization method in three ways:
- Create method in Spring Bean annotated with @PostConstruct
- Implement InitializingBean::afterPropertiesSet
- Create Bean in Configuration class with @Bean method and use @Bean(initMethod)