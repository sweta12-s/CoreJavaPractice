/*Bean class for Items 
@author: Sweta Das
@Date: 21sept 2022
*/


import java.util.*;
//declaring class Item
class Item
{
	//instance variable
	private String itemName;
	private int quantity;
	private double unitPrice;
	private double totalPrice;
	
	Item()           // no arg constructor
	{
		
	}
	
	 //paramaterized constructor
	Item(String itemName, int quantity, double unitPrice, double totalPrice)
	{
		this.itemName=itemName;
		this.quantity=quantity;
		this.unitPrice=unitPrice;
		this.totalPrice= quantity*unitPrice;
	}
	
	//method to insert item
	void insertItem()
  {
	  Scanner sc= new Scanner(System.in);    //for taking input
	  
	   System.out.println("Enter the details of Item:");          //printing item details
	   
	   System.out.println("Item Name:");          //printing item name
	   this.itemName= sc.next();
	   
		System.out.println("Quantity :");              //printing quantity
		this.quantity= sc.nextInt();
		
		System.out.println("unit Price :");              //printing unit Price
		this.unitPrice= sc.nextDouble();
		
		System.out.println("Total Price:");                //printing total price
		this.totalPrice= sc.nextDouble();
    
  }
  
  //method to display item
  void displayItem()
  {
    System.out.println("Item Name:"+ this.itemName+"    "+ "Quantity:"+ this.quantity+ "   "+"Unit Price:"+this.unitPrice+"    "+"Total Price:"+this.totalPrice);
  }

  

	
	//setter and getter
	
	public void setItemName(String itemName)             //itemname
	{
		this.itemName=itemName;
	}
	
	public String getItemName()
	{
		return this.itemName;
	}
	
	public void setQuantity(int quantity)                //quantity
	{
		this.quantity=quantity;
	}
	
	public int getQuantity()
	{
		return this.quantity;
	}
	
	public void setUnitPrice(double unitPrice)                //unitprice
	{
		this.unitPrice=unitPrice;
	}
	
	public double getUnitPrice()
	{
		return this.unitPrice;
	}
	
	public void setTotaltPrice(double totalPrice)           //totalprice
	{
		this.totalPrice=totalPrice;
	}
	
	public double getTotalPrice()
	{
		return this.totalPrice;
	}
	
}


//end of class Item