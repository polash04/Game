package com.game;

abstract class Animal
{

    abstract void set_data(String name, String gender);
    abstract void set_health(int health);
    abstract void set_price(double price);
    abstract String get_name();
    abstract String get_gender();
    abstract double get_price();
    abstract int get_health();
}
