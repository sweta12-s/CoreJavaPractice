/*
Program: Creating of Cart
@author: Sweta Das
@Date: 21sept 2022
*/



//declaring class cart
class Cart
{
	

//declaring main method
	public static void main(String ...args)
	{
		Item item1;
		item1= new Item();
		item1.insertItem(); // explicit
		
		Item item2;
		item2= new Item();
		item2.insertItem();
		
		Item item3;
		item3= new Item();
		item3.insertItem();
		
		Item item4;
		item4= new Item();
		item4.insertItem();
		
		ShoppingCart myOwnCart= new ShoppingCart();
		
		myOwnCart.addItem(item1);            //added item from user
		myOwnCart.addItem(item2);
		myOwnCart.addItem(item3);
		myOwnCart.addItem(item4);
		
		//display all the item
		item1.displayItem();
		item2.displayItem();
		item3.displayItem();
		item4.displayItem();
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("-------------------");
		
		System.out.println("Bill Amount :"+myOwnCart.calBill());                   //printing bill amount
		System.out.println("-------------------");
		
		
	}
	
	//end of main method
}

//end of class Cart
	
	
