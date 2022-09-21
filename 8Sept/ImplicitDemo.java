/* program : Implicit Cast
@author : Shuruti Singhal
@Date : 8 sept 2022
*/

//Declaring class 
class ImplicitDemo
{
	// calling main
	public static void main(String [] args)
	{
		
		byte b=6;
		//b= (byte) (b+8);
		//b=b+8; // error :typecast
		b+=8; //implicit cast
		
	
		System.out.println("The value of b is :"+b);

		
	}
	//end of main
}

// ende of class IncrementDemo

		