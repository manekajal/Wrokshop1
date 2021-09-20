package org.interfaceprog;

public class Ford extends Car{
    int year;
    int manufacturerDiscount;
    public Ford(int Speed, double regularPrice, String color , int year,int manufacturerDiscount) {
        super(Speed, regularPrice, color);
        this.year=year;
        this.manufacturerDiscount=manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {

        return (super.getSalePrice()-manufacturerDiscount);
    }
}
