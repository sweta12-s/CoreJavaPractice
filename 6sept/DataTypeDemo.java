/* program : Understanding data types in java
@author : Shuruti Singhal
@Date : 6 sept 2022
*/

// declaring a class
class DataTypeDemo 
{
	
	// calling main
	static int number;
	public static void main (String args[])
	{
		
		// primitive data types
		
		int number= 78;
		float marks =67.8f;
		short value = (short)-32769; //typecasting
		double percentage = 98.67;
		char grade='A';
		long hugeNumber= 8886785746756353l;
		boolean status=true;
		byte b =(byte)128; //typecasting
		String firstName="Sweta"; //not a primitive data type : String is a class java.lang package
	
		System.out.println(" The value of int is :"+number);
		System.out.println(" The value of short is :"+value);
		System.out.println(" The value of marks is :"+marks);
		System.out.println(" The value of percentage is :"+percentage);
		System.out.println(" The value of grade is :"+grade);
		System.out.println(" The value of hugeNumber is :"+hugeNumber);
		System.out.println(" The status is :"+status);
		System.out.println(" The value of b  is :"+b);
		System.out.println(" The value of string is :"+firstName);
		
	}
	//end of main
	
// end of class DataTypeDemo
}