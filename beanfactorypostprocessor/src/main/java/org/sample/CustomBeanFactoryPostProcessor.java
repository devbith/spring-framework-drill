package org.sample;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

  /**
   * Modify the application context's internal bean factory after its standard initialization. All bean definitions will have been loaded,
   * but no beans will have been instantiated yet. This allows for overriding or adding properties even to eager-initializing beans.
   */
  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
    for (String beanName : beanFactory.getBeanDefinitionNames()) {
      BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
      if (isBeanUnderThisPackage(beanDefinition, "org.sample.beans")) {
        beanDefinition.setScope("prototype");
      }
    }
  }

  private boolean isBeanUnderThisPackage(BeanDefinition beanDefinition, String packagePath) {
    return beanDefinition.getBeanClassName() != null && beanDefinition.getBeanClassName().contains(packagePath);
  }

}
