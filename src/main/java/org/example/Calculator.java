package org.example;

import java.util.function.Supplier;

public class Calculator implements Supplier {
    static Supplier<Calculator> instance = Calculator::new;

    @Override
    public Object get() {
        return null;
    }
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

}
