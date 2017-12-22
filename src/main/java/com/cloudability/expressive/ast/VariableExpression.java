package com.cloudability.expressive.ast;

public class VariableExpression extends Expression {

    private final String identifier;
    
    public VariableExpression(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return String.format("VariableExpression(%s)", identifier);
    }
    
}