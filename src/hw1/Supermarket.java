package hw1;

public class Supermarket
{
	public static void main(String[] args)
	{
		Customer oh=new Customer();
		Customer kim=new Customer();
		POST post=new POST(oh);
		
		oh.chooseToBuy();
		oh.chooseToBuy();		
		post.treatCustomer();
		
		kim.chooseToBuy();
		kim.chooseToBuy();
		kim.chooseToBuy();
		post.newCustomer(kim);
		post.treatCustomer();
	}
}
