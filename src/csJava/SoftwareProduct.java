package csJava;

public class SoftwareProduct {
	int typeOfPurchase;
	int quantity;
	
	public SoftwareProduct(int type, int qty)
	{
		this.typeOfPurchase = type;
		this.quantity = qty;
	}
	
	public void setType(int t)
	{
		this.typeOfPurchase=t;
	}
	
	public int getType()
	{
		return this.typeOfPurchase;
	}
	public void setQuantity(int q)
	{
		this.quantity+=q;
	}
	public int getQuantity()
	{
		return this.quantity;
	}
	
	public double calculateTotalCost()
	{
		double sum=0.0;
		double finalPrice=0.0;
		double discount = 0.0;
		if(this.typeOfPurchase == 1)
		{
			discount = 99.00 * (20 / 100.00) ;
			finalPrice = 99.00 - discount;
			
		}
		else if(this.typeOfPurchase == 2)
		{
			discount = 199.00 * (15 / 100.00) ;
			finalPrice = 199.00 - discount;
		}
		else if(this.typeOfPurchase == 3)
		{
			discount = 299.00 * (10 / 100.00) ;
			finalPrice = 299.00 - discount;
		}
		sum = finalPrice * this.quantity;
		return sum;
	}
	
}
