package org.example;

public class Dish {
    String dish_name;
    String type;
    int price;
    int id;

    Dish(int id,String dish_name,String type,int price){
        this.id = id;
        this.dish_name = dish_name;
        this.type = type;
        this.price = price;
    }
}
