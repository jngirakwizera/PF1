
/*

PF1 Lab5

   
Write a program that generates a random number between 1 and 10 and
asks the user to guess what the number is.  Your program should operate
similar to mine, who's output is shown below:

=========================================================
$ java Lab5
enter a number between 1 and 10: 5
Your guess of 5 is too low.
enter a number between 1 and 10: 7
Your guess of 7 is too high.
enter a number between 1 and 10: 6
Your guess of 6 is CORRECT!

Your guesses were:  5  7  6
=========================================================

Your program should give the user a maximum of five guesses.
After five guesses, the program should display a message
and exit as shown below:

=========================================================
$ java Lab5
enter a number between 1 and 10: 5
Your guess of 5 is too low.
enter a number between 1 and 10: 4
Your guess of 4 is too low.
enter a number between 1 and 10: 3
Your guess of 3 is too low.          (a particularly unskilled player!)
enter a number between 1 and 10: 2
Your guess of 2 is too low.
enter a number between 1 and 10: 1
Your guess of 1 is too low.
Better luck next time!

Your guesses were:  5  4  3  2  1
=========================================================

Note that in both sets of output that the program keeps track
of the guesses as the user makes them and then displays the
guesses at the end of the game.

*** Your solution should save the guesses using an arrays! ***

Put your lab in the file ~/PF1/lab5/Lab5.java



*/

import java.io.*;
import java.util.*;


public class Lab5{
    public static void main(String[] args) throws IOException{

//declare our variables:
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


        String input_string;
	Random randomNumber = new Random();
	int number = randomNumber.nextInt(10);
        int userChoice = 0;
        int wrongAnswers = 0;

	while(true)
	{
	    //prompt the user to eneter a number
	    System.out.print("enter a number (-1 to quit): ");
	    input_string = input.readLine();
	    userChoice = Integer.parseInt(input_string);

	    //see if it is time to go!
	    if (userChoice == -1 || wrongAnswers == 5) break;


            if(userChoice == number){
                System.out.println("Your guess of " + userChoice + " is CORRECT");
                break;
            }
            else if(userChoice < number){
                System.out.println("Your guess of " + userChoice + " is too low.");
                wrongAnswers++;
		if(wrongAnswers == 5){
                     break;
		}
            }
            else if(userChoice > number){
                System.out.println("Your guess of " + userChoice + " is too high.");
                wrongAnswers++;
		if(wrongAnswers == 5){
                     break;
		}
            }

	}

        if(wrongAnswers == 5){
            System.out.println("Better luck next time");
        }



    }
}
