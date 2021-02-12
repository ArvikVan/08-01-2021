package com.company.lambda;

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n % 2)==0;//лямда проверяет является ли число четным

        if (isEven.test(10)) System.out.println("Число 10 четное");
        if (!isEven.test(9)) System.out.println("Число 9 нечетное");

        NumericTest isNonNeg = (n) -> n >= 0;//лямбда проверят является ли n неотрицательным
        if (isNonNeg.test(1)) System.out.println("Число положительное");
        if (!isNonNeg.test(-1)) System.out.println("Число отрицательное");


    }
}
