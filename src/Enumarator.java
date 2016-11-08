enum mango{
	badami(10), raspuri(30), malgova(45), tothapuri(50);
	private int price;
	mango(int p){
		price = p;
	}
	
	int getprice()
	{
		return price;
	}
}
public class Enumarator {

	
	
	public void main_program()
	{
		mango m[] = mango.values();
		
		for(mango mg: m)
		{
			System.out.println(mg + "   "+ mg.getprice());
		}
	}
}
