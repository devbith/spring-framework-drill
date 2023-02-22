package com.sample;

import com.sample.beans.SpringBean1;
import com.sample.beans.SpringBean2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Runner {

 /**
  *  Add the below VM property when running the main method
  * -Dapp.vm.property=Property from VM parameter
  */
 public static void main(String[] args) {

  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


  ExpressionParser parser = new SpelExpressionParser();
  StandardEvaluationContext evaluationContext = new StandardEvaluationContext();
  evaluationContext.setBeanResolver(new BeanFactoryResolver(context));

  SpringBean1 springBean1 = context.getBean(SpringBean1.class);

  System.out.println("getStaticMethodExecutionResult(): " + springBean1.getStaticMethodExecutionResult());
  System.out.println("getStaticValueFetchResult(): " + springBean1.getStaticValueFetchResult());
  System.out.println("getPropertyValue(): " + springBean1.getPropertyValue());
  System.out.println("getMethodValue(): " + springBean1.getMethodValue());
  System.out.println("getAppFileProperty(): " + springBean1.getAppFileProperty());
  System.out.println("getAppVmProperty(): " + springBean1.getAppVMProperty());
  System.out.println("getJavaHome(): " + springBean1.getJavaHome());

  evaluationContext.setVariable("firstName", "John");
  evaluationContext.setVariable("objectRef", context.getBean(SpringBean2.class));

  System.out.println("#firstName: " + parser.parseExpression("#firstName").getValue(evaluationContext));
  System.out.println("#objectRef.property: " + parser.parseExpression("#objectRef.property").getValue(evaluationContext));
  System.out.println("#objectRef.method(): " + parser.parseExpression("#objectRef.method()").getValue(evaluationContext));

 }

}

