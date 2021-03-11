package com.weekone.assignment2.shape;

/**
* circle shpae
*/
public class Circle implements Shape{
    //radius
    private double radius;

    public Circle(){
        this.radius = 3;
    }

    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return 3.14 * (radius * radius);
    }

    @Override
    public void display() {
        System.out.println("Circle Area is "+calculateArea());
    }
    
}
