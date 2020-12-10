package com.company;

public class Operation {

    double a;
    double b;
    String type;
    Double result;

    public Operation(double a, double b, String type, Double result) {
        this.a = a;
        this.b = b;
        this.type = type;
        this.result = result;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "a=" + a +
                ", b=" + b +
                ", type='" + type + '\'' +
                ", result=" + result +
                '}';
    }
}
