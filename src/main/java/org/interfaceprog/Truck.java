package org.interfaceprog;


public class Truck extends Car {
    int weight;

    public Truck(double regularPrice, int speed, String color, int weight) {
        super(speed,regularPrice,color);

        this.weight = weight;
    }


    public double getRegularPrice() {
        if (weight > 2000) {
            double discount = 0.1 * super.getSalePrice();

            return super.getSalePrice()-discount;
        } else {
            return super.getSalePrice();
        }
    }

}
