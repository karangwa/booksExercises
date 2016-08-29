//
//	Invoice Class 
//

public class Invoice
{
	private String number;
	private String description;
	private int quantity;
	private double pricePerItem;
	
	public Invoice (String n, String d, int q, double p)
	{
		number = n;
		description = d;
		
		if ( q > 0 )
			quantity = q;
			
		if ( p > 0.0 )
		pricePerItem = p;
	}
	
	public String getNumber ()
	{
		return number;
	}
	
	public void setNumber (String n)
	{
		number = n;
	}
	
	public String getDescription ()
	{
		return description;
	}
	
	public void setDescription (String d)
	{
		description = d;
	}
	
	public int getQuantity ()
	{
		return quantity;
	}
	
	public void setQuantity (int q)
	{
		if ( q >= 0)
			quantity = q;
		else
			quantity = 0;
	}
	
	public double getPricePerItem ()
	{
		return pricePerItem;
	}
	
	public void setPricePerItem (double p)
	{
		if ( p >= 0.0)
			pricePerItem = p;
		else	
			pricePerItem = 0.0;
	}

	public double getInvoiceAmount ()
	{
		return pricePerItem * quantity;
	}
}