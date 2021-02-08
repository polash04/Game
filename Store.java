package com.game;

import java.util.Scanner;

public class Store
{
    Scanner get = new Scanner(System.in);
    public Animal buyAnimal()
    {
        int choice;
        while(true)
        {
            System.out.println("\n\n  Enter 1 for Buy the Cat ");
            System.out.println("\n  Enter 2 for Buy the Dog ");
            System.out.println("\n  Enter 3 for Buy the Horse ");
            System.out.println("\n  Enter 4 for Buy the Cow ");
            System.out.println("\n  Enter 5 for Buy the Buffalo");
            choice = get.nextInt();

            if(choice==1)
            {
                Animal cat = new Cat();
            }
            else if(choice==2)
            {

            }
            else if(choice==3)
            {

            }
            else if(choice==4)
            {

            }
            else if(choice==5)
            {

            }
            else
            {

            }
        }
    }
    public void saleAnimal( Player player[], int player_num) {
        int choice;
        while (true) {
            System.out.println("\n\n  Enter 1 for Sale the Cat ");
            System.out.println("\n  Enter 2 for Sale the Dog ");
            System.out.println("\n  Enter 3 for Sale the Horse ");
            System.out.println("\n  Enter 4 for Sale the Cow ");
            System.out.println("\n  Enter 5 for Sale the Buffalo");
            choice = get.nextInt();
            if (choice == 1) {
                int total_cats = player[player_num].total_cat;
                if (total_cats == 0)
                {
                    System.out.println(" You has no Cat! You can sale other Animal.");
                } else {
                    double price;
                    price = (player[player_num].cats[total_cats-1].get_health()*player[player_num].cats[total_cats-1].get_price())/100;
                    double money = player[player_num].getMoney()+price;
                    player[player_num].total_cat = player[player_num].total_cat -1;
                    player[player_num].setMoney(money);
                    System.out.println(" The cat is sold: You get Money= "+price+"Rs and this amount is added tp your account!");
                    break;
                }
            } else if (choice == 2) {
                int total_dogs = player[player_num].total_dog;
                if (total_dogs == 0)
                {
                    System.out.println(" You has no Cat! You can sale other Animal.");
                } else {
                    double price;
                    price = (player[player_num].dogs[total_dogs-1].get_health()*player[player_num].dogs[total_dogs-1].get_price())/100;
                    double money = player[player_num].getMoney()+price;
                    player[player_num].setMoney(money);
                    player[player_num].total_dog = player[player_num].total_dog -1;
                    System.out.println(" The Dog is sold: You get Money= "+price+"Rs and this amount is added tp your account!");
                    break;
                }

            } else if (choice == 3) {
                int total_horses = player[player_num].total_horse;
                if (total_horses == 0)
                {
                    System.out.println(" You has no Horse! You can sale other Animal.");
                } else {
                    double price;
                    price = (player[player_num].horses[total_horses-1].get_health()*player[player_num].horses[total_horses-1].get_price())/100;
                    double money = player[player_num].getMoney()+price;
                    player[player_num].setMoney(money);
                    player[player_num].total_horse = player[player_num].total_horse -1;
                    System.out.println(" The Horse is soled: You get Money= "+price+"Rs and this amount is added tp your account!");
                    break;
                }

            } else if (choice == 4) {
                int total_cows = player[player_num].total_cow;
                if (total_cows == 0)
                {
                    System.out.println(" You has no Cow! You can sale other Animal.");
                } else {
                    double price;
                    price = (player[player_num].cows[total_cows-1].get_health()*player[player_num].cows[total_cows-1].get_price())/100;
                    double money = player[player_num].getMoney()+price;
                    player[player_num].setMoney(money);
                    player[player_num].total_cow = player[player_num].total_cow -1;
                    System.out.println(" The Cow is sold: You get Money= "+price+"Rs and this amount is added tp your account!");
                    break;
                }

            } else if (choice == 5) {
                int total_buffalos = player[player_num].total_buffalo;
                if (total_buffalos == 0)
                {
                    System.out.println(" You has no Buffalo! You can sale other Animal.");
                } else {
                    double price;
                    price = (player[player_num].buffaloes[total_buffalos-1].get_health()*player[player_num].buffaloes[total_buffalos-1].get_price())/100;
                    double money = player[player_num].getMoney()+price;
                    player[player_num].setMoney(money);
                    player[player_num].total_buffalo = player[player_num].total_buffalo -1;
                    System.out.println(" The Buffalo is Sold: You get Money= "+price+"Rs and this amount is added tp your account!");
                    break;
                }

            } else {
                System.out.println(" You entered invalid choice! Enter correct choice. Thanks.");
            }
        }
    }
    public void  buyFood()
    {
        
    }
}
