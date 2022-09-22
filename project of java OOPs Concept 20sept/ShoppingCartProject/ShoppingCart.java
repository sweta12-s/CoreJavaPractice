/*
Shopping cart
@Author :Sweta Das
@Date: 21sept2022
*/

//declaring class Shopping cart
class ShoppingCart
{
	
	//instance variabe
	private Item[] cart;
	private double billAmount;
	private int storedItems;
	
	// constructor to create cart of  items 4
	ShoppingCart()
	{
		cart= new Item[4];
	}
	
	// constructor to create cart of n items
	ShoppingCart(int size)
	{
		cart = new Item[size];
	}
	
	
	// method to calculate total bill
	public double calBill()
	{
		for(int i=0; i<cart.length;i++)
		{
			billAmount+= cart[i].getTotalPrice();
		}
		
		return billAmount;
	}
	
	
	// method to add item in the cart
	
	public void addItem(Item input)
	{
		if(storedItems<cart.length)
		{
			cart[storedItems]=input;
			storedItems++;
			// to print items added in my cart
			System.out.println(input.getItemName() + ": " + input.getTotalPrice());
		}
		else
		{
			System.out.println("Shopping cart is full");
		}
	}
}
//end of class Shoppingcart