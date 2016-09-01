/****************************************************************	
 * 	This program prints multiples of 2 with an Infinite Loop	*
 ***************************************************************/
 
 public class InfiniteLoopTwoMultiples
 {
	public static void main (String[] args)
	{
		int n = 1;
		while (true)	//Infinite Loop
		{
			System.out.println(n);
			n *= 2; 	
		}
	}
 }