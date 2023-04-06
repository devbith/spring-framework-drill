package com.sample;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Runner {

 public static void main(String[] args) {

  ExpressionParser expressionParser = new SpelExpressionParser();

  EvaluationContext evaluationContext;

  Expression expression = expressionParser.parseExpression("'Hello Spel'.concat(' langauge ')");

  String value = (String) expression.getValue();

  System.out.println(value);

 }

}

