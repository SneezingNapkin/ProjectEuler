
package projecteuler;

/* Find the difference between the sum of the squares of the first one hundred
natural numbers and the square of the sum. */

public class Problem6 {
    
    public static void main(String[] args) {
        int RANGE = 100;
        int sumOfSquares = 0;
        int sum = 0;
        int squareOfSums = 0;
        int difference;
        
        for (int i = 1; i <= RANGE; i++){
            sumOfSquares += i * i;
            System.out.println("i: " + i);
            System.out.println("sum of squares: " + sumOfSquares);
            sum += i;
            System.out.println("square of sums: " + sum);
        }
        
        squareOfSums = sum * sum;
        System.out.println("square of sums squared: " + squareOfSums);
        
        difference = squareOfSums - sumOfSquares;
        System.out.println("The difference is " + difference);
    }
}
