package com.game;

public class CattleFeed extends Food
{
    int Price = 200;
    int Quantity;

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
