package com.weekone.assignment2.shape;

public class Rectangle implements Shape{
    
    //width and height
    private double width;
    private double height;

    public Rectangle(){
        width = 3;
        height = 3;
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void display() {
        System.out.println("Rectangle Area is "+calculateArea());
    }
}
