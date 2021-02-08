package com.game;

import java.util.*;


public class Game
{
    int rounds, players;
    Player[] gameplayers = new Player[4];
    public void GamePlay()
    {
        Scanner get = new Scanner(System.in);
        // Game loop
        while(true)
        {
            System.out.println("How many rounds do you want to play? (5 - 30): ");
            rounds = get.nextInt();
            //check the range of rounds
            if (rounds < 5 || rounds > 30) {
                //continues loop if invalid number of rounds are entered until correct number of rounds are given
                System.out.println("Invalid Number of Rounds.\n Enter Valid numbers of rounds between 5 - 30");
                continue;
            } else {
                break;
            }
        }

        //loop for checking the correct number of players
        while (true)
        {
            //check the range of players
            System.out.println("How many players are there?: (1 - 4) ");
            players = get.nextInt();
            if (players > 4 || players < 1)
            {
                //continues loop if invalid number of players are entered until correct number of players are given
                System.out.println("Invalid number of players.\n Enter valid number of players between 1 to 4");
                continue;
            }
            else
            {
                int i=0;
                String name;
                double money;

                while(i<players)
                {
                    gameplayers[i] = new Player();
                    if(i==0)
                    {
                        System.out.println("\nEnter data of " + (i+1) + " player ");
                        System.out.println("Enter the name of " + (i+1) + " player= ");
                        get.nextLine();
                        name = get.nextLine();

                        System.out.println("Enter the money of " + (i+1) + " players= ");
                        money = get.nextDouble();

                        gameplayers[i].setData(name, money);
                        i++;
                    }
                    else
                    {
                        System.out.println("\nEnter data of " + (i+1) + " player ");
                        System.out.println("Enter the name of " + (i+1) + " players= ");
                        get.nextLine();
                        name = get.nextLine();

                        System.out.println("\nThe money for "+ (i+1) +" player is same as for the 1st player ");
                        money = gameplayers[0].Money;

                        gameplayers[i].setData(name, money);
                        i++;
                    }
                }
                break;
            }
        }

        int start;    //This variable is used to handle the loop which is used to start the game rounds
        while(true)
        {
            System.out.println("\nLet's Start the Game? Enter 1 to start the Game=  ");
            start = get.nextInt();

            if(start == 1)
            {
                for (int j = 1; j <= rounds; j++) //this loop handles the game rounds
                {
                    for (int k = 0; k < players; k++) //this loops handles the players
                    {
                        if(j==1)
                        {
                            gameplayers[k].total_cat=0;
                            gameplayers[k].total_dog=0;
                            gameplayers[k].total_horse=0;
                            gameplayers[k].total_cow=0;
                            gameplayers[k].total_buffalo=0;
                        }
                        else
                        {
                            int cats = gameplayers[k].total_cat;
                            int dogs = gameplayers[k].total_dog;
                            int horses = gameplayers[k].total_horse;
                            int cows = gameplayers[k].total_cow;
                            int buffalos = gameplayers[k].total_buffalo;
                            if(cats==0)
                            {
                                System.out.print("\n Player " + (k+1) + " has the Cats= 0");
                            }
                            else
                            {
                                System.out.println("\n Player " + (k+1) + " has the Cats ");
                                for(int i=0;i<(gameplayers[k].total_cat);i++)
                                {
                                    System.out.println(" Cat"+(i+1)+" = ( 'Name='"
                                            + gameplayers[k].cats[i].get_name() + "' Gender='"
                                            + gameplayers[k].cats[i].get_gender() + "' Health="
                                            + gameplayers[k].cats[i].get_health() + "% Price="
                                            + gameplayers[k].cats[i].get_price());
                                }
                            }
                            if(dogs==0)
                            {
                                System.out.print("\n Player " + (k+1) + " has the Dogs= 0");
                            }
                            else
                            {
                                System.out.println("\n Player " + (k+1) + " has the Dogs ");
                                for(int i=0;i<gameplayers[k].total_dog;i++)
                                {
                                    System.out.println(" Dog"+(i+1)+" = ( 'Name='"
                                            + gameplayers[k].dogs[i].get_name() + "' Gender='"
                                            + gameplayers[k].dogs[i].get_gender() + "' Health="
                                            + gameplayers[k].dogs[i].get_health() + "% Price="
                                            + gameplayers[k].dogs[i].get_price());
                                }
                            }
                            if(horses==0)
                            {
                                System.out.print("\n Player " + (k+1) + " has the Horses= 0");
                            }
                            else
                            {
                                System.out.println("\n Player " + (k+1) + " has the Horses ");
                                for(int i=0;i<gameplayers[k].total_horse;i++)
                                {
                                    System.out.println(" Horse"+(i+1)+" = ( 'Name='"
                                            + gameplayers[k].horses[i].get_name() + "' Gender='"
                                            + gameplayers[k].horses[i].get_gender() + "' Health="
                                            + gameplayers[k].horses[i].get_health() + "% Price="
                                            + gameplayers[k].horses[i].get_price());
                                }
                            }
                            if(cows==0)
                            {
                                System.out.print("\n Player " + (k+1) + " has the Cows= 0");
                            }
                            else
                            {
                                System.out.println("\n Player " + (k+1) + " has the Cows ");
                                for(int i=0;i<gameplayers[k].total_cow;i++)
                                {
                                    System.out.println(" Cows"+(i+1)+" = ( 'Name='"
                                            + gameplayers[k].cows[i].get_name() + "' Gender='"
                                            + gameplayers[k].cows[i].get_gender() + "' Health="
                                            + gameplayers[k].cows[i].get_health() + "% Price="
                                            + gameplayers[k].cows[i].get_price());
                                }
                            }
                            if(buffalos==0)
                            {
                                System.out.print("\n Player " + (k+1) + " has the Buffalos= 0");
                            }
                            else
                            {
                                System.out.println("\n Player " + (k+1) + " has the Buffalos ");
                                for(int i=0;i<gameplayers[k].total_buffalo;i++)
                                {
                                    System.out.println(" Buffalos"+(i+1)+" = ( 'Name='"
                                            + gameplayers[k].buffaloes[i].get_name() + "' Gender='"
                                            + gameplayers[k].buffaloes[i].get_gender() + "' Health="
                                            + gameplayers[k].buffaloes[i].get_health() + "% Price="
                                            + gameplayers[k].buffaloes[i].get_price());
                                }
                            }
                            System.out.println("\n Player " + (k+1) + " has the Fruits= "+gameplayers[k].fruits.get_quantity()+"kg");
                            System.out.println("\n Player " + (k+1) + " has the Vegetables= "+gameplayers[k].vegetables.get_quantity()+"kg");
                            System.out.println("\n Player " + (k+1) + " has the CattleFeed= "+gameplayers[k].cattlefeeds.get_quantity()+"kg");


                        }
                        while (true) //this loop is used to handle the game points
                        {
                            int choice;
                            System.out.println("\n " + j + " Round of the Game for Player " + (k+1) + "  ");
                            System.out.println(" Enter 1 for Buy the Animals from Store");
                            System.out.println(" Enter 2 for Buy the Food ");
                            System.out.println(" Enter 3 for Feeds their Animals ");
                            System.out.println(" Enter 4 for Buy/Sale Animal to Other Players ");
                            System.out.println(" Enter 5 for Sale the Animals to Store ");
                            choice = get.nextInt();
                            if (choice == 1) //this condition is used to check that can player wants to buy the Animal?
                            {
                                while (true) //this loop is used to handle the control of Buy the Animals
                                {
                                    int choice2; //this variable is used to select the Animal Type
                                    System.out.println("\n Enter 1 for Buy the Cat ");
                                    System.out.println(" Enter 2 for Buy the Dog ");
                                    System.out.println(" Enter 3 for Buy the Horse ");
                                    System.out.println(" Enter 4 for Buy the Cow ");
                                    System.out.println(" Enter 5 for Buy the  ");
                                    choice2 = get.nextInt();
                                    if (choice2 == 1)
                                    {
                                        if (gameplayers[k].getMoney()>=3000)
                                        {
                                            gameplayers[k].cats[gameplayers[k].total_cat] = new Cat();
                                            String name, gender;
                                            System.out.println("\n Enter the Cat Name= ");
                                            get.nextLine(); name = get.nextLine();
                                            System.out.println(" Gender of Cat: Enter 1 for Female and 2 for Male:  ");
                                            int gen;
                                            while(true)
                                            {
                                                gen = get.nextInt();
                                                if(gen ==1)
                                                {
                                                    gender = "Female";
                                                    break;
                                                }
                                                else if(gen==2)
                                                {
                                                    gender = "Male";
                                                    break;
                                                }
                                                else
                                                {
                                                    System.out.println("\n You entered incorrect choice " +
                                                            "\n Please select correct choice for Gender. Thanks ");
                                                }
                                            };
                                            gameplayers[k].cats[gameplayers[k].total_cat].set_data(name, gender);
                                            System.out.println(" You Buy a Cat ( 'Name='"
                                                    + gameplayers[k].cats[gameplayers[k].total_cat].get_name() + "' Gender='"
                                                    + gameplayers[k].cats[gameplayers[k].total_cat].get_gender() + "' Health="
                                                    + gameplayers[k].cats[gameplayers[k].total_cat].get_health() + "% Price="
                                                    + gameplayers[k].cats[gameplayers[k].total_cat].get_price());
                                            gameplayers[k].total_cat = gameplayers[k].total_cat+1;
                                            System.out.println(" You Buy a"+gameplayers[k].total_cat+" Total cats");
                                            break;
                                        }
                                        else
                                        {
                                            System.out.println("\n You don't have enough money to buy a Cat" +
                                                    "\n Please perform another action. Thanks ");
                                        }
                                    } else if (choice2 == 2)
                                    {
                                        if (gameplayers[k].getMoney()>=5000)
                                        {
                                            gameplayers[k].dogs[gameplayers[k].total_dog] = new Dog();
                                            String name, gender;
                                            System.out.println("\n Enter the Dog Name= ");
                                            get.nextLine(); name = get.nextLine();
                                            System.out.println(" Gender of Dog: Enter 1 for Female and 2 for Male:  ");
                                            int gen;
                                            while(true)
                                            {
                                                gen = get.nextInt();
                                                if(gen ==1)
                                                {
                                                    gender = "Female";
                                                    break;
                                                }
                                                else if(gen==2)
                                                {
                                                    gender = "Male";
                                                    break;
                                                }
                                                else
                                                {
                                                    System.out.println("\n You entered incorrect choice " +
                                                            "\n Please select correct choice for Gender. Thanks ");
                                                }
                                            };
                                            gameplayers[k].dogs[gameplayers[k].total_dog].set_data(name, gender);
                                            System.out.println(" You Buy a Dog ( 'Name='"
                                                    + gameplayers[k].dogs[gameplayers[k].total_dog].get_name() + "' Gender='"
                                                    + gameplayers[k].dogs[gameplayers[k].total_dog].get_gender() + "' Health="
                                                    + gameplayers[k].dogs[gameplayers[k].total_dog].get_health() + "% Price="
                                                    + gameplayers[k].dogs[gameplayers[k].total_dog].get_price());
                                            gameplayers[k].total_dog = gameplayers[k].total_dog+1;
                                            break;
                                        }
                                        else
                                        {
                                            System.out.println("\n You don't have enough money to buy a Dog " +
                                                    "\n Please perform another action. Thanks ");
                                        }

                                    } else if (choice2 == 3)
                                    {
                                        if (gameplayers[k].getMoney()>=15000)
                                        {
                                            gameplayers[k].horses[gameplayers[k].total_horse] = new Horse();
                                            String name, gender;
                                            System.out.println("\n Enter the Horse Name= ");
                                            get.nextLine(); name = get.nextLine();
                                            System.out.println(" Gender of Horse: Enter 1 for Female and 2 for Male:  ");
                                            int gen;
                                            while(true)
                                            {
                                                gen = get.nextInt();
                                                if(gen ==1)
                                                {
                                                    gender = "Female";
                                                    break;
                                                }
                                                else if(gen==2)
                                                {
                                                    gender = "Male";
                                                    break;
                                                }
                                                else
                                                {
                                                    System.out.println("\n You entered incorrect choice " +
                                                            "\n Please select correct choice for Gender. Thanks ");
                                                }
                                            };
                                            gameplayers[k].horses[gameplayers[k].total_horse].set_data(name, gender);
                                            System.out.println(" You Buy a Horse ( 'Name='"
                                                    + gameplayers[k].horses[gameplayers[k].total_horse].get_name() + "' Gender='"
                                                    + gameplayers[k].horses[gameplayers[k].total_horse].get_gender() + "' Health="
                                                    + gameplayers[k].horses[gameplayers[k].total_horse].get_health() + "% Price="
                                                    + gameplayers[k].horses[gameplayers[k].total_horse].get_price());
                                            gameplayers[k].total_horse = gameplayers[k].total_horse+1;
                                            break;
                                        }
                                        else
                                        {
                                            System.out.println("\n You don't have enough money to buy a Horse " +
                                                    "\n Please perform another action. Thanks ");
                                        }
                                    } else if (choice2 == 4)
                                    {
                                        if (gameplayers[k].getMoney()>=20000)
                                        {
                                            gameplayers[k].cows[gameplayers[k].total_cow] = new Cow();
                                            String name, gender;
                                            System.out.println("\n Enter the Cow Name= ");
                                            get.nextLine(); name = get.nextLine();
                                            System.out.println(" Gender of Cow: Enter 1 for Female and 2 for Male:  ");
                                            int gen;
                                            while(true)
                                            {
                                                gen = get.nextInt();
                                                if(gen ==1)
                                                {
                                                    gender = "Female";
                                                    break;
                                                }
                                                else if(gen==2)
                                                {
                                                    gender = "Male";
                                                    break;
                                                }
                                                else
                                                {
                                                    System.out.println("\n You entered incorrect choice " +
                                                            "\n Please select correct choice for Gender. Thanks ");
                                                }
                                            };
                                            gameplayers[k].cows[gameplayers[k].total_cow].set_data(name, gender);
                                            System.out.println(" You Buy a Cow ( 'Name='"
                                                    + gameplayers[k].cows[gameplayers[k].total_cow].get_name() + "' Gender='"
                                                    + gameplayers[k].cows[gameplayers[k].total_cow].get_gender() + "' Health="
                                                    + gameplayers[k].cows[gameplayers[k].total_cow].get_health() + "% Price="
                                                    + gameplayers[k].cows[gameplayers[k].total_cow].get_price());
                                            gameplayers[k].total_cow = gameplayers[k].total_cow+1;
                                            break;
                                        }
                                        else
                                        {
                                            System.out.println("\n You don't have enough money to buy a Cow " +
                                                    "\n Please perform another action. Thanks ");
                                        }
                                    } else if (choice2 == 5)
                                    {
                                        if (gameplayers[k].getMoney()>=25000)
                                        {
                                            gameplayers[k].buffaloes[gameplayers[k].total_buffalo] = new Buffalo();
                                            String name, gender;
                                            System.out.println("\n Enter the Buffalo Name= ");
                                            get.nextLine(); name = get.nextLine();
                                            System.out.println(" Gender of Buffalo: Enter 1 for Female and 2 for Male:  ");
                                            int gen;
                                            while(true)
                                            {
                                                gen = get.nextInt();
                                                if(gen ==1)
                                                {
                                                    gender = "Female";
                                                    break;
                                                }
                                                else if(gen==2)
                                                {
                                                    gender = "Male";
                                                    break;
                                                }
                                                else
                                                {
                                                    System.out.println("\n You entered incorrect choice " +
                                                            "\n Please select correct choice for Gender. Thanks ");
                                                }
                                            };
                                            gameplayers[k].buffaloes[gameplayers[k].total_buffalo].set_data(name, gender);
                                            System.out.println(" You Buy a Buffalo ( 'Name='"
                                                    + gameplayers[k].buffaloes[gameplayers[k].total_buffalo].get_name() + "' Gender='"
                                                    + gameplayers[k].buffaloes[gameplayers[k].total_buffalo].get_gender() + "' Health="
                                                    + gameplayers[k].buffaloes[gameplayers[k].total_buffalo].get_health() + "% Price="
                                                    + gameplayers[k].buffaloes[gameplayers[k].total_buffalo].get_price());
                                            gameplayers[k].total_buffalo = gameplayers[k].total_buffalo+1;
                                            break;
                                        }
                                        else
                                        {
                                            System.out.println("\n You don't have enough money to buy a Buffalo " +
                                                    "\n Please perform another action. Thanks ");
                                        }
                                    } else {
                                        System.out.println("\n You entered Invalid Choice " +
                                                "\n Please enter correct Choice. Thanks ");
                                    }
                                }
                                break;
                            }
                            else if (choice == 2)
                            {
                                while (true)
                                {
                                    int quantity;
                                    int choice2;
                                    System.out.println("\n Enter 1 for Buy the Fruits ");
                                    System.out.println(" Enter 2 for Buy the Vegetables ");
                                    System.out.println(" Enter 3 for Buy the CattleFeed ");
                                    choice2 = get.nextInt();
                                    if (choice2 == 1)
                                    {
                                        System.out.println(" The Price for Fruits per Kg is= "+gameplayers[k].fruits.get_price()
                                                +"\n Enter the Quantity you wants to Buy: Enter the Quantity: ");
                                        quantity = get.nextInt();
                                        if(gameplayers[k].getMoney()>=(quantity*gameplayers[k].fruits.get_price()))
                                        {
                                            quantity = quantity + gameplayers[k].fruits.get_quantity();
                                            gameplayers[k].fruits.set_quantity(quantity);
                                            System.out.println(" You Buy the "+quantity+"kg Fruits in Price= "+quantity*gameplayers[k].fruits.get_price());
                                            break;
                                        }
                                        else
                                        {
                                            System.out.println("\n You don't have enough money to buy the Fruits " +
                                                    "\n Please perform another action. Thanks ");
                                        }
                                    } else if (choice2 == 2)
                                    {
                                        System.out.println("\n The Price for Vegetables per Kg is= "+gameplayers[k].vegetables.get_price()
                                                +"\n Enter the Quantity you wants to Buy: Enter the Quantity: ");
                                        quantity = get.nextInt();
                                        if(gameplayers[k].getMoney()>=(quantity*gameplayers[k].vegetables.get_price()))
                                        {
                                            quantity = quantity + gameplayers[k].vegetables.get_quantity();
                                            gameplayers[k].vegetables.set_quantity(quantity);
                                            System.out.println(" You Buy the "+quantity+"kg Vegetables in Price= "+quantity*gameplayers[k].vegetables.get_price());
                                            break;
                                        }
                                        else
                                        {
                                            System.out.println("\n You don't have enough money to buy the Vegetables " +
                                                    "\n Please perform another action. Thanks ");
                                        }
                                    } else if (choice2 == 3)
                                    {
                                        System.out.println("\n The Price for CattleFeed per Kg is= "+gameplayers[k].cattlefeeds.get_price()
                                                +"\n Enter the Quantity you wants to Buy: Enter the Quantity: ");
                                        quantity = get.nextInt();
                                        if(gameplayers[k].getMoney()>=(quantity*gameplayers[k].cattlefeeds.get_price()))
                                        {
                                            quantity = quantity + gameplayers[k].cattlefeeds.get_quantity();
                                            gameplayers[k].cattlefeeds.set_quantity(quantity);
                                            System.out.println(" You Buy the "+quantity+"kg Vegetables in Price= "+quantity*gameplayers[k].cattlefeeds.get_price());
                                            break;
                                        }
                                        else
                                        {
                                            System.out.println("\n You don't have enough money to buy the CattleFeed " +
                                                    "\n Please perform another action. Thanks ");
                                        }
                                    } else {
                                        System.out.println("\n You entered Invalid Choice " +
                                                "\n Please enter correct Choice. Thanks ");
                                    }
                                }
                                break;
                            }
                            else if (choice == 3)
                            {
                                while(true)
                                {
                                    int choice2;
                                    System.out.println("\n " + j + " Round of the Game for Player " + (k + 1) + "  ");
                                    System.out.println(" Enter 1 to Feed Cat ");
                                    System.out.println(" Enter 2 to Feed Dog ");
                                    System.out.println(" Enter 3 to Feed Horse ");
                                    System.out.println(" Enter 4 to Feed Cow ");
                                    System.out.println(" Enter 5 to Feed Buffalo ");
                                    System.out.println(" Enter 6 to Go Back ");
                                    choice2 = get.nextInt();
                                    if (choice2 == 1)
                                    {
                                        while (true)
                                        {
                                            int choice3;
                                            System.out.println(" Enter 1 to Feed the Fruits and Enter 2 to Feed the Vegetables:  ");
                                            choice3 = get.nextInt();
                                            if (choice3 == 1)
                                            {
                                                int cat = gameplayers[k].total_cat;
                                                if (cat == 0)
                                                {
                                                    System.out.println(" You have no Cat. You Should Feed other Animal");
                                                    break;
                                                } else
                                                    {
                                                    for (int i = 0; i < cat; i++)
                                                    {
                                                        System.out.println(" Cat" + (i + 1) + " = ( 'Name='"
                                                                + gameplayers[k].cats[i].get_name() + "' Gender='"
                                                                + gameplayers[k].cats[i].get_gender() + "' Health="
                                                                + gameplayers[k].cats[i].get_health() + "% Price="
                                                                + gameplayers[k].cats[i].get_price());
                                                    }
                                                    int choice4;
                                                    while (true)
                                                    {
                                                        for (int i = 0; i < cat; i++)
                                                        {
                                                            System.out.println(" Enter " + (i + 1) + " for " + (i + 1) + " Cat ");
                                                        }
                                                        choice4 = get.nextInt();
                                                        if (choice4 <= cat) {
                                                            int health = gameplayers[k].cats[choice3 - 1].get_health();
                                                            if (health != 0) {
                                                                int feed_quantity;
                                                                System.out.println("The 1kg Fruits will increase the 10% health of Cat:" +
                                                                        "\n Enter Fruits Quantity to Feed the Cat ");
                                                                feed_quantity = get.nextInt();
                                                                if ((gameplayers[k].fruits.get_quantity()) == 0) {
                                                                    System.out.println(" You have 0 quantity of Fruits ");
                                                                    break;
                                                                } else if (feed_quantity > (gameplayers[k].fruits.get_quantity())) {
                                                                    System.out.println(" You have not enough quantity of food ");
                                                                } else {
                                                                    if ((feed_quantity * 10) >= (100 - gameplayers[k].cats[choice4 - 1].get_health())) {
                                                                        gameplayers[k].cats[choice4 - 1].set_health(100);
                                                                        gameplayers[k].fruits.set_quantity(((gameplayers[k].fruits.get_quantity())-feed_quantity));
                                                                        System.out.println(" Feed is done with Cat ");
                                                                        break;
                                                                    } else {
                                                                        gameplayers[k].cats[choice4 - 1].set_health((gameplayers[k].cats[choice4 - 1].get_health() + (feed_quantity * 10)));
                                                                        System.out.println(" Feed is done with Cat ");
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println(" Your Cat is died. So you can't Feed ");
                                                                break;
                                                            }
                                                        } else {
                                                            System.out.println(" You Enter incorrect Choice: Please Enter correct Choice. Thanks:");
                                                        }
                                                    }
                                                    break;
                                                }
                                            } else if (choice3 == 2)
                                            {
                                                int cat = gameplayers[k].total_cat;
                                                if (cat == 0)
                                                {
                                                    System.out.println(" You have no Cat. You Should Feed other Animal");
                                                    break;
                                                } else
                                                {
                                                    for (int i = 0; i < cat; i++)
                                                    {
                                                        System.out.println(" Cat" + (i + 1) + " = ( 'Name='"
                                                                + gameplayers[k].cats[i].get_name() + "' Gender='"
                                                                + gameplayers[k].cats[i].get_gender() + "' Health="
                                                                + gameplayers[k].cats[i].get_health() + "% Price="
                                                                + gameplayers[k].cats[i].get_price());
                                                    }
                                                    int choice4;
                                                    while (true)
                                                    {
                                                        for (int i = 0; i < cat; i++)
                                                        {
                                                            System.out.println(" Enter " + (i + 1) + " for " + (i + 1) + " Cat ");
                                                        }
                                                        choice4 = get.nextInt();
                                                        if (choice4 <= cat) {
                                                            int health = gameplayers[k].cats[choice3 - 1].get_health();
                                                            if (health != 0) {
                                                                int feed_quantity;
                                                                System.out.println("The 1kg Vegetables will increase the 10% health of Cat:" +
                                                                        "\n Enter Vegetables Quantity to Feed the Cat ");
                                                                feed_quantity = get.nextInt();
                                                                if ((gameplayers[k].vegetables.get_quantity()) == 0) {
                                                                    System.out.println(" You have 0 quantity of Vegetables ");
                                                                    break;
                                                                } else if (feed_quantity > (gameplayers[k].vegetables.get_quantity())) {
                                                                    System.out.println(" You have not enough quantity of food ");
                                                                } else {
                                                                    if ((feed_quantity * 10) >= (100 - gameplayers[k].cats[choice4 - 1].get_health())) {
                                                                        gameplayers[k].cats[choice4 - 1].set_health(100);
                                                                        gameplayers[k].vegetables.set_quantity(((gameplayers[k].vegetables.get_quantity())-feed_quantity));
                                                                        System.out.println(" Feed is done with Cat ");
                                                                        break;
                                                                    } else {
                                                                        gameplayers[k].cats[choice4 - 1].set_health((gameplayers[k].cats[choice4 - 1].get_health() + (feed_quantity * 10)));
                                                                        System.out.println(" Feed is done with Cat ");
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println(" Your Cat is died. So you can't Feed ");
                                                                break;
                                                            }
                                                        } else {
                                                            System.out.println(" You Enter incorrect Choice: Please Enter correct Choice. Thanks:");
                                                        }
                                                    }
                                                    break;
                                                }
                                            } else {
                                                System.out.println(" You Enter incorrect Choice: Please Enter correct Choice. Thanks:");
                                            }
                                        }
                                    } else if (choice2 == 2)
                                    {
                                        while (true)
                                        {
                                            int choice3;
                                            System.out.println(" Enter 1 to Feed the Fruits and Enter 2 to Feed the Vegetables:  ");
                                            choice3 = get.nextInt();
                                            if (choice3 == 1)
                                            {
                                                int dog = gameplayers[k].total_dog;
                                                if (dog == 0)
                                                {
                                                    System.out.println(" You have no Dog. You Should Feed other Animal");
                                                    break;
                                                }
                                                else
                                                {
                                                    for (int i = 0; i < dog; i++)
                                                    {
                                                        System.out.println(" Dog" + (i + 1) + " = ( 'Name='"
                                                                + gameplayers[k].dogs[i].get_name() + "' Gender='"
                                                                + gameplayers[k].dogs[i].get_gender() + "' Health="
                                                                + gameplayers[k].dogs[i].get_health() + "% Price="
                                                                + gameplayers[k].dogs[i].get_price());
                                                    }
                                                    int choice4;
                                                    while (true)
                                                    {
                                                        for (int i = 0; i < dog; i++)
                                                        {
                                                            System.out.println(" Enter " + (i + 1) + " for " + (i + 1) + " Dog ");
                                                        }
                                                        choice4 = get.nextInt();
                                                        if (choice4 <= dog) {
                                                            int health = gameplayers[k].dogs[choice4 - 1].get_health();
                                                            if (health != 0) {
                                                                int feed_quantity;
                                                                System.out.println("The 1kg Fruits will increase the 10% health of Dog:" +
                                                                        "\n Enter Fruits Quantity to Feed the Dog ");
                                                                feed_quantity = get.nextInt();
                                                                if ((gameplayers[k].fruits.get_quantity()) == 0) {
                                                                    System.out.println(" You have 0 quantity of Fruits ");
                                                                    break;
                                                                } else if (feed_quantity > (gameplayers[k].fruits.get_quantity())) {
                                                                    System.out.println(" You have not enough quantity of food ");
                                                                } else {
                                                                    if ((feed_quantity * 10) >= (100 - gameplayers[k].dogs[choice4 - 1].get_health())) {
                                                                        gameplayers[k].dogs[choice4 - 1].set_health(100);
                                                                        gameplayers[k].fruits.set_quantity(((gameplayers[k].fruits.get_quantity())-feed_quantity));
                                                                        System.out.println(" Feed is done with Dog ");
                                                                        break;
                                                                    } else {
                                                                        gameplayers[k].dogs[choice4 - 1].set_health((gameplayers[k].dogs[choice4 - 1].get_health() + (feed_quantity * 10)));
                                                                        gameplayers[k].fruits.set_quantity(((gameplayers[k].fruits.get_quantity())-feed_quantity));
                                                                        System.out.println(" Feed is done with Dog ");
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println(" Your Dog is died. So you can't Feed ");
                                                                break;
                                                            }
                                                        } else {
                                                            System.out.println(" You Enter incorrect Choice: Please Enter correct Choice. Thanks:");
                                                        }
                                                    }
                                                    break;
                                                }
                                            } else if (choice3 == 2)
                                            {
                                                int dog = gameplayers[k].total_dog;
                                                if (dog == 0)
                                                {
                                                    System.out.println(" You have no Dog. You Should Feed other Animal");
                                                    break;
                                                }
                                                else
                                                {
                                                    for (int i = 0; i < dog; i++)
                                                    {
                                                        System.out.println(" Dog" + (i + 1) + " = ( 'Name='"
                                                                + gameplayers[k].dogs[i].get_name() + "' Gender='"
                                                                + gameplayers[k].dogs[i].get_gender() + "' Health="
                                                                + gameplayers[k].dogs[i].get_health() + "% Price="
                                                                + gameplayers[k].dogs[i].get_price());
                                                    }
                                                    int choice4;
                                                    while (true)
                                                    {
                                                        for (int i = 0; i < dog; i++)
                                                        {
                                                            System.out.println(" Enter " + (i + 1) + " for " + (i + 1) + " Dog ");
                                                        }
                                                        choice4 = get.nextInt();
                                                        if (choice4 <= dog) {
                                                            int health = gameplayers[k].dogs[choice4 - 1].get_health();
                                                            if (health != 0) {
                                                                int feed_quantity;
                                                                System.out.println("The 1kg Vegetables will increase the 10% health of Dog:" +
                                                                        "\n Enter Vegetable Quantity to Feed the Dog ");
                                                                feed_quantity = get.nextInt();
                                                                if ((gameplayers[k].vegetables.get_quantity()) == 0) {
                                                                    System.out.println(" You have 0 quantity of vegetables ");
                                                                    break;
                                                                } else if (feed_quantity > (gameplayers[k].vegetables.get_quantity())) {
                                                                    System.out.println(" You have not enough quantity of food ");
                                                                } else {
                                                                    if ((feed_quantity * 10) >= (100 - gameplayers[k].dogs[choice4 - 1].get_health())) {
                                                                        gameplayers[k].dogs[choice4 - 1].set_health(100);
                                                                        gameplayers[k].vegetables.set_quantity(((gameplayers[k].vegetables.get_quantity())-feed_quantity));
                                                                        System.out.println(" Feed is done with Dog ");
                                                                        break;
                                                                    } else {
                                                                        gameplayers[k].dogs[choice4 - 1].set_health((gameplayers[k].dogs[choice4 - 1].get_health() + (feed_quantity * 10)));
                                                                        System.out.println(" Feed is done with Dog ");
                                                                        gameplayers[k].vegetables.set_quantity(((gameplayers[k].vegetables.get_quantity())-feed_quantity));
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println(" Your Dog is died. So you can't Feed ");
                                                                break;
                                                            }
                                                        } else {
                                                            System.out.println(" You Enter incorrect Choice: Please Enter correct Choice. Thanks:");
                                                        }
                                                    }
                                                    break;
                                                }
                                            } else {
                                                System.out.println(" You Enter incorrect Choice: Please Enter correct Choice. Thanks:");
                                            }
                                        }
                                    } else if (choice2 == 3)
                                    {
                                        int horse = gameplayers[k].total_horse;
                                        if (horse == 0)
                                        {
                                            System.out.println(" You have no Horse. You Should Feed other Animal");
                                        }
                                        else
                                        {
                                            for (int i = 0; i < horse; i++)
                                            {
                                                System.out.println(" Horse" + (i + 1) + " = ( 'Name='"
                                                        + gameplayers[k].horses[i].get_name() + "' Gender='"
                                                        + gameplayers[k].horses[i].get_gender() + "' Health="
                                                        + gameplayers[k].horses[i].get_health() + "% Price="
                                                        + gameplayers[k].horses[i].get_price());
                                            }
                                            int choice4;
                                            while (true)
                                            {
                                                for (int i = 0; i < horse; i++)
                                                {
                                                    System.out.println(" Enter " + (i + 1) + " for " + (i + 1) + " Horse ");
                                                }
                                                choice4 = get.nextInt();
                                                if (choice4 <= horse) {
                                                    int health = gameplayers[k].horses[choice4 - 1].get_health();
                                                    if (health != 0) {
                                                        int feed_quantity;
                                                        System.out.println("The 1kg CattleFeed will increase the 10% health of Horse:" +
                                                                "\n Enter CattleFeed Quantity to Feed the Horse ");
                                                        feed_quantity = get.nextInt();
                                                        if ((gameplayers[k].cattlefeeds.get_quantity()) == 0) {
                                                            System.out.println(" You have 0 quantity of CattleFeed ");
                                                            break;
                                                        } else if (feed_quantity > (gameplayers[k].cattlefeeds.get_quantity())) {
                                                            System.out.println(" You have not enough quantity of food ");
                                                        } else {
                                                            if ((feed_quantity * 10) >= (100 - gameplayers[k].horses[choice4 - 1].get_health())) {
                                                                gameplayers[k].horses[choice4 - 1].set_health(100);
                                                                gameplayers[k].cattlefeeds.set_quantity(((gameplayers[k].cattlefeeds.get_quantity())-feed_quantity));
                                                                System.out.println(" Feed is done with Horse ");
                                                                break;
                                                            } else {
                                                                gameplayers[k].horses[choice4 - 1].set_health((gameplayers[k].horses[choice4 - 1].get_health() + (feed_quantity * 10)));
                                                                System.out.println(" Feed is done with Horse ");
                                                                gameplayers[k].cattlefeeds.set_quantity(((gameplayers[k].cattlefeeds.get_quantity())-feed_quantity));
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println(" Your Horse is died. So you can't Feed ");
                                                        break;
                                                    }
                                                } else {
                                                    System.out.println(" You Enter incorrect Choice: Please Enter correct Choice. Thanks:");
                                                }
                                            }
                                        }
                                    } else if (choice2 == 4)
                                    {
                                        int cow = gameplayers[k].total_cow;
                                        if (cow == 0)
                                        {
                                            System.out.println(" You have no Cow. You Should Feed other Animal");
                                        }
                                        else
                                        {
                                            for (int i = 0; i < cow; i++)
                                            {
                                                System.out.println(" Cow" + (i + 1) + " = ( 'Name='"
                                                        + gameplayers[k].cows[i].get_name() + "' Gender='"
                                                        + gameplayers[k].cows[i].get_gender() + "' Health="
                                                        + gameplayers[k].cows[i].get_health() + "% Price="
                                                        + gameplayers[k].cows[i].get_price());
                                            }
                                            int choice4;
                                            while (true)
                                            {
                                                for (int i = 0; i < cow; i++)
                                                {
                                                    System.out.println(" Enter " + (i + 1) + " for " + (i + 1) + " Cow ");
                                                }
                                                choice4 = get.nextInt();
                                                if (choice4 <= cow) {
                                                    int health = gameplayers[k].cows[choice4 - 1].get_health();
                                                    if (health != 0) {
                                                        int feed_quantity;
                                                        System.out.println("The 1kg CattleFeed will increase the 10% health of Cow:" +
                                                                "\n Enter CattleFeed Quantity to Feed the Cow ");
                                                        feed_quantity = get.nextInt();
                                                        if ((gameplayers[k].cattlefeeds.get_quantity()) == 0) {
                                                            System.out.println(" You have 0 quantity of CattleFeed ");
                                                            break;
                                                        } else if (feed_quantity > (gameplayers[k].cattlefeeds.get_quantity())) {
                                                            System.out.println(" You have not enough quantity of food ");
                                                        } else {
                                                            if ((feed_quantity * 10) >= (100 - gameplayers[k].cows[choice4 - 1].get_health())) {
                                                                gameplayers[k].cows[choice4 - 1].set_health(100);
                                                                gameplayers[k].cattlefeeds.set_quantity(((gameplayers[k].cattlefeeds.get_quantity())-feed_quantity));
                                                                System.out.println(" Feed is done with Cow ");
                                                                break;
                                                            } else {
                                                                gameplayers[k].cows[choice4 - 1].set_health((gameplayers[k].cows[choice4 - 1].get_health() + (feed_quantity * 10)));
                                                                System.out.println(" Feed is done with Cow ");
                                                                gameplayers[k].cattlefeeds.set_quantity(((gameplayers[k].cattlefeeds.get_quantity())-feed_quantity));
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println(" Your Cow is died. So you can't Feed ");
                                                        break;
                                                    }
                                                } else {
                                                    System.out.println(" You Enter incorrect Choice: Please Enter correct Choice. Thanks:");
                                                }
                                            }
                                        }
                                    } else if (choice2 == 5)
                                    {
                                        int buffalo = gameplayers[k].total_buffalo;
                                        if (buffalo == 0)
                                        {
                                            System.out.println(" You have no Buffalo. You Should Feed other Animal");
                                        }
                                        else
                                        {
                                            for (int i = 0; i < buffalo; i++)
                                            {
                                                System.out.println(" Buffalo" + (i + 1) + " = ( 'Name='"
                                                        + gameplayers[k].buffaloes[i].get_name() + "' Gender='"
                                                        + gameplayers[k].buffaloes[i].get_gender() + "' Health="
                                                        + gameplayers[k].buffaloes[i].get_health() + "% Price="
                                                        + gameplayers[k].buffaloes[i].get_price());
                                            }
                                            int choice4;
                                            while (true)
                                            {
                                                for (int i = 0; i < buffalo; i++)
                                                {
                                                    System.out.println(" Enter " + (i + 1) + " for " + (i + 1) + " Buffalo ");
                                                }
                                                choice4 = get.nextInt();
                                                if (choice4 <= buffalo)
                                                {
                                                    int health = gameplayers[k].buffaloes[choice4 - 1].get_health();
                                                    if (health != 0)
                                                    {
                                                        int feed_quantity;
                                                        System.out.println("The 1kg CattleFeed will increase the 10% health of Buffalo:" +
                                                                "\n Enter CattleFeed Quantity to Feed the Buffaloes ");
                                                        feed_quantity = get.nextInt();
                                                        if ((gameplayers[k].cattlefeeds.get_quantity()) == 0) {
                                                            System.out.println(" You have 0 quantity of CattleFeed ");
                                                            break;
                                                        } else if (feed_quantity > (gameplayers[k].cattlefeeds.get_quantity())) {
                                                            System.out.println(" You have not enough quantity of food ");
                                                        } else {
                                                            if ((feed_quantity * 10) >= (100 - gameplayers[k].buffaloes[choice4 - 1].get_health())) {
                                                                gameplayers[k].buffaloes[choice4 - 1].set_health(100);
                                                                gameplayers[k].cattlefeeds.set_quantity(((gameplayers[k].cattlefeeds.get_quantity())-feed_quantity));
                                                                System.out.println(" Feed is done with Buffalo ");
                                                                break;
                                                            } else {
                                                                gameplayers[k].buffaloes[choice4 - 1].set_health((gameplayers[k].buffaloes[choice4 - 1].get_health() + (feed_quantity * 10)));
                                                                System.out.println(" Feed is done with Buffalo ");
                                                                gameplayers[k].cattlefeeds.set_quantity(((gameplayers[k].cattlefeeds.get_quantity())-feed_quantity));
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println(" Your Buffalo is died. So you can't Feed ");
                                                        break;
                                                    }
                                                } else {
                                                    System.out.println(" You Enter incorrect Choice: Please Enter correct Choice. Thanks:");
                                                }
                                            }
                                        }
                                    } else if (choice2==6)
                                    {
                                        break;
                                    }
                                    else
                                    {

                                    }
                                }
                            }
                            else if (choice == 4)
                            {
                                while (true)
                                {
                                    int choice2; //this variable is used to select the Animal Type
                                    System.out.println("\n Enter 1 to Sale the Animal ");
                                    System.out.println(" Enter 2 to Buy the Animal ");
                                    choice2 = get.nextInt();
                                    if(choice2==1)
                                    {
                                        while (true)
                                        {
                                            int choice3;
                                            System.out.println("\n\n  Enter 1 for Sale the Cat ");
                                            System.out.println("\n  Enter 2 for Sale the Dog ");
                                            System.out.println("\n  Enter 3 for Sale the Horse ");
                                            System.out.println("\n  Enter 4 for Sale the Cow ");
                                            System.out.println("\n  Enter 5 for Sale the Buffalo");
                                            System.out.println("\n  Enter 6 to Go Back");
                                            choice3 = get.nextInt();
                                            if (choice3 == 1)
                                            {
                                                int total_cats = gameplayers[k].total_cat;
                                                if (total_cats == 0)
                                                {
                                                    System.out.println(" You has no Cat! You can sale other Animal.");
                                                } else {
                                                    while(true)
                                                    {
                                                        for (int i=0; i<players; i++)
                                                        {
                                                            if(i==k)
                                                            {

                                                            }
                                                            else
                                                            {
                                                                System.out.println(" Player"+(i+1)+"= ('Name'= "+gameplayers[i].getName());
                                                            }
                                                        }
                                                        int choice4;
                                                        for(int i=0;i<players;i++)
                                                        {
                                                            System.out.println("Enter "+(i+1)+" for Player"+(i+1));
                                                        }
                                                        choice4= get.nextInt();
                                                        if ((choice4-1)!=k && choice4 <= players)
                                                        {
                                                            double price;
                                                            price = (gameplayers[k].cats[total_cats-1].get_health()*gameplayers[k].cats[total_cats-1].get_price())/100;
                                                            if(price <= (gameplayers[choice4-1].getMoney()))
                                                            {
                                                                gameplayers[choice4-1].setMoney((gameplayers[choice4-1].getMoney()-price));
                                                                double money = gameplayers[k].getMoney()+price;
                                                                gameplayers[k].setMoney(money);

                                                                gameplayers[choice4-1].cats[gameplayers[choice4-1].total_cat] = new Cat();
                                                                gameplayers[choice4-1].cats[gameplayers[choice4-1].total_cat].set_data
                                                                        ((gameplayers[k].cats[gameplayers[k].total_cat-1].get_name()),
                                                                                gameplayers[k].cats[gameplayers[k].total_cat-1].get_gender());

                                                                gameplayers[k].total_cat = (gameplayers[k].total_cat)-1;
                                                                gameplayers[choice4-1].total_cat = (gameplayers[choice4-1].total_cat)+1;
                                                                System.out.println(" The cat is sold: You get Money= "+price+"Rs and this amount is added tp your account!");
                                                                break;
                                                            }
                                                            else
                                                            {
                                                                System.out.println(" The Selected Player don't have enough Money! Thanks.");
                                                                break;
                                                            }
                                                        }
                                                        else
                                                        {
                                                            System.out.println(" You entered invalid choice! Enter correct choice. Thanks.");
                                                        }
                                                    }
                                                }
                                            } else if (choice3 == 2)
                                            {
                                                int total_dogs = gameplayers[k].total_dog;
                                                if (total_dogs == 0)
                                                {
                                                    System.out.println(" You has no Dog! You can sale other Animal.");
                                                } else {
                                                    while(true)
                                                    {
                                                        for (int i=0; i<players; i++)
                                                        {
                                                            if(i==k)
                                                            {

                                                            }
                                                            else
                                                            {
                                                                System.out.println(" Player"+(i+1)+"= ('Name'= "+gameplayers[i].getName());
                                                            }
                                                        }
                                                        int choice4;
                                                        for(int i=0;i<players;i++)
                                                        {
                                                            System.out.println("Enter "+(i+1)+" for Player"+(i+1));
                                                        }
                                                        choice4= get.nextInt();
                                                        if ((choice4-1)!=k && choice4 <= players)
                                                        {
                                                            double price;
                                                            price = (gameplayers[k].dogs[total_dogs-1].get_health()*gameplayers[k].dogs[total_dogs-1].get_price())/100;
                                                            if(price <= (gameplayers[choice4-1].getMoney()))
                                                            {
                                                                gameplayers[choice4-1].setMoney((gameplayers[choice4-1].getMoney()-price));
                                                                double money = gameplayers[k].getMoney()+price;
                                                                gameplayers[k].setMoney(money);

                                                                gameplayers[choice4-1].dogs[gameplayers[choice4-1].total_dog] = new Dog();
                                                                gameplayers[choice4-1].dogs[gameplayers[choice4-1].total_dog].set_data
                                                                        ((gameplayers[k].dogs[gameplayers[k].total_dog-1].get_name()),
                                                                                gameplayers[k].dogs[gameplayers[k].total_dog-1].get_gender());

                                                                gameplayers[k].total_dog = (gameplayers[k].total_dog)-1;
                                                                gameplayers[choice4-1].total_dog = (gameplayers[choice4-1].total_dog)+1;
                                                                System.out.println(" The Dog is sold: You get Money= "+price+"Rs and this amount is added tp your account!");
                                                                break;
                                                            }
                                                            else
                                                            {
                                                                System.out.println(" The Selected Player don't have enough Money! Thanks.");
                                                                break;
                                                            }
                                                        }
                                                        else
                                                        {
                                                            System.out.println(" You entered invalid choice! Enter correct choice. Thanks.");
                                                        }
                                                    }
                                                }
                                            } else if (choice3 == 3)
                                            {
                                                int total_horses = gameplayers[k].total_horse;
                                                if (total_horses == 0)
                                                {
                                                    System.out.println(" You has no Horse! You can sale other Animal.");
                                                } else {
                                                    while(true)
                                                    {
                                                        for (int i=0; i<players; i++)
                                                        {
                                                            if(i==k)
                                                            {

                                                            }
                                                            else
                                                            {
                                                                System.out.println(" Player"+(i+1)+"= ('Name'= "+gameplayers[i].getName());
                                                            }
                                                        }
                                                        int choice4;
                                                        for(int i=0;i<players;i++)
                                                        {
                                                            System.out.println("Enter "+(i+1)+" for Player"+(i+1));
                                                        }
                                                        choice4= get.nextInt();
                                                        if ((choice4-1)!=k && choice4 <= players)
                                                        {
                                                            double price;
                                                            price = (gameplayers[k].horses[total_horses-1].get_health()*gameplayers[k].horses[total_horses-1].get_price())/100;
                                                            if(price <= (gameplayers[choice4-1].getMoney()))
                                                            {
                                                                gameplayers[choice4-1].setMoney((gameplayers[choice4-1].getMoney()-price));
                                                                double money = gameplayers[k].getMoney()+price;
                                                                gameplayers[k].setMoney(money);

                                                                gameplayers[choice4-1].horses[gameplayers[choice4-1].total_horse] = new Horse();
                                                                gameplayers[choice4-1].horses[gameplayers[choice4-1].total_horse].set_data
                                                                        ((gameplayers[k].horses[gameplayers[k].total_horse-1].get_name()),
                                                                                gameplayers[k].horses[gameplayers[k].total_horse-1].get_gender());

                                                                gameplayers[k].total_horse = (gameplayers[k].total_horse)-1;
                                                                gameplayers[choice4-1].total_horse = (gameplayers[choice4-1].total_horse)+1;
                                                                System.out.println(" The Horse is sold: You get Money= "+price+"Rs and this amount is added tp your account!");
                                                                break;
                                                            }
                                                            else
                                                            {
                                                                System.out.println(" The Selected Player don't have enough Money! Thanks.");
                                                                break;
                                                            }
                                                        }
                                                        else
                                                        {
                                                            System.out.println(" You entered invalid choice! Enter correct choice. Thanks.");
                                                        }
                                                    }
                                                }
                                            } else if (choice3 == 4)
                                            {
                                                int total_cows = gameplayers[k].total_cow;
                                                if (total_cows == 0)
                                                {
                                                    System.out.println(" You has no Cow! You can sale other Animal.");
                                                } else {
                                                    while(true)
                                                    {
                                                        for (int i=0; i<players; i++)
                                                        {
                                                            if(i==k)
                                                            {

                                                            }
                                                            else
                                                            {
                                                                System.out.println(" Player"+(i+1)+"= ('Name'= "+gameplayers[i].getName());
                                                            }
                                                        }
                                                        int choice4;
                                                        for(int i=0;i<players;i++)
                                                        {
                                                            System.out.println("Enter "+(i+1)+" for Player"+(i+1));
                                                        }
                                                        choice4= get.nextInt();
                                                        if ((choice4-1)!=k && choice4 <= players)
                                                        {
                                                            double price;
                                                            price = (gameplayers[k].cows[total_cows-1].get_health()*gameplayers[k].cats[total_cows-1].get_price())/100;
                                                            if(price <= (gameplayers[choice4-1].getMoney()))
                                                            {
                                                                gameplayers[choice4-1].setMoney((gameplayers[choice4-1].getMoney()-price));
                                                                double money = gameplayers[k].getMoney()+price;
                                                                gameplayers[k].setMoney(money);

                                                                gameplayers[choice4-1].cows[gameplayers[choice4-1].total_cow] = new Cow();
                                                                gameplayers[choice4-1].cows[gameplayers[choice4-1].total_cow].set_data
                                                                        ((gameplayers[k].cows[gameplayers[k].total_cow-1].get_name()),
                                                                                gameplayers[k].cows[gameplayers[k].total_cow-1].get_gender());

                                                                gameplayers[k].total_cow = (gameplayers[k].total_cow)-1;
                                                                gameplayers[choice4-1].total_cow = (gameplayers[choice4-1].total_cow)+1;
                                                                System.out.println(" The Cow is sold: You get Money= "+price+"Rs and this amount is added tp your account!");
                                                                break;
                                                            }
                                                            else
                                                            {
                                                                System.out.println(" The Selected Player don't have enough Money! Thanks.");
                                                                break;
                                                            }
                                                        }
                                                        else
                                                        {
                                                            System.out.println(" You entered invalid choice! Enter correct choice. Thanks.");
                                                        }
                                                    }
                                                }
                                            } else if (choice3 == 5)
                                            {
                                                int total_buffaloes = gameplayers[k].total_buffalo;
                                                if (total_buffaloes == 0)
                                                {
                                                    System.out.println(" You has no Buffalo! You can sale other Animal.");
                                                } else {
                                                    while(true)
                                                    {
                                                        for (int i=0; i<players; i++)
                                                        {
                                                            if(i==k)
                                                            {

                                                            }
                                                            else
                                                            {
                                                                System.out.println(" Player"+(i+1)+"= ('Name'= "+gameplayers[i].getName());
                                                            }
                                                        }
                                                        int choice4;
                                                        for(int i=0;i<players;i++)
                                                        {
                                                            System.out.println("Enter "+(i+1)+" for Player"+(i+1));
                                                        }
                                                        choice4= get.nextInt();
                                                        if ((choice4-1)!=k && choice4 <= players)
                                                        {
                                                            double price;
                                                            price = (gameplayers[k].buffaloes[total_buffaloes-1].get_health()*gameplayers[k].buffaloes[total_buffaloes-1].get_price())/100;
                                                            if(price <= (gameplayers[choice4-1].getMoney()))
                                                            {
                                                                gameplayers[choice4-1].setMoney((gameplayers[choice4-1].getMoney()-price));
                                                                double money = gameplayers[k].getMoney()+price;
                                                                gameplayers[k].setMoney(money);

                                                                gameplayers[choice4-1].buffaloes[gameplayers[choice4-1].total_buffalo] = new Buffalo();
                                                                gameplayers[choice4-1].buffaloes[gameplayers[choice4-1].total_buffalo].set_data
                                                                        ((gameplayers[k].buffaloes[gameplayers[k].total_buffalo-1].get_name()),
                                                                                gameplayers[k].buffaloes[gameplayers[k].total_buffalo-1].get_gender());

                                                                gameplayers[k].total_buffalo = (gameplayers[k].total_buffalo)-1;
                                                                gameplayers[choice4-1].total_buffalo = (gameplayers[choice4-1].total_buffalo)+1;
                                                                System.out.println(" The Buffalo is sold: You get Money= "+price+"Rs and this amount is added tp your account!");
                                                                break;
                                                            }
                                                            else
                                                            {
                                                                System.out.println(" The Selected Player don't have enough Money! Thanks.");
                                                                break;
                                                            }
                                                        }
                                                        else
                                                        {
                                                            System.out.println(" You entered invalid choice! Enter correct choice. Thanks.");
                                                        }
                                                    }
                                                }
                                            } else if(choice3==6)
                                            {
                                                break;
                                            }
                                            else {
                                                System.out.println(" You entered invalid choice! Enter correct choice. Thanks.");
                                            }
                                        }
                                    }else if(choice2==2)
                                    {
                                        while (true)
                                        {
                                            int choice3;
                                            System.out.println("\n\n  Enter 1 to Buy the Cat ");
                                            System.out.println("\n  Enter 2 to Buy the Dog ");
                                            System.out.println("\n  Enter 3 to Buy the Horse ");
                                            System.out.println("\n  Enter 4 to Buy the Cow ");
                                            System.out.println("\n  Enter 5 to Buy the Buffalo");
                                            System.out.println("\n  Enter 6 to Go Back");
                                            choice3 = get.nextInt();
                                            if (choice3 == 1)
                                            {
                                                    while(true)
                                                    {
                                                        for (int i=0; i<players; i++)
                                                        {
                                                            if(i==k)
                                                            {

                                                            }
                                                            else
                                                            {
                                                                System.out.println(" Player"+(i+1)+"= ('Name'= "+gameplayers[i].getName());
                                                            }
                                                        }
                                                        int choice4;
                                                        for(int i=0;i<players;i++)
                                                        {
                                                            System.out.println("Enter "+(i+1)+" for Player"+(i+1)+" from you want to Buy");
                                                        }
                                                        choice4= get.nextInt();
                                                        if ((choice4-1)!=k && choice4 <= players)
                                                        {
                                                            if((gameplayers[choice4-1].total_cat)==0)
                                                            {
                                                                System.out.println("The Player (from where you want to Buy the Cat) have no Cat!");
                                                                break;
                                                            }
                                                            else
                                                            {
                                                                double price;
                                                                int total_cats = gameplayers[choice4-1].total_cat;
                                                                price = (gameplayers[choice4-1].cats[total_cats-1].get_health()*gameplayers[choice4-1].cats[total_cats-1].get_price())/100;
                                                                if(price <= (gameplayers[k].getMoney()))
                                                                {
                                                                    gameplayers[k].setMoney((gameplayers[k].getMoney())-price);
                                                                    double money = gameplayers[choice4-1].getMoney()+price;
                                                                    gameplayers[choice4-1].setMoney(money);

                                                                    gameplayers[k].cats[gameplayers[k].total_cat] = new Cat();
                                                                    gameplayers[k].cats[gameplayers[k].total_cat].set_data
                                                                            ((gameplayers[choice4-1].cats[gameplayers[choice4-1].total_cat-1].get_name()),
                                                                                    gameplayers[choice4-1].cats[gameplayers[choice4-1].total_cat-1].get_gender());

                                                                    gameplayers[choice4-1].total_cat = (gameplayers[k].total_cat)-1;
                                                                    gameplayers[k].total_cat = (gameplayers[choice4-1].total_cat)+1;
                                                                    System.out.println(" You Buy the Cat: You Pay Money= "+price+"Rs and this amount is deducted your account!");
                                                                    break;
                                                                }
                                                                else
                                                                {
                                                                    System.out.println(" You don't have enough Money! Thanks.");
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        else
                                                        {
                                                            System.out.println(" You entered invalid choice! Enter correct choice. Thanks.");
                                                        }
                                                    }
                                            } else if (choice3 == 2)
                                            {
                                                while(true)
                                                {
                                                    for (int i=0; i<players; i++)
                                                    {
                                                        if(i==k)
                                                        {

                                                        }
                                                        else
                                                        {
                                                            System.out.println(" Player"+(i+1)+"= ('Name'= "+gameplayers[i].getName());
                                                        }
                                                    }
                                                    int choice4;
                                                    for(int i=0;i<players;i++)
                                                    {
                                                        System.out.println("Enter "+(i+1)+" for Player"+(i+1)+" from you want to Buy");
                                                    }
                                                    choice4= get.nextInt();
                                                    if ((choice4-1)!=k && choice4 <= players)
                                                    {
                                                        if((gameplayers[choice4-1].total_dog)==0)
                                                        {
                                                            System.out.println("The Player (from where you want to Buy the Dog) have no Dog!");
                                                            break;
                                                        }
                                                        else
                                                        {
                                                            double price;
                                                            int total_dogs = gameplayers[choice4-1].total_dog;
                                                            price = (gameplayers[choice4-1].cats[total_dogs-1].get_health()*gameplayers[choice4-1].dogs[total_dogs-1].get_price())/100;
                                                            if(price <= (gameplayers[k].getMoney()))
                                                            {
                                                                gameplayers[k].setMoney((gameplayers[k].getMoney())-price);
                                                                double money = gameplayers[choice4-1].getMoney()+price;
                                                                gameplayers[choice4-1].setMoney(money);

                                                                gameplayers[k].dogs[gameplayers[k].total_dog] = new Dog();
                                                                gameplayers[k].dogs[gameplayers[k].total_dog].set_data
                                                                        ((gameplayers[choice4-1].dogs[gameplayers[choice4-1].total_dog-1].get_name()),
                                                                                gameplayers[choice4-1].dogs[gameplayers[choice4-1].total_dog-1].get_gender());

                                                                gameplayers[choice4-1].total_dog = (gameplayers[k].total_dog)-1;
                                                                gameplayers[k].total_dog = (gameplayers[choice4-1].total_dog)+1;
                                                                System.out.println(" You Buy the Dog: You Pay Money= "+price+"Rs and this amount is deducted your account!");
                                                                break;
                                                            }
                                                            else
                                                            {
                                                                System.out.println(" You don't have enough Money! Thanks.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    else
                                                    {
                                                        System.out.println(" You entered invalid choice! Enter correct choice. Thanks.");
                                                    }
                                                }
                                            } else if (choice3 == 3)
                                            {
                                                while(true)
                                                {
                                                    for (int i=0; i<players; i++)
                                                    {
                                                        if(i==k)
                                                        {

                                                        }
                                                        else
                                                        {
                                                            System.out.println(" Player"+(i+1)+"= ('Name'= "+gameplayers[i].getName());
                                                        }
                                                    }
                                                    int choice4;
                                                    for(int i=0;i<players;i++)
                                                    {
                                                        System.out.println("Enter "+(i+1)+" for Player"+(i+1)+" from you want to Buy Horse");
                                                    }
                                                    choice4= get.nextInt();
                                                    if ((choice4-1)!=k && choice4 <= players)
                                                    {
                                                        if((gameplayers[choice4-1].total_horse)==0)
                                                        {
                                                            System.out.println("The Player (from where you want to Buy the Horse) have no Horse!");
                                                            break;
                                                        }
                                                        else
                                                        {
                                                            double price;
                                                            int total_horses = gameplayers[choice4-1].total_horse;
                                                            price = (gameplayers[choice4-1].horses[total_horses-1].get_health()*gameplayers[choice4-1].horses[total_horses-1].get_price())/100;
                                                            if(price <= (gameplayers[k].getMoney()))
                                                            {
                                                                gameplayers[k].setMoney((gameplayers[k].getMoney())-price);
                                                                double money = gameplayers[choice4-1].getMoney()+price;
                                                                gameplayers[choice4-1].setMoney(money);

                                                                gameplayers[k].horses[gameplayers[k].total_horse] = new Horse();
                                                                gameplayers[k].horses[gameplayers[k].total_horse].set_data
                                                                        ((gameplayers[choice4-1].horses[gameplayers[choice4-1].total_horse-1].get_name()),
                                                                                gameplayers[choice4-1].horses[gameplayers[choice4-1].total_horse-1].get_gender());

                                                                gameplayers[choice4-1].total_horse = (gameplayers[k].total_horse)-1;
                                                                gameplayers[k].total_horse = (gameplayers[choice4-1].total_horse)+1;
                                                                System.out.println(" You Buy the Horse: You Pay Money= "+price+"Rs and this amount is deductedfrom your account!");
                                                                break;
                                                            }
                                                            else
                                                            {
                                                                System.out.println(" You don't have enough Money! Thanks.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    else
                                                    {
                                                        System.out.println(" You entered invalid choice! Enter correct choice. Thanks.");
                                                    }
                                                }
                                            } else if (choice3 == 4)
                                            {
                                                while(true)
                                                {
                                                    for (int i=0; i<players; i++)
                                                    {
                                                        if(i==k)
                                                        {

                                                        }
                                                        else
                                                        {
                                                            System.out.println(" Player"+(i+1)+"= ('Name'= "+gameplayers[i].getName());
                                                        }
                                                    }
                                                    int choice4;
                                                    for(int i=0;i<players;i++)
                                                    {
                                                        System.out.println("Enter "+(i+1)+" for Player"+(i+1)+" from you want to Buy Cow");
                                                    }
                                                    choice4= get.nextInt();
                                                    if ((choice4-1)!=k && choice4 <= players)
                                                    {
                                                        if((gameplayers[choice4-1].total_cow)==0)
                                                        {
                                                            System.out.println("The Player (from where you want to Buy the Cow) have no Cow!");
                                                            break;
                                                        }
                                                        else
                                                        {
                                                            double price;
                                                            int total_cows = gameplayers[choice4-1].total_cow;
                                                            price = (gameplayers[choice4-1].cows[total_cows-1].get_health()*gameplayers[choice4-1].cows[total_cows-1].get_price())/100;
                                                            if(price <= (gameplayers[k].getMoney()))
                                                            {
                                                                gameplayers[k].setMoney((gameplayers[k].getMoney())-price);
                                                                double money = gameplayers[choice4-1].getMoney()+price;
                                                                gameplayers[choice4-1].setMoney(money);

                                                                gameplayers[k].cows[gameplayers[k].total_cow] = new Cow();
                                                                gameplayers[k].cows[gameplayers[k].total_cow].set_data
                                                                        ((gameplayers[choice4-1].cows[gameplayers[choice4-1].total_cow-1].get_name()),
                                                                                gameplayers[choice4-1].cows[gameplayers[choice4-1].total_cow-1].get_gender());

                                                                gameplayers[choice4-1].total_cow = (gameplayers[k].total_cow)-1;
                                                                gameplayers[k].total_cow = (gameplayers[choice4-1].total_cow)+1;
                                                                System.out.println(" You Buy the Cow: You Pay Money= "+price+"Rs and this amount is deducted from your account!");
                                                                break;
                                                            }
                                                            else
                                                            {
                                                                System.out.println(" You don't have enough Money! Thanks.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    else
                                                    {
                                                        System.out.println(" You entered invalid choice! Enter correct choice. Thanks.");
                                                    }
                                                }
                                            } else if (choice3 == 5)
                                            {
                                                while(true)
                                                {
                                                    for (int i=0; i<players; i++)
                                                    {
                                                        if(i==k)
                                                        {

                                                        }
                                                        else
                                                        {
                                                            System.out.println(" Player"+(i+1)+"= ('Name'= "+gameplayers[i].getName());
                                                        }
                                                    }
                                                    int choice4;
                                                    for(int i=0;i<players;i++)
                                                    {
                                                        System.out.println("Enter "+(i+1)+" for Player"+(i+1)+" from you want to Buy Buffalo");
                                                    }
                                                    choice4= get.nextInt();
                                                    if ((choice4-1)!=k && choice4 <= players)
                                                    {
                                                        if((gameplayers[choice4-1].total_buffalo)==0)
                                                        {
                                                            System.out.println("The Player (from where you want to Buy the Buffalo) have no Buffalo!");
                                                            break;
                                                        }
                                                        else
                                                        {
                                                            double price;
                                                            int total_buffaloes = gameplayers[choice4-1].total_buffalo;
                                                            price = (gameplayers[choice4-1].buffaloes[total_buffaloes-1].get_health()*gameplayers[choice4-1].buffaloes[total_buffaloes-1].get_price())/100;
                                                            if(price <= (gameplayers[k].getMoney()))
                                                            {
                                                                gameplayers[k].setMoney((gameplayers[k].getMoney())-price);
                                                                double money = gameplayers[choice4-1].getMoney()+price;
                                                                gameplayers[choice4-1].setMoney(money);

                                                                gameplayers[k].buffaloes[gameplayers[k].total_buffalo] = new Buffalo();
                                                                gameplayers[k].buffaloes[gameplayers[k].total_buffalo].set_data
                                                                        ((gameplayers[choice4-1].buffaloes[gameplayers[choice4-1].total_buffalo-1].get_name()),
                                                                                gameplayers[choice4-1].buffaloes[gameplayers[choice4-1].total_buffalo-1].get_gender());

                                                                gameplayers[choice4-1].total_buffalo = (gameplayers[k].total_buffalo)-1;
                                                                gameplayers[k].total_buffalo = (gameplayers[choice4-1].total_buffalo)+1;
                                                                System.out.println(" You Buy the Buffalo: You Pay Money= "+price+"Rs and this amount is deducted from your account!");
                                                                break;
                                                            }
                                                            else
                                                            {
                                                                System.out.println(" You don't have enough Money! Thanks.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    else
                                                    {
                                                        System.out.println(" You entered invalid choice! Enter correct choice. Thanks.");
                                                    }
                                                }
                                            } else if(choice3==6)
                                            {
                                                break;
                                            }
                                            else {
                                                System.out.println(" You entered invalid choice! Enter correct choice. Thanks.");
                                            }
                                        }
                                    }
                                }
                            }
                            else if (choice == 5)
                            {
                                Store store = new Store();
                                store.saleAnimal(gameplayers, k);
                                break;
                            }
                            else {
                                System.out.println("\n You entered Invalid Choice " +
                                        "\n Please enter correct Choice. Thanks ");
                            }
                        }
                    }
                    for(int i=0;i<players;i++)
                    {
                        if(gameplayers[i].total_cat==0)
                        {

                        }
                        else
                        {
                            for(int k=0; k<gameplayers[i].total_cat;k++)
                            {
                                Random rand = new Random();
                                int upperbound = 30;
                                int int_random = rand.nextInt(upperbound);
                                if(gameplayers[i].cats[k].get_health()>=30)
                                {
                                    int health = gameplayers[i].cats[k].get_health()-int_random;
                                    gameplayers[i].cats[k].set_health(health);
                                }
                                else
                                {
                                    gameplayers[i].cats[k].set_health(0);
                                }
                            }
                        }
                        if(gameplayers[i].total_dog==0)
                        {

                        }
                        else
                        {
                            for(int k=0; k<gameplayers[i].total_dog;k++)
                            {
                                Random rand = new Random();
                                int upperbound = 30;
                                int int_random = rand.nextInt(upperbound);
                                if(gameplayers[i].dogs[k].get_health()>=30)
                                {
                                    int health = gameplayers[i].dogs[k].get_health()-int_random;
                                    gameplayers[i].dogs[k].set_health(health);
                                }
                                else
                                {
                                    gameplayers[i].dogs[k].set_health(0);
                                }
                            }
                        }
                        if(gameplayers[i].total_horse==0)
                        {

                        }
                        else
                        {
                            for(int k=0; k<gameplayers[i].total_horse;k++)
                            {
                                Random rand = new Random();
                                int upperbound = 30;
                                int int_random = rand.nextInt(upperbound);
                                if(gameplayers[i].horses[k].get_health()>=30)
                                {
                                    int health = gameplayers[i].horses[k].get_health()-int_random;
                                    gameplayers[i].horses[k].set_health(health);
                                }
                                else
                                {
                                    gameplayers[i].horses[k].set_health(0);
                                }
                            }
                        }
                        if(gameplayers[i].total_cow==0)
                        {

                        }
                        else
                        {
                            for(int k=0; k<gameplayers[i].total_cow;k++)
                            {
                                Random rand = new Random();
                                int upperbound = 30;
                                int int_random = rand.nextInt(upperbound);
                                if(gameplayers[i].cows[k].get_health()>=30)
                                {
                                    int health = gameplayers[i].cows[k].get_health()-int_random;
                                    gameplayers[i].cows[k].set_health(health);
                                }
                                else
                                {
                                    gameplayers[i].cows[k].set_health(0);
                                }
                            }
                        }
                        if(gameplayers[i].total_buffalo==0)
                        {

                        }
                        else
                        {
                            for(int k=0; k<gameplayers[i].total_buffalo;k++)
                            {
                                Random rand = new Random();
                                int upperbound = 30;
                                int int_random = rand.nextInt(upperbound);
                                if(gameplayers[i].buffaloes[k].get_health()>=30)
                                {
                                    int health = gameplayers[i].buffaloes[k].get_health()-int_random;
                                    gameplayers[i].buffaloes[k].set_health(health);
                                }
                                else
                                {
                                    gameplayers[i].buffaloes[k].set_health(0);
                                }
                            }
                        }
                    }
                    if(j==rounds)
                    {
                        int total =0;
                        double player_final_Data[] = new double[5];
                        for (int i=0;i<players; i++)
                        {
                            double total_amount_player = 0;

                            for(int k=0; k<(gameplayers[i].total_cat);k++)
                            {
                                total_amount_player = total_amount_player + ((gameplayers[k].cats[j].get_health()*gameplayers[k].cats[j].get_price())/100);
                            }
                            for(int k=0; k<(gameplayers[i].total_dog);k++)
                            {
                                total_amount_player = total_amount_player + ((gameplayers[i].dogs[k].get_health()*gameplayers[i].dogs[k].get_price())/100);
                            }
                            for(int k=0; k<(gameplayers[i].total_horse);k++)
                            {
                                total_amount_player = total_amount_player + ((gameplayers[i].horses[k].get_health()*gameplayers[i].horses[k].get_price())/100);
                            }
                            for(int k=0; k<(gameplayers[i].total_cow);k++)
                            {
                                total_amount_player = total_amount_player + ((gameplayers[i].cows[k].get_health()*gameplayers[i].cows[k].get_price())/100);
                            }
                            for(int k=0; k<(gameplayers[i].total_buffalo);k++)
                            {
                                total_amount_player = total_amount_player + ((gameplayers[i].buffaloes[k].get_health()*gameplayers[i].buffaloes[k].get_price())/100);
                            }
                            total_amount_player = total_amount_player + (gameplayers[i].fruits.get_quantity()*gameplayers[i].fruits.get_price());
                            total_amount_player = total_amount_player + (gameplayers[i].vegetables.get_quantity()*gameplayers[i].vegetables.get_price());
                            total_amount_player = total_amount_player + (gameplayers[i].cattlefeeds.get_quantity()*gameplayers[i].cattlefeeds.get_price());
                            total_amount_player = total_amount_player + gameplayers[i].getMoney();

                            player_final_Data[i] =total_amount_player;

                            gameplayers[i].setFinal_amount(total_amount_player);
                            total++;
                        }
                        int max;
                        for(int i=0; i<total;i++)
                        {
                            max =i;
                            for(int k=i+1;k<total;k++)
                            {
                                if(player_final_Data[max] < player_final_Data[k])
                                {
                                    max = k;
                                }
                            }
                            double swap = player_final_Data[max];
                            player_final_Data[max] = player_final_Data [i];
                            player_final_Data[i] = swap;
                        }
                        for (int h=0;h<total;h++)
                        {
                            for(int w=0;w<players;w++)
                            {
                                if(player_final_Data[h]==(gameplayers[w].getFinal_amount()))
                                {
                                    System.out.println("\n Player '"+gameplayers[w].getName()+"' got "+(w+1)+" Position");
                                    System.out.println(" Player '"+gameplayers[w].getName()+"' gained total amount at the end of the game is=  "+(w+1)+" Rs");

                                }
                            }
                        }
                    }
                }
            }
            else
            {
                System.out.println("\nYou not Start the Game yet Now ");
                continue;
            }
        }
    }
}
