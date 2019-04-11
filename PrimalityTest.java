package bignumbers;

/*
 * A prime number is a natural number greater than 1 whose only positive divisors are 1 and itself. 
 * For example, the first six prime numbers are 2, 3, 5, 7, 11, and 13.
 * Given a large integer, n, use the Java BigInteger class' isProbablePrime method 
 * to determine and print whether it's prime or not prime.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
      boolean primeCheck;
      primeCheck = n.isProbablePrime(1);
      
      
      
      if (primeCheck == true) {
          System.out.println("prime");
      } else {
          System.out.println("not prime");
      }
   }
}