package org.interfaceprog;

public class MyOwnAutoShop {
    public static void main(String args[]){
        Sedan mysedan = new Sedan(160,34000,"Red",30);
        Ford myFord1 = new Ford (156,4452.0,"White", 2021,4);
        Ford myFord2 = new Ford (155,5000.0, "Green",1998, 5);
        Car myCar =new Car (555, 56856.0,"Blue");

        System.out.println("My Sedan Price :" +mysedan.getSalesPrice());
        System.out.println("My Ford1 Price :" +myFord1.getSalePrice());
        System.out.println("My Ford2 Price:" +myFord2.getSalePrice());
        System.out.println("My Car   Price :" +myCar.getSalePrice());
    }
}
