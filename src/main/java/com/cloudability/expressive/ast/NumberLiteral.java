package com.cloudability.expressive.ast;

public class NumberLiteral extends Expression {

    public static final double PI_VALUE = Math.PI;
    public static final double EULER_VALUE = Math.E;
    public static final double I_VALUE = 0; // TODO

    private final double value;

    public NumberLiteral(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("NumberLiteral(%s)", value);
    }

}