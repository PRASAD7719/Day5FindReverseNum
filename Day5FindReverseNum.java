/* I/P :{10,20,30,40,50}
 * O/P :{50,40,30,20,10}
 * 
 */
package main1;

public class Day5FindReverseNum {
	public static void main(String[] args) {
		
	      int no=5432,rem,rev=0;
	      while(no!=0)
	      {
	    	      rem=no%10;
	    	      rev=rev*10+rem;
	    	      no=no/10;
	      }
		      System.out.println(rev);
		
			
		}
	}


