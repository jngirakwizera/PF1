/*

PF1
Lab8 - Wallet!


For this lab, you will create a virtual wallet that can be used
to store virutal paper money.  You will provide methods to
create/initialize the Wallets, compare two Wallets, add more
money to a Wallet, dump the contents of one Wallet to another,
and make a purchase using a Wallet (subtracting the purchase price
from a Wallet).

Instead of a lengthy description for how the methods should
function, I am going to provide you with a test program that
will be the "customer" for your class.  This will allow you 
to determine what methods/etc you need to provide.

I'm also providing you with the output that this test program
produced when I ran it with my Wallet class.  You need to
CAREFULLY STUDY the output and the test program to see how the
methods should function.  This is a logic problem in itself!

One hint is to notice that the subtract method, which is used
to make a purchase of the specified amount should always return
a Wallet with the fewest amount of bills in it.  In other words,
you hand a clerk your moneybag, and he/she will "optimize" your
change by returning it with the SMALLEST number of bills possible!
So provided that your Wallet contains enough money to cover the
price of the purchase, the composition of the change in the Wallet
will not affect the composition of the change returned, which will
always contain the fewest bills possible.

Your lab8 source code should be in the directory ~/PF1/lab8, and
should include the main method provided below.

Note:  Your program should work for other sets of test data.

NOTE2:  DO NOT MODIFY THE CODE I PROVIDE FOR YOU!!!!!!

= OUTPUT ============================================================
w0:
twenties = 0, tens  = 0, fives = 0, ones = 0
value = 0

w1:
twenties = 1, tens  = 2, fives = 3, ones = 4
value = 59

adding $50 to w0
w0:
twenties = 2, tens  = 1, fives = 0, ones = 0
value = 50

Comparing w0 and w1: IS LESS THAN

Adding $9 to w0
w0:
twenties = 2, tens  = 1, fives = 1, ones = 4
value = 59

Comparing w0 and w1: IS EQUAL TO

Adding $1 to w0
w0:
twenties = 2, tens  = 1, fives = 1, ones = 5
value = 60

Comparing w0 and w1: IS GREATER THAN

Adding contents of w1 into w0
w0:
twenties = 3, tens  = 3, fives = 4, ones = 9
value = 119

w1:
twenties = 0, tens  = 0, fives = 0, ones = 0
value = 0

Creating a new Wallet
w2:
twenties = 5, tens  = 4, fives = 3, ones = 2
value = 157

Subtracting $210
Insufficient funds - purchase denied.
w2:
twenties = 5, tens  = 4, fives = 3, ones = 2
value = 157

Oops, let's try $120
w2:
twenties = 1, tens  = 1, fives = 1, ones = 2
value = 37

Subtracting $14
w2:
twenties = 1, tens  = 0, fives = 0, ones = 3
value = 23


*/
public class Lab8
{
    public static void main(String args[])
    {
        Wallet w0 = new Wallet();
        Wallet w1 = new Wallet(1, 2, 3, 4);
        int value;

        System.out.println("w0:");
        w0.printContents();
        value = w0.getValue();
        System.out.println("value = " + value + "\n");

        System.out.println("w1:");
        w1.printContents();
        value = w1.getValue();
        System.out.println("value = " + value + "\n");

        System.out.println("adding $50 to w0");
        w0.add(2, 1, 0, 0); 

        System.out.println("w0:");
        w0.printContents();
        value = w0.getValue();
        System.out.println("value = " + value + "\n");

        System.out.print("Comparing w0 and w1: ");
        w0.compare(w1);

        System.out.println("\nAdding $9 to w0");
        w0.add(0, 0, 1, 4); 

        System.out.println("w0:");
        w0.printContents();
        value = w0.getValue();
        System.out.println("value = " + value + "\n");

        System.out.print("Comparing w0 and w1: ");
        w0.compare(w1);

        System.out.println("\nAdding $1 to w0");
        w0.add(0, 0, 0, 1); 

        System.out.println("w0:");
        w0.printContents();
        value = w0.getValue();
        System.out.println("value = " + value + "\n");

        System.out.print("Comparing w0 and w1: ");
        w0.compare(w1);

        System.out.println("\nAdding contents of w1 into w0");
        w0.add(w1); 
        System.out.println("w0:");
        w0.printContents();
        value = w0.getValue();
        System.out.println("value = " + value + "\n");
        System.out.println("w1:");
        w1.printContents();
        value = w1.getValue();
        System.out.println("value = " + value + "\n");

        System.out.println("Creating a new Wallet");
        Wallet w2 = new Wallet(5, 4, 3, 2);
        System.out.println("w2:");
        w2.printContents();
        value = w2.getValue();
        System.out.println("value = " + value + "\n");

        System.out.println("Subtracting $210");
        w2 = w2.subtract(210);
        System.out.println("w2:");
        w2.printContents();
        value = w2.getValue();
        System.out.println("value = " + value + "\n");

        System.out.println("Oops, let's try $120");
        w2 = w2.subtract(120);
        System.out.println("w2:");
        w2.printContents();
        value = w2.getValue();
        System.out.println("value = " + value + "\n");

        System.out.println("Subtracting $14");
        w2 = w2.subtract(14);
        System.out.println("w2:");
        w2.printContents();
        value = w2.getValue();
        System.out.println("value = " + value + "\n");
    }
}
