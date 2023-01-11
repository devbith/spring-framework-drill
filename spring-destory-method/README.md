### What is a destroy method, how is it declared?
Destroy method is a method in Spring Bean that you can use to implement any cleanup logic for resources used by the Bean. Method will be called when Spring Bean will be taken out of use, this is usually happening when Spring Context is closed.
You can declare destroy method in following ways:
- Create method annotated with @PreDestroy annotation
- Implement DisposableBean::destroy
- Create Bean in Configuration class with @Bean method and use @Bean(destroyMethod)