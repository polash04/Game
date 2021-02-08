package com.game;

public class Fruits extends Food
{
    int Price;
    int Quantity;
    Fruits()
    {
        Price = 200;
        Quantity = 0;
    }
    @Override
    int get_price()
    {
        return Price;
    }

    @Override
    void set_quantity(int quantity)
    {
        Quantity = quantity;
    }

    @Override
    int get_quantity()
    {
        return Quantity;
    }
}
