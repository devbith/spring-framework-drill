### Lifecycle of Spring Bean in ApplicationContext (BeanFactory)

Application Context (BeanFactory) is created:

1. BeanDefinitions are created based on Spring bean configuration metadata.
2. BeanFactoryPostProcessor are invoked.


Bean is created:

1. Instance of bean is created.
2. Properties and dependencies are set.
3. BeanPostProcessor::postProcessBeforeInitialization method gets called.
4. @PostConstruct method gets called.
5. InitializingBean::afterProperties method gets called.
6. @Bean(initMethod) gets called.
7. BeanPostProcessor:postProcessAfterInitialization method gets called.

Bean is ready for use ✔

Bean Destroy:

1. @PreDestroy method gets called.
2. DisposableBean::destroy method gets called.
3. @Bean(destroyMethod) gets called.