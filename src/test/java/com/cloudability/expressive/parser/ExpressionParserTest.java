package com.cloudability.expressive.parser;

import org.junit.Test;
import org.junit.Assert;

import com.cloudability.expressive.ast.Expression;

public class ExpressionParserTest {

    @Test
    public void testNumberLiteral() {
        check("1", "NumberLiteral(1.0)");
    }

    @Test
    public void testNumberAddNumber() {
        check("1+2", "BinaryExpression(NumberLiteral(1.0),PLUS,NumberLiteral(2.0))");
    }

    @Test
    public void testNumberMultNumberAddNumber() {
        check("2*3+4", "BinaryExpression(BinaryExpression(NumberLiteral(2.0),MULTIPLY,NumberLiteral(3.0)),PLUS,NumberLiteral(4.0))");
    }

    private void check(String expression, String expressionToString) {
    	ExpressionParser parser = new ExpressionParser(expression);
    	Expression e = parser.parse();
    	Assert.assertEquals(e.toString(), expressionToString);
    }

}