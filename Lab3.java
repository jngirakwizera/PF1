/*
PF1 Lab3


Write a Java program that will perform the steps described below.
Your program should perform these steps in the order specified.

Put your lab in the file ~/PF1/lab3/Lab3.java

In each case, if you are asked to display an answer/value, make it
clear what you are printing.  For instance to display the number of
states in the US, you could display:

   The number of states in the US is 50    (or something similar)

or even:

    states = 50

so I can tell what the numbers are that are being displayed!

If you are not asked to display the answer, that step does not
need to output anything.

Assume the questions are cumulative.  IE any change made in one
step will affect the following steps.

If you want/need to declare/use variables that I did not mention, do so.

You should write, debug and compile this program, leaving the ".class"
file in your directory so that I can run your program to verify it.

I'll grade online and leave comments/grade in your README.MCU file.

=========================================================================

1)  Declare a variable to store the number of cousins that you have.
    Initialize the variable as appropriate, and display the variable.

2)  Declare a variable named "tonsils" that can best be used to store the
    fact that you have, or have not had your tonsils removed.  Make an
    appropriate initialization of the variable and display it.

3)  Declare a variable that can store your first name.  Declare another
    variable that can store your last name.  Initialize them as appropriate.
    Print the variables out (along with other String constants as necessary)
    as shown below:

         Hello, my name is FIRST LAST.

    Use the variables to print them out as follows:

         LAST, FIRST is my name.

    Obviously (?), your output will display your actual name instead
    of LAST and FIRST!

4)  Google the forumula for the "Imperial BMI Formula" which can be used
    to calculate your body mass index.  Write a line or two of code to
    calculate and display the BMI for a person that is 5'6", 140lbs.

5)  Assuming that the US national debt is 28 trillion dollars, and there
    are 143 million taxpayers, write a few lines of code to calculate and
    display each taxpayer's share of the debt.

6)  Declare a one dimensional array named "myArray" that can store
    five integers.

    Assign the elements in the array with the values 4,7,5,2,9 with
    five separate assignment statements.

7)  Declare a second array named "myOtherArray" and initialize it as
    the array above using an array initializer.

*/


public class Lab3{
    public static void main(String[] args){

        int numOfCousins = 8;
        boolean tonsils = true;
        String firstName = "Jean";
        String lastName = "Ngirakwizera";
        System.out.println(lastName + "," + firstName + " is my name.");
        
        double personBMI = 63.5029 / (1.6764*1.6764);
        System.out.println("This person's BMI is " + personBMI);

        int[] myArray = new int[5];
        myArray[0] = 4;
        myArray[1] = 7;
        myArray[2] = 5;
        myArray[3] = 2;
        myArray[3] = 9;
        int[] myOtherArray = { 4,7,5,2,9};

  
    }
}

