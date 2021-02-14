package com.company.lambda;

public class GenericMethodRefDemo {
    static <T> int MyOp(MyFuncG<T> f, T[] vals, T v){
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer [] vals = {1,2,3,4,2,3,4,4,5};
        String [] strs = {"Один", "Два","Три","Два"};

        int count;
        count = MyOp(MyArrayOps::<Integer>countMatching, vals, 4);
        System.out.println("Массив vals содержит : " + count + " числа 4");

        count = MyOp(MyArrayOps::<String>countMatching, strs, "Два");
        System.out.println("Массив strs содержит: " + count + " числа два");
    }
}
