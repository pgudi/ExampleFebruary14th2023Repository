package p1;
interface Product
{
	void showProductName(String name);
}

interface Order
{
	void showOrderItemName(String name);
}

class Mobile implements Product,Order
{
	public void showProductName(String name)
	{
		System.out.println("Product Name :"+name);
	}
	
	public void showOrderItemName(String name)
	{
		System.out.println("Order Item Name :"+name);
	}
}
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Product product=new Mobile();
		product.showProductName("Smart Mobile Phones");
		
		Order order= (Order) product;
		order.showOrderItemName("Samsung Galaxy Phone");

	}

}
