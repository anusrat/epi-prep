import java.util.*;
import java.lang.*;
import java.io.*;

/* Problem 5.1
How would you compute the parity of a large Number
of 64-bit words. Below solution is the brute force approach
to computing the parity of single long word */
 
public class CheckParity {
  public static long check_parity (long x)
  {
  //Declare variables
  long result = 0;  
  System.out.println(Long.toBinaryString(x));
  while (x != 0)
  {
    //result = (result ^ 1);
    result ^= (x & 1);
    x >>= 1;
  }
  return result;
  }
  
  public static void main (String[] args) throws java.lang.Exception {
    
    System.out.println(check_parity(3));
  }
}
   