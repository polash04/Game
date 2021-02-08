package com.game;

import javax.lang.model.type.NullType;
import java.util.Scanner;

public class Player
{
    String Name;
    double Money;
    double final_amount;
    Animal[] cats = new Cat[10];
    Animal[] dogs = new Dog[10];
    Animal[] horses = new Horse[10];
    Animal[] buffaloes = new Buffalo[10];
    Animal[] cows = new Cow[10];

    int total_dog, total_cat, total_horse, total_cow, total_buffalo;


    Food fruits = new Fruits();
    Food vegetables = new Vegetables();
    Food cattlefeeds = new CattleFeed();

    public void setName(String name)
    {
        Name=name;
    }
    public void setMoney(double money)
    {
        Money=money;
    }
    public void setData(String name, double money)
    {
        Name = name;
        Money = money;
    }
    public String getName()
    {
        return Name;
    }
    public double getMoney()
    {
        return Money;
    }
    public void setFinal_amount(double amount)
    {
        final_amount = amount;
    }
    public double getFinal_amount()
    {
        return final_amount;
    }
}
