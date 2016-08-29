//
//	Invoice Test Class
//

public class InvoiceTest
{
	public static void main (String[] args)
	{
		System.out.println("Creating the first invoice\n---------------------------");
		Invoice invoice1 = new Invoice ("95832", "Rick And Morty Season 1", 3, 24.99);
		System.out.printf("Item Description: %s\nItem number: %s\nItem unit price: $%.2f\nItem quantity: %d\nInvoice: $%.2f\n",
						  invoice1.getDescription(), invoice1.getNumber(), invoice1.getPricePerItem(),
						  invoice1.getQuantity(), invoice1.getInvoiceAmount());
		
		System.out.println("\n\n\nCreating the second invoice with negative quantity and price\n------------------------------------------------------------");
		Invoice invoice2 = new Invoice ("A", "B", -4, -20.98);
		
		System.out.printf("Item Description: %s\nItem number: %s\nItem unit price: $%.2f\nItem quantity: %d\nInvoice: $%.2f\n",
						  invoice2.getDescription(), invoice2.getNumber(), invoice2.getPricePerItem(),
						  invoice2.getQuantity(), invoice2.getInvoiceAmount());
						  
		invoice2.setNumber ("44343");
		invoice2.setDescription ("The Zoidberg Tragedy");
		invoice2.setPricePerItem (19.98);
		invoice2.setQuantity (5);
		System.out.println("\n\nAfter setting fields to correct values\n---------------------------------------");
		System.out.printf("Item Description: %s\nItem number: %s\nItem unit price: $%.2f\nItem quantity: %d\nInvoice: $%.2f\n",
						  invoice2.getDescription(), invoice2.getNumber(), invoice2.getPricePerItem(),
						  invoice2.getQuantity(), invoice2.getInvoiceAmount());
		
	}
}