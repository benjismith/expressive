package com.cloudability.expressive.ast;

public class StringLiteral extends Expression {

    private final String value;

    public StringLiteral(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("StringLiteral(%s)", value);
    }
    
}