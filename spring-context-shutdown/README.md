#### What is the preferred way to close an application-context?

##### Standalone Non-web application

1. Register Shutdown hook by calling ConfigurableApplicationContext::registerShutdownHook (Recommended way)
2. Call ConfigurableApplicationContext::close

#### Web application

1. ContextLoaderListener will automatically close context when web container will stop web application.

#### Spring Boot

1. Application Context will be automatically closed.
2. Shutdown hook will be automatically registered.
3. ContextLoaderListener applies to Spring Boot Web Applications as well.


#### Why a application-context should be closed?
It is important to close the context properly because different lifecycle methods like destroy() must have the chance to run. 
Consequently, the application can release the resources and do some clean-up.
