/****************************************	
 *	program that uses a while statement	* 
 *	and the tab escape sequence \t to	*
 *	print the following table of values:*
 *	N 	10*N  100*N 1000*N				*
 *	1 	10    100 	1000				*
 *	2 	20    200 	2000				*
 *	3 	30 	  300 	3000				*
 *	4 	40 	  400 	4000				*
 *	5 	50 	  500 	5000				*
 ****************************************/
 
 class TabularOutput
 {
	public static void main (String[] args)
	{
		int counter = 0;
		System.out.println("N\t10*N\t100*N\t1000*N\n");
		
		while (counter++ < 5)
		{
			System.out.printf("%d\t%d\t%d\t%d\n",counter, counter * 10, counter * 100, counter * 1000);
		}
	}
 }