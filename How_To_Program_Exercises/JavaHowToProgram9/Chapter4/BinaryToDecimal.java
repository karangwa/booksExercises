/****************************************
 *	Binary To Decimal 					*
 *	Program that inputs a binary number	*
 *	and outputs its decimal equivalent 	*
 ***************************************/
 
 import java.util.Scanner;
 
 public class BinaryToDecimal
 {
	public static void main (String[] args)
	{
		int n,
			binNum, 
			decNum = 0,
			twoMultiple = 1;
			
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a binary number: ");
		n = input.nextInt();
		binNum = n;
		
		while ( binNum != 0)
		{
			decNum += (binNum % 10) * twoMultiple;
			binNum = binNum / 10;
			twoMultiple = twoMultiple * 2;
		}
		
		System.out.printf("\n\nThe decimal equivalent of %d is %d\n\n", n, decNum);
	}
 }