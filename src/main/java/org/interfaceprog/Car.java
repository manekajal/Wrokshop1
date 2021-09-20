package org.interfaceprog;

public class Car {

    public int speed = 0;
    public double regularPrice=0.0;
    String color;

    public Car (int Speed, double regularPrice, String color) {
        this.speed = Speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    public double getSalePrice(){
        return 0;
    }
}
