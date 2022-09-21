/*
Program: Declaring a Library Book using Array
@author : Sweta Das
@date: 20sept 2022
*/
//declaring a libraryB class
class LibraryB
{
  //declaring instance variables 
	private int serialNo;
	private String bookName;
	private String authorName;
	private double bookPrice;
	
	
	LibraryB(int serialNo, String bookName, String authorName, double bookPrice)
	{
		this.serialNo=serialNo;       //printing the value with this keyword
		this.bookName=bookName;
		this.authorName=authorName;
		this.bookPrice=bookPrice;
	}
		
		
	
	//method to display book
	void displayBook()
	{
		System.out.println("SerialNo:"+this.serialNo+"     "+"BookName:"+this.bookName+"   "+"AuthorName:"+this.authorName+"   "+"BookPrice:"+this.bookPrice);
	}
	
	//end of method display
	
	
}
//end of class LibraryB


//declaring class BookArray

class BookArray
{
	
	//declaring the main method
	public static void main(String...args)
	{

		LibraryB book[] = new LibraryB[4]; // creates an array of Book
		
		//creating objects of book
		book[0]= new LibraryB(1, "The Secret garden", "Freances Eliza Hodgson Burnett",245);
		book[1]= new LibraryB(2, "The Girl Who Knew Too Much", "vikrant Khanna", 150);
		book[2]= new LibraryB(3, "Sesher Kobita", "Rabindranath Tagore", 350);
		book[3]= new LibraryB(4, "Santa Biblia", "Reina Valera", 450 );
		
		
		// displaying all the books in Library
		for(int p=0; p<book.length;p++)
		{
			book[p].displayBook();
		}
		
		
		/*LibraryB b1= new LibraryB();
		b1.displayBook();*/
	}
	
	//end of main method
	
	
}
//end of class BookArray