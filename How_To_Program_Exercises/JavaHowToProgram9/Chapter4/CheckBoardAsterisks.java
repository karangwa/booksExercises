/************************************************
 *	Checkboard Pattern of Asterisks				*
 *	Program that displays a checkboard pattern	*
 ***********************************************/
 
 public class CheckBoardAsterisks
 {
	public static void main (String[] args)
	{
		int row = 0, 
			column;
		while (++row < 8 )
		{
			column = 0;
			
			if ( row % 2 == 0)
				System.out.print(' ');
			
			while (++column < 8)
				System.out.print("* "); 
				
			System.out.println();
		}	
	}
 }