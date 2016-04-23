package projecteuler;

import java.awt.event.*; //This holds information on listening for inputs
import java.awt.*;

/*Find the sum of all the multiples of 3 or 5 below 1000.*/

public class Problem1 {
    static int x;
    TextField text = new TextField(20);
    static int value;
    
    public int Solve() {
        
        //The 'numbers' array will hold all the numbers that we will be lopping through.
        //First we create an empty array and set its length:
        int[] numbers = new int[999];
        
        //Then we fill the array with all the numbers:
        for (int n = 1; n < numbers.length + 1; n++){
            numbers[n-1] = n;
            //System.out.println(numbers[n-1]);
        }
        
        //Creating an array to hold all the values that are dividers of 3 and 5.
        //Arrays cannot be created without a length.
        //Because the length is unknown, but less than the length of the 'numbers' array I set it equal to this.
        int[] dividers = new int[numbers.length];
        
        //Now we fill the array with the numbers that are divided by 3 and 5 only:
        for (int i : numbers){
            if (i % 3 == 0){
                dividers[i-1] = i;
            }
            else if (i % 5 == 0){
                dividers[i-1] = i;
            }
        }
        
        //This variable will be the sum of all the numbers divided by 3 and 5:
        x = 0;
        
        //This for loop goes through all the values in the 'dividers' array and adds them to x.
        for (int i : numbers){
            x = x + dividers[i-1];
        }
        
        System.out.println("Problem 1: " + x);
        //value = x;
        return x;
        
        /* Having completed this problem, I realised that the middle bit is not
        needed. (The 'dividers' array with the multipliers)
        Instead I could have just gone straight to calculating x.
        */
        
    }
}