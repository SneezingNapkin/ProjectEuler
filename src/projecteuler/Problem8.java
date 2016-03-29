
package projecteuler;

/*
The four adjacent digits in the 1000-digit number that have the greatest 
product are 9 × 9 × 8 × 9 = 5832.

73167176531330624919225119674426574742355349194934
96983520312774506326239578318016984801869478851843
85861560789112949495459501737958331952853208805511
12540698747158523863050715693290963295227443043557
66896648950445244523161731856403098711121722383113
62229893423380308135336276614282806444486645238749
30358907296290491560440772390713810515859307960866
70172427121883998797908792274921901699720888093776
65727333001053367881220235421809751254540594752243
52584907711670556013604839586446706324415722155397
53697817977846174064955149290862569321978468622482
83972241375657056057490261407972968652414535100474
82166370484403199890008895243450658541227588666881
16427171479924442928230863465674813919123162824586
17866458359124566529476545682848912883142607690042
24219022671055626321111109370544217506941658960408
07198403850962455444362981230987879927244284909188
84580156166097919133875499200524063689912560717606
05886116467109405077541002256983155200055935729725
71636269561882670428252483600823257530420752963450

Find the thirteen adjacent digits in the 1000-digit number that have the 
greatest product. What is the value of this product?
 */

import java.math.BigInteger; //Imported so that I could store the 1000 digit number.

public class Problem8 {
    
    public static void main(String[] args) {
        
        int NUMBER = 13; // Number of adjacent digits to look at.
        
        // Big integer needs to be used because the number is too big even for long.
        BigInteger bigNumber = new BigInteger(
        "73167176531330624919225119674426574742355349194934" +
        "96983520312774506326239578318016984801869478851843" +
        "85861560789112949495459501737958331952853208805511" +
        "12540698747158523863050715693290963295227443043557" +
        "66896648950445244523161731856403098711121722383113" +
        "62229893423380308135336276614282806444486645238749" +
        "30358907296290491560440772390713810515859307960866" +
        "70172427121883998797908792274921901699720888093776" +
        "65727333001053367881220235421809751254540594752243" +
        "52584907711670556013604839586446706324415722155397" +
        "53697817977846174064955149290862569321978468622482" +
        "83972241375657056057490261407972968652414535100474" +
        "82166370484403199890008895243450658541227588666881" +
        "16427171479924442928230863465674813919123162824586" +
        "17866458359124566529476545682848912883142607690042" +
        "24219022671055626321111109370544217506941658960408" +
        "07198403850962455444362981230987879927244284909188" +
        "84580156166097919133875499200524063689912560717606" +
        "05886116467109405077541002256983155200055935729725" +
        "71636269561882670428252483600823257530420752963450");
        /* Actually I didn't need to use BigInteger. I could have stored the 
        number as a string rigt away and not have to convert it later on.
        */
        
        /* Once I stored the number I needed to convert it into a string format
        so that I could iterate through it. BigInteger does let you use an index
        to look through it.
        */
        String stringBigNumber = bigNumber.toString();
        long product = 0L; //some of the products will be very long.
        
        System.out.println(stringBigNumber.length());
        System.out.println(bigNumber);
        System.out.println(stringBigNumber.charAt(1));
        
        // Had to create two for loops. 
        // One going through all the numbers in the 1000 digit number.
        // One going through all the numbers in the specified range.
        for (int i = 0; i <= stringBigNumber.length() - NUMBER; i++){
            long tempProduct = 1L; //some of the products will be very long.
            System.out.println("Product is: " + product);
            for (int j = i; j < i + NUMBER; j++){
                //System.out.println("j is: " + j);
                //System.out.println("number at j: " + stringBigNumber.charAt(j));
                
                /* Because the number in position j is a character, it will not
                have the same "value" as the number (so 7 is value 55 in character
                form). I need to convert the character into an integer or the 
                product will be wrong.
                */
                int x = Character.getNumericValue(stringBigNumber.charAt(j)) ;
                if (x == 0){
                    break;
                // If there is a 0 in the range, the product will be 0.
                }
                tempProduct *=  x; // multiply all numbers in range to get the product.
            }
            System.out.println("Temporary product is: " + tempProduct);
            if (tempProduct > product){
                product = tempProduct;
            } 
       }
        System.out.println(product);
    }
}