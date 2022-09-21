/*
prohram : Libraby books
@author : Sweta Das
@date :20sept 2022
*/

//declaring a class LibraryB

class LibraryB
{
	
	//declaring instance variables 
	private int serialNo;
	private String bookName;
	private String authorName;
	private double bookPrice;
	
	
	//method to insert Book
    void insertBook(int serialNo, String bookName, String authorName,  double bookPrice)
	{
		this.serialNo=serialNo;
		this.bookName=bookName;
		this.authorName=authorName;
		this.bookPrice=bookPrice;
	}



	//method to display book
	void displayBook()
	{
		System.out.println("SerialNo:"+this.serialNo+"     "+"BookName:"+this.bookName+"   "+"AuthorName:"+this.authorName+"   "+"BookPrice:"+this.bookPrice);
	}
	
	
}
//end of class LibraryB


//declaring class Book

class Book
{
	
	//declaring the main method
	public static void main(String...args)
	{
		//creating book objects
         LibraryB book1= new LibraryB();
         book1.insertBook(1, "believe in Yourself", "Dr. Joseph Murphy" , 350);     //implicit
		 
		 System.out.println();

         LibraryB book2= new LibraryB();
         book2.insertBook(2, "somthing I Never Told You ", "Shravya bhinder",500 );

         

		
		
		//display all the books
		
		book1.displayBook();
		book2.displayBook();
		
	}
	
	//end of main method
	
	
}
//end of class Book