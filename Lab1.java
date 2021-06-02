import java.io.*;
//
//Program name: Lab1
//
// Purpose : Practice editing, compiling, debugging and running a Java program.
//

public class Lab1
{
    public static void main(String args[]) throws IOException
    {
        //declare our variables:
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


        String input_string;
	int grade;
	int count;
	int sum;
	double avg;


	//initialize count and sum.
	// why do the other variables not need to be initialized??
	count = 0;
	sum = 0;


	while(true)
	{
	    //prompt the user to eneter a number
	    System.out.print("enter a number (-1 to quit): ");
	    input_string = input.readLine();
	    grade = Integer.parseInt(input_string);

	    //see if it is time to go!
	    if (grade == -1) break;

	    //perform necessary calculations
	    count = count + 1;
	    sum = sum + grade;

	    //display results of calculations to user
	    System.out.println("count = " + count);
	    System.out.println("sum = " + sum + "\n");
	}


	//calculate and display overall average
	avg = (float) sum/count;
	System.out.println("Average = " + avg);

    }
}
