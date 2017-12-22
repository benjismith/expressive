package com.cloudability.expressive.ast;

import java.util.List;

import com.google.common.base.Joiner;

public class FunctionExpression extends Expression {

    private final String identifier;
    private final List<Expression> arguments;
    
    public FunctionExpression(String identifier, List<Expression> arguments) {
        this.identifier = identifier;
        this.arguments = arguments;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getArguments() {
        return identifier;
    }

    @Override
    public String toString() {
        return String.format("FunctionExpression(%s,%s)", identifier, Joiner.on(",").join(arguments));
    }
}