/*
prohram : declaring a class and its object (Library Book) (taking user input)
@author : Sweta Das
@date :20sept 2022
*/

import java.util.*;

//declaring a class LibraryB
class LibraryB
{
	
	//declaring instance variables 
	private int serialNo;
	private String bookName;
	private String authorName;
	private double bookPrice;
	
	
	//method to insert Book
    void insertBook()
	{
		
		
		Scanner sc= new Scanner(System.in);   // for taking user input
	  
	    System.out.println("Enter the Book Details:");  //printing the book details
	   
	    System.out.println("Serial No:");    //printing the serial no
	    this.serialNo= sc.nextInt();
	   
		System.out.println("Book Name:");     //printing the book name
		this.bookName= sc.next();
		
		System.out.println("Author Name:");       //printing the author name
		this.authorName= sc.next();
		
		System.out.println("Book Price:");      //printing the book price
		this.bookPrice= sc.nextDouble();
	}
	
	//end of method
	
	

	//method to display book
	void displayBook()
	{
		System.out.println("SerialNo:"+this.serialNo+"     "+"BookName:"+this.bookName+"   "+"AuthorName:"+this.authorName+"   "+"BookPrice:"+this.bookPrice);
	}
	
	//end of method displya
	
	
}
//end of class LibraryB


//declaring class BookInput

class BookInput
{
	
	//declaring the main method
	public static void main(String...args)
	{

		LibraryB book1= new LibraryB();
		book1.insertBook(); // explicit
		
		LibraryB book2= new LibraryB();
		book2.insertBook();
		
		
		System.out.println();
		System.out.println("---------------------My Library----------------------");
		
		//display all the book 
		book1.displayBook();
		book2.displayBook();
		
		System.out.println("---------------------------------------------------");
         		
	}
	
	//end of main method
	
	
}
//end of class BookInput