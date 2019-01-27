package com.kodilla.simplecalculator;

public class SimplecalculatorApplication {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.addAtoB(4,5);
        System.out.print(result);
    }

}

