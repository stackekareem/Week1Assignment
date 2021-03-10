package com.weekone.assignment.shape;

public class Triangle implements Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){
        side1 = 3;
        side2 = 3;
        side3 = 3;
    }

    public Triangle(double side1, double side2, double side3) throws Exception
    {   if (!isValidSide(side1,side2,side3)) 
            throw new Exception("invalid side length");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public boolean isValidSide(double side1, double side2, double side3){
        if (side1 + side2 < side3) return false;
        if (side3 + side1 < side2) return false;
        if (side2 + side3 < side1) return false;
        return true; 
    }

    @Override
    public double calculateArea() {
        int p = (int) ((side1 + side2 + side3) / 2);
        return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
    }

    @Override
    public void display() {
        System.out.println("Triangle Area is "+calculateArea());
    }

}
