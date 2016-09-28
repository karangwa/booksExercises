/********************************************************************************	
 *				Displaying a Diamond											*
 *	Program prints a diamond shape using the for loop							* 
 *	The number of rows is determined by the user								*
 * 	PS: User input is not validated												*
 * 	Java How To Program Deitel 9th Edition Exercise 5.25  						*
 ********************************************************************************/
 
import java.util.Scanner;
 
class DisplayingDiamondUserDetermined
{
	public static void main (String[] args)
	{
		int halfRows;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter an odd number between 1 and 19: ");
		halfRows = (input.nextInt() + 1 ) / 2;
		
		for(int row1 = 1; row1 <= halfRows; ++row1)
		{
			int n = halfRows - row1;
			for (int space = n; space > 0; --space)
				System.out.print(' ');
				
			for (int asterisk1 = 0; asterisk1 < row1; ++asterisk1)
				System.out.print('*');
				
			for (int asterisk2 = 0; asterisk2 < row1 - 1; ++asterisk2)
				System.out.print('*');
				
			System.out.println();
		}
		
		for (int row2 = 1; row2 <= halfRows; ++row2)
		{
			int n = halfRows - row2;
			
			for (int space = 0; space < row2; ++space)
				System.out.print(' ');
				
			for (int asterisk1 = n; asterisk1 > 0; --asterisk1)
				System.out.print('*');
				
			for (int asterisk2 = n; asterisk2 > 1; --asterisk2)
				System.out.print('*');
				
			System.out.println();
		}
	}
}
