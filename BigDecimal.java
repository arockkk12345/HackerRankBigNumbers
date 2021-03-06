package bignumbers;

/*
 * Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!
 * Given an array, s, of n real number strings, sort them in descending order � but wait, there's more! 
 * Each number must be printed in the exact same format as it was read from stdin, meaning that .1 is printed as .1,
 *  and 0.1 is printed as 0.1. If two numbers represent numerically equivalent values (e.g., .1 = 0.1 ),
 *   then they must be listed in the same order as they were received as input).
 *   
 *   Complete the code in the unlocked section of the editor below. 
 *   You must rearrange array s's elements according to the instructions above.
 */

import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

		Arrays.sort(s, new Comparator<String>() {
		  @Override
		  public int compare(String o1, String o2) {
			if (o1 == null || o2 == null) {
			    return 0;
			}
			BigDecimal o1bd = new BigDecimal(o1);
			BigDecimal o2bd = new BigDecimal(o2);
			return o2bd.compareTo(o1bd);
		  }
		});

		//Output
		for(int i=0;i<n;i++)
		{
		    System.out.println(s[i]);
		}
    }
}