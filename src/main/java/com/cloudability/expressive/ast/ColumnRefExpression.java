package com.cloudability.expressive.ast;

public class ColumnRefExpression extends Expression {

    private final String identifier;
    private final String columnName;

    public ColumnRefExpression(String identifier, String columnName) {
        this.identifier = identifier;
        this.columnName = columnName;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getColumnName() {
        return columnName;
    }

    @Override
    public String toString() {
        return String.format("ColumnRefExpression(%s,%s)", identifier, columnName);
    }
    
}