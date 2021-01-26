package com.company.oop.classObj;

public class VectorEx {
    private double x;
    private double y;
    private double z;

    public VectorEx(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double vectorLength(){
        return Math.sqrt(x * x + y * y + z * z);
    }
}
