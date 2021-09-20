package org.interfaceprog;

public class Sedan extends Car{
    int length;
    public Sedan(int Speed, double regularPrice, String color, int  length) {
        super(Speed, regularPrice, color);
        this.length=length;
    }
    public double getSalesPrice(){
        if(length>20)
        {
            return super.getSalePrice()-(0.5*super.getSalePrice());

        }else {
            return super.getSalePrice()-(0.1*super.getSalePrice());
        }
    }

}
