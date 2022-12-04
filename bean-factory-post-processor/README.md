
### The BeanFactory is the actual container which instantiates, configures, and manages a number of beans.

### BeanDefinition
Bean definitions inside a DefaultListableBeanFactory variant (like XmlBeanFactory) are represented as BeanDefinition objects, 
which contain (among other information) the following details:

- a class name: this is normally the actual implementation class of the bean being described in the bean definition.
However, if the bean is to be constructed by calling a static factory method instead of using a normal constructor, this will 
actually be the class name of the factory class.

- bean behavioral configuration elements, which state how the bean should behave in the container
(i.e. prototype or singleton, autowiring mode, dependency checking mode, initialization and destruction methods)

- constructor arguments and property values to set in the newly created bean. An example would be the number of 
connections to use in a bean that manages a connection pool (either specified as a property or as a constructor argument), or the pool size limit.

- other beans a bean needs to do its work, i.e. collaborators (also specified as properties or as constructor arguments).
These can also be called dependencies.



```
Spring BeanFactoryPostProcessor works on the bean definitions or configuration meta data 
of the bean before beans are actually created. With BeanFactoryPostProcessor we can modify exiting bean 
definitions or create our new bean definitions.

 The BeanFactory provides an advanced configuration mechanism capable of managing beans (objects) of any nature, 
using potentially any kind of storage facility.
```



