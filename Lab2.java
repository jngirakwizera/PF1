import java.io.*;
import java.lang.Math.*;
//
//Program name: Lab2
//
//
/*

PF1 Lab2

In class, we discussed variable declarations, assignment statements,
arithmetic expressions, etc and developed a simple program that would
calculate the area of a circle who's radius was "hard coded".

Take that program, and your Lab1 and combine them into
a single program that will serve as an Interactive Area Calculator!

Your program will prompt the user to enter a radius for a circle (which
we will assume is an integer), calculate and display the area, and
then repeat, until the value "-1" is entered.

The path to your program should be:  ~/PF1/lab2/Lab2.java

Note:  Remove any "extra" code from your Lab1 that is not needed
in this program.  Name your variables appropriately and have the output
from your program (both the prompt and the results) be descriptive, etc.

Note2:  A "bare bones" version of this lab will be worth at most 90 points.
Go beyond that and add extra functionality to the interface, perform
more calculations, etc.

*/

public class Lab2
{
    public static void main(String args[]) throws IOException
    {
        //declare our variables:
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


        String input_string;
	int radius;
	double pi = Math.PI;
	double area;
	double circumference;
	double diameter;


	//initialize count and sum.
	// why do the other variables not need to be initialized??


	while(true)
	{
	    //prompt the user to eneter a number
	    System.out.println("*******************************************");
	    System.out.print("Enter the radius of your circle (-1 to quit): ");
	    input_string = input.readLine();
	    radius = Integer.parseInt(input_string);

	    //see if it is time to go!
	    if (radius == -1) break;

	    //perform calculations
            area = pi * radius * radius;
            circumference = pi * radius * 2;
            diameter = radius * 2;

	    //display results of calculations to user
	    System.out.println("Radius of the circle  = " + radius);
	    System.out.println("Area of the circle = " + area);
	    System.out.println("Circumference of the circle = " + circumference);
	    System.out.println("Diameter of the circle = " + diameter);
	    System.out.println("*******************************************");
	}

        System.out.println("Thank you for using the Jean calculator");
	System.out.println();


    }
}
