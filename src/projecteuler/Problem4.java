package projecteuler;

/* Find the largest palindrome made from the product of two 3-digit numbers. */

public class Problem4 {
    
    public int Solve() {
        int a = 999;
        int b = 999;
        int x = a * b; //The number we are trying to see if is palindrome.
        int y = 0;
        
        /*The loop below goes through all the multiplications of a and b as
        their values change from 999 to 100. It uses the 'palindrome' method
        (created at the end) to check if the product of these is a palindrome.
        
        The outer most loop goes through each 'a' value from 999 to 100.
        The inner loop goes through each 'b' value from 999 to 100.
        */
        aloop:
        for (int k = a; k > 100; k--){
            /*This changes the value of 'b' from 100 (which it will be after 
            the inner for loop) to the value that 'a' is. This makes the 'b' 
            value ready for the next loop with a lower 'a'.
            */
            b = a;
            
            //Resets x to equal a * b again now with their new values:
            x = a * b;
            //This loops through all the 'b' values from 999 to 100:
            for (int j = b; j > 100; j--){
                //Check if the number is a palindrome using a method created further down:
                if (palindrome(x)){
                    //If the number is a palindrome and if it is higher than 
                    //the previous palindrome found it is stored in 'y'.
                    if (y < x){
                        y = x;
                    }
                    //If a palindrome is found there is no point going lower
                    //down the list (all other palindromes with same 'a' but 
                    //changing 'b' will be lower than the one found:
                    break;
                }
                b--;
                x = a * b;
            }
            a--;
        }
        System.out.println("The largest palindrom is: " + y);
        
            /* //Checking if palindrome:
            for (int i = 0; i < y.length()-1; i++){
                System.out.println(y);
                if (y.charAt(i) == y.charAt(y.length()-(i+1))){
                    System.out.println(y.charAt(i) + " is the same same as " + y.charAt(y.length()-(i+1)));
                }
                else {
                    System.out.println(y.charAt(i) + " is different from " + y.charAt(y.length()-(i+1)));
                }
            }*/
        return y;
    }
    
    // http://java67.blogspot.fi/2012/09/palindrome-java-program-to-check-number.html
    public static boolean palindrome(int number){
        int palindrome = number;
        int reverse = 0;
        
        while (palindrome != 0){
            int remainder = palindrome % 10;
            //System.out.println("remainder: " + remainder);
            reverse = reverse * 10 + remainder;
            //System.out.println("reverse: " + reverse);
            palindrome = palindrome / 10;
            //System.out.println("palindrome: " + palindrome);
        }
        
        if (number == reverse){
            return true;
        }
        return false;
    }
    
}
