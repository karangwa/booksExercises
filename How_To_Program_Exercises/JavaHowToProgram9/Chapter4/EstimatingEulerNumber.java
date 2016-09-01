/********************************************************************
 * Program that estimates the value of the mathematical constant e	*
 *******************************************************************/
 
 public class EstimatingEulerNumber
 {
	public static void main (String[] args)
	{
		//Initialize variables
		int n = 0;
		double e = 1;
		
		//Calculate e
		while (++n < 10)
		{
			//Calculate n!
			int factorial = 1;
			int factControl = n;
			
			while (factControl > 0)
			{
				factorial = factorial * factControl;
				factControl--;
			}
			
			
			//Calculate current iteration value of e
			e += 1.0 / factorial;
		}
		
		//Print e
		System.out.printf("\ne = %f\n", e);
	}
 }