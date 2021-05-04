package com.company.bases;

public class FloatType {
    public static void main(String[] args) {
        float a = 2.3f;
        double b = 2.3; //по умолчанию все дробные литералы имеют тип double
        // и если нужен тип float (он меньше) то ставится в конце f
        System.out.println(a + " " + b);
    }
}
