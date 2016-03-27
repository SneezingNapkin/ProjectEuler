
package projecteuler;

/* Find the difference between the sum of the squares of the first one hundred
natural numbers and the square of the sum. */

public class Problem6 {
    
    public static void main(String[] args) {
        int RANGE = 5;
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
        
        /* My method of getting the number would be incredibly time consuming 
        when looking at bigger numbers.
        
        I should have used the following formula for the sum:
            sum(n) = n (n + 1) / 2
        A visual proof would be great to code here.
        The following website shows three different ways of proving it:
        http://www.maths.surrey.ac.uk/hosted-sites/R.Knott/runsums/triNbProof.html
        
        I should have used the following formula for the square of sums:
            sum(n^2) = (2n + 1)(n + 1) n / 6
        The following website shows how to prove it algebraicly:
        http://mathforum.org/library/drmath/view/56920.html
        For visual proof see:
        https://fr0ddy.github.io/math/visual-proofs/sum-of-first-n-squares.html
                
       */
    }
}
