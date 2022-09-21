/* program : Increment 
@author : Shuruti Singhal
@Date : 8 sept 2022
*/

//Declaring class 
class IncrementDemo
{
	// calling main
	public static void main(String [] args)
	{
		
		int a=10;
		int b=10;
		
		System.out.println(a++ + ++a + a++);
		/* 10+12+12 =34 
		a=13*/
		
		System.out.println(b++ + b++ + ++b);
		/*10+11+13=34
		b=13*/
		
	}
	//end of main
}

// ende of class IncrementDemo
		