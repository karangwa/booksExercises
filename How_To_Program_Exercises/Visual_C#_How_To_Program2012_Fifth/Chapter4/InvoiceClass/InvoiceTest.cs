//
//	InvoiceTest Class
//

using System;

class InvoiceTest
{
	public static void Main(string[] args)
	{
		Invoice invoice1 = new Invoice ( "23422", "Futurama Season 1", 30.00M, 4);
		
		invoice1.Description = "Futurama Season 1 & 2";
		invoice1.PricePerItem = -22.00M;	//Should not change the price from 30.00M 
		
		Console.WriteLine("Item Decription: {0}\nItem Number: {1}", invoice1.Description, invoice1.Number);
		
		Console.WriteLine("Item Unit Price: {0:C}\nItem quantity: {1}", invoice1.PricePerItem, invoice1.Quantity);
		
		Console.WriteLine("Invoice Amount: {0:C}", invoice1.GetInvoiceAmount());
		
		
	}
}