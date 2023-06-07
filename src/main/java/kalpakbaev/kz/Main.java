package kalpakbaev.kz;

import java.util.Scanner;
import java.util.logging.Logger;

class ComplexNumber {
    private double a; // действительная часть
    private double b; // мнимая часть

    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public ComplexNumber add(ComplexNumber other) {
        double resultA = this.a + other.a;
        double resultB = this.b + other.b;
        return new ComplexNumber(resultA, resultB);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double resultA = this.a - other.a;
        double resultB = this.b - other.b;
        return new ComplexNumber(resultA, resultB);
    }

    @Override
    public String toString() {
        if (b >= 0) {
            return a + " + " + b + "i";
        } else {
            return a + " - " + Math.abs(b) + "i";
        }
    }
}


