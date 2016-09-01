/************************************************	
 * Program that reads in the size of the side	*
 * square then prints a hollow square of that	*
 * size out of asterisks and blanks				*
 ***********************************************/
 
 import java.util.Scanner;
 
 public class SquareOfAsterisks
 {
	public static void main (String[] args)
	{
		int side, row, column;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the size of the side: ");
		side = input.nextInt();
		
		row = side;
		
		while (row > 0)
		{
			column = side;
		
			while ( column > 0 )
			{
				if (row == side || row == 1 || column == side || column == 1)
					System.out.print('*');
				else	
					System.out.print(' ');
			
				column = column - 1;
			}
			System.out.print('\n');
			row = row - 1;
		}
	}
 }