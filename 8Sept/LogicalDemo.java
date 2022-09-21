/* program : Logical Operators Demo
@author : Shuruti Singhal
@Date : 8 sept 2022
*/

//Declaring class 
class LogicalDemo
{
	// calling main
	public static void main(String [] args)
	{
		boolean b1=true, b2=false;
		
		//Logical Operation
		System.out.println("Logical OR output is:"+ (b1|b2));
		System.out.println("Logical AND output is:"+ (b1&b2)); //(&-> amphersand)
		System.out.println("Logical XOR output is:"+ (b1^b2));
		System.out.println("Logical NOT output is:"+ (!b2));
		
		
	}
	//end of main
}
// end of class LogicalDemo
		