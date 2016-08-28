//
//	Invoice Class
//

using System;

class Invoice
{
	private string number;
	private string description;
	private decimal pricePerItem;
	private int quantity;
	
	public Invoice ( string n, string d, decimal p, int q)
	{
		Number = n;
		Description = d;
		PricePerItem = p;
		Quantity = q;
	}

	public string Number
	{
		get { return number; }
		set { number = value; }
	}
	
	public string Description
	{
		get { return description; }
		set { description  = value; }
	}
	
	public decimal PricePerItem 
	{
		get { return pricePerItem; }
		set 
		{
			if ( value >= 0.0M )
				pricePerItem = value; 
		}
	}
	
	public int Quantity
	{
		get { return quantity; }
		set 
		{
			if ( quantity >= 0 )
				quantity = value; 
		}
	}

	public decimal GetInvoiceAmount ()
	{
		return PricePerItem * Quantity;
	}
}