/*

PF1 LAB6

Implement the Taco class that will allow the provided main method to
compile, run, and produce the output as shown below:

Note that all of the information about a customer's Taco (including the
customer name & ingredients) should be printed out in the >print_order<
method (not the constructors, weight or gutBomb methods).

Put your Lab6.java in ~/PF1/lab6

Lab6 class source:  =================================================
public class Lab6
{
    public static void main(String args[])
    {
        int w;

        Taco t0 = new Taco();

        t0.print_order();

        w = t0.weight();
        System.out.println("The above taco weight is: " + w + "\n");

        System.out.println("Invoking the gutBomb special!!!\n");
        t0.gutBomb();

        t0.print_order();

        w = t0.weight();
        System.out.println("The above taco weight is: " + w + "\n");


        Taco t1 = new Taco("Bob", 5,4,3,2);

        t1.print_order();

        w = t1.weight();
        System.out.println("The above taco weight is: " + w + "\n");

        System.out.println("Invoking the gutBomb special!!!\n");
        t1.gutBomb();

        t1.print_order();

        w = t1.weight();
        System.out.println("The above taco weight is: " + w + "\n");
    }
}
=====================================================================

Sample output:

=====================================================================
Making a default Taco...

n/a's taco will have the following ingredients:
2 units of beef,
3 units of beans,
2 units of cheese, and
1 units of lettuce.
The above taco weight is: 8

Invoking the gutBomb special!!!

n/a's taco will have the following ingredients:
4 units of beef,
6 units of beans,
4 units of cheese, and
2 units of lettuce.
The above taco weight is: 16

Making a custom Taco...

Bob's taco will have the following ingredients:
5 units of beef,
4 units of beans,
3 units of cheese, and
2 units of lettuce.
The above taco weight is: 14

Invoking the gutBomb special!!!

Bob's taco will have the following ingredients:
10 units of beef,
8 units of beans,
6 units of cheese, and
4 units of lettuce.
The above taco weight is: 28

=====================================================================
*/


public class Lab6{
   public static void main(String args[])
    {
        int w;

        Taco t0 = new Taco();

        t0.print_order();

        w = t0.weight();
        System.out.println("The above taco weight is: " + w + "\n");

        System.out.println("Invoking the gutBomb special!!!\n");
        t0.gutBomb();

        t0.print_order();

        w = t0.weight();
        System.out.println("The above taco weight is: " + w + "\n");


        Taco t1 = new Taco("Bob", 5,4,3,2);

        t1.print_order();

        w = t1.weight();
        System.out.println("The above taco weight is: " + w + "\n");

        System.out.println("Invoking the gutBomb special!!!\n");
        t1.gutBomb();

        t1.print_order();

        w = t1.weight();
        System.out.println("The above taco weight is: " + w + "\n");
    } 
}
