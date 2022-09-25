package org.example;

import java.util.function.Supplier;

public class Main
{
    public static void main( String[] args ) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(7,2);
        int b = calc.minus.apply(3,1);
        int c = calc.devide.apply(a,b);

        calc.println.accept(c);
    }
}
