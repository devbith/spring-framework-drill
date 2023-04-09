package com.sample;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Runner {


 /**
  *  Example of object property on reference assigned to SpEL variable
  */
 public static void main(String[] args) {

  ExpressionParser expressionParser = new SpelExpressionParser();
  Expression expression = expressionParser.parseExpression("#person.name");

  Person personReference = new Person("Bishal");

  EvaluationContext evaluationContext = new StandardEvaluationContext();
  evaluationContext.setVariable("person", personReference);

  String value = (String) expression.getValue(evaluationContext);
 }

}

