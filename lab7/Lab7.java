/*
PF1 LAB7

NOTE: Place all of the files for this lab in ~/PF1/lab7

For lab7, you will create a TacoSupreme class, which should be a 
subclass of the Taco class from lab6.  A Taco Supreme will have
all of the ingredients of a Taco, plus two more ingredients: sour
cream and black olives.

Copy your Taco.class file from your lab6 directory to your lab7 directory.

**************************************************************************
NOTE: do not copy your Lab6.java source code to your lab7 directory
or duplicate its contents!  Your TacoSupreme class should NOT have class
variables for beef, beans, cheese or lettuce.
**************************************************************************

Create a Lab7.java file with a main method that will do the following:

1.  Create, print, weigh, gutBomb, print and weigh a "default" Taco Supreme.
(see sample output below)

2.  Prompt the customer to enter their name, and the desired amount of
beef, beans, cheese, lettuce, black olives and sour cream.

3.  Create, print, weigh, gutBomb, print and weigh a "custom" Taco Supreme,
using the information gathered from the customer in step #2.

Your output for the "default" TacoSupreme should look similar to the following:
=========================================================================
Making a default Taco...

Making a default TacoSupreme...

n/a's taco will have the following ingredients:
2 units of beef,
3 units of beans,
2 units of cheese, and
1 units of lettuce.
PLUS!!!...
1 units of sour cream, and
1 units of black olives!
The above taco supreme weight is: 10

Invoking the gutBomb special!!!

n/a's taco will have the following ingredients:
4 units of beef,
6 units of beans,
4 units of cheese, and
2 units of lettuce.
PLUS!!!...
2 units of sour cream, and
2 units of black olives!
The above taco supreme weight is: 20

=========================================================================


*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Lab7{
    public static void main(String[] args) throws IOException{
        int w;

        TacoSupreme t0 = new TacoSupreme();

        t0.print_order();

        w = t0.weight();
        System.out.println("The above taco supreme weight is: " + w + "\n");

        System.out.println("Invoking the gutBomb special!!!\n");
        t0.gutBomb();

        t0.print_order();

	w = t0.weight();
        System.out.println("The above taco weight is: " + w + "\n");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


        String name;
        int beef;
        int beans;
        int cheese;
        int lettuce;
        int sourCream;
        int blackOlives;
        
        System.out.print("Enter your name : ");
        name = input.readLine();

        System.out.print("How much beef do you want? Please enter a number : ");
        beef = Integer.parseInt(input.readLine());

        System.out.print("How much beans do you want? Please enter a number : ");
        beans = Integer.parseInt(input.readLine());

        System.out.print("How much cheese do you want? Please enter a number : ");
        cheese = Integer.parseInt(input.readLine());

        System.out.print("How much lettuce do you want? Please enter a number : ");
        lettuce = Integer.parseInt(input.readLine());

        System.out.print("How much sour cream do you want? Please enter a number : ");
        sourCream = Integer.parseInt(input.readLine());

        System.out.print("How much black olives do you want? Please enter a number : ");
        blackOlives = Integer.parseInt(input.readLine());

        TacoSupreme t1 = new TacoSupreme(name, beef, beans, cheese, lettuce, sourCream, blackOlives);
        t1.print_order();

        w = t1.weight();
        System.out.println("The above taco supreme weight is: " + w + "\n");

        System.out.println("Invoking the gutBomb special!!!\n");
        t1.gutBomb();

        t1.print_order();

	w = t1.weight();
        System.out.println("The above taco weight is: " + w + "\n");

    }
}

