/*

PF1 Lab4

   
Write a Java program that will perform the steps described below.
Your program should perform these steps in the order specified.

Put your lab in the file ~/PF1/lab4/Lab4.java

In each case, if you are asked to display an answer/value, make it
clear what you are printing.  For instance to display the number of
states in the US, you could display:

   The number of states in the US is 50    (or something similar)

If you are not asked to display the answer, that step does not
need to output anything.

Assume the questions are cumulative.  IE any change made in one
step will affect the following steps.

If you want/need to declare/use variables that I did not mention, do so.

Please add comments, etc to your code so I can tell what problem
number each line (or section) of code solves.

You should write, debug and compile this program, leaving the ".class"
file in your directory so that I can run your program to verify it.

I'll grade online and leave comments/grade in a file named README.MCU

=========================================================================


   1)  Using a for loop, display the numbers from 1 to 10, one per line.

   2)  Using a for loop, display the numbers from 10 to 1, one per line,
       with each number followed by an exclamation point.

   3)  For your nerdy amusement, display the the string "Blastoff!!!".  =)

   4)  Use an array initializer to declare and initialize an array called
       "myarray" that initially contains the values

       11, 8, -7, 22, 3, -17, 6, 25, 10, 5, -12, -9, 14, 20, -13

   5)  Display (one per line) the elements of the array "myarray"

   6)  Using a for loop, display the numbers from 0 to 10, counting by two.

   7)  Display the elements in the "myarray" array that are even numbers.

   8)  Display the elements in the "myarray" array that reside at even indexes.

   9)  Display the elements in the "myarray" array that are negative.

   10) Display the elements in the "myarray" array that are multiples of 5.

   11) Calculate and display the sum of all of the array elements in the
       myarray array.

   12) Find the largest element in the "myarray" array.  Save the largest
       value in a variable named "largestNum".  Save the index of the 
       largest value in "indexLargestNum"

   13) Display "largestNum" and "indexLargestNum".

   14) Rewrite the following piece of code using a "while loop":

           for (i=50; i>25; i-=5)
           {
               System.out.println("i = " + i);
           }
*/
public class Lab4{
    public static void main(String[] args){
        //1
        System.out.println("***********************");
        System.out.println("#1");
        for(int i = 1;i < 11;i++){
            System.out.println(i);
	}

        //2
        System.out.println("***********************");
        System.out.println("#2");
        for(int i = 10;i >= 0;i--){
            System.out.println(i);
	}

        //3
        System.out.println("***********************");
        System.out.println("#3");
        System.out.println("Blastoff!!!");

        //4
        System.out.println("***********************");
        System.out.println("#4");
        int[] myarray = {11, 8, -7, 22, 3, -17, 6, 25, 10, 5, -12, -9, 14, 20, -13};
    
        //5
        System.out.println("***********************");
        System.out.println("#5");
        for(int i = 0;i < myarray.length;i++){
            System.out.println(myarray[i]);
	}

        //6
        System.out.println("***********************");
        System.out.println("#6");
        for(int i = 0;i < 11;i+=2){
            System.out.println(i);
	}

        //7
        System.out.println("***********************");
        System.out.println("#7");
        for(int i = 0;i < myarray.length;i++){
            if(myarray[i] % 2 == 0)
            System.out.println(myarray[i]);
	}

        //8
        System.out.println("***********************");
        System.out.println("#8");
        for(int i = 0;i < myarray.length;i++){
            if(i % 2 == 0)
            System.out.println(myarray[i]);
	}


        //9
        System.out.println("***********************");
        System.out.println("#9");
        for(int i = 0;i < myarray.length;i++){
            if(myarray[i] % 2 != 0)
            System.out.println(myarray[i]);
	}

        //10
        System.out.println("***********************");
        System.out.println("#10");
        for(int i = 0;i < myarray.length;i++){
            if(myarray[i] % 5 == 0)
            System.out.println(myarray[i]);
	}

        //11
        System.out.println("***********************");
        System.out.println("#11");
        int sum = 0;
        for(int i = 0;i < myarray.length;i++){
            sum += myarray[i];
	}
        System.out.println("Sum of myarray is " + sum);

        //12
        System.out.println("***********************");
        System.out.println("#12");
        int largestNum = 0;
        int indexLargestNum = 0;
        for(int i = 0;i < myarray.length;i++){
            if(myarray[i] > largestNum) {
                largestNum = myarray[i];
                indexLargestNum = i;
            }
	}

        //13
        System.out.println("***********************");
        System.out.println("#13");
        System.out.println("Largest num is " + largestNum  +  ". Largest num index is " + indexLargestNum);

        //14
        System.out.println("***********************");
        System.out.println("#14");
        int i = 50;
        while(i > 25){
            System.out.println("i = " + i);
            i-=5;
        } 
        


    }
}
