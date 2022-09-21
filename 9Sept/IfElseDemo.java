/* program : IfElseDemo (Greater of 2 nos)
@author : Shuruti Singhal
@Date : 9 sept 2022
*/


//Declaring class
class IfElseDemo
{
 // calling main
 public static void main(String [] args)
 {
	 int number1= Integer.parseInt(args[0]); //taking input
	 int number2= Integer.parseInt(args[1]);
	 
	 // comparing the 2 numbers
	 if(number1 == number2)
	 {
		 System.out.println("Number "+number1 +" is equal to "+number2);
	 }
	 
	 else if(number1>number2)
	 {
		 System.out.println("Number "+number1 +" is greater than "+number2);
	 }
	 
	 else //dangling else
	 {
		 System.out.println("Number "+number2 +" is greater than "+number1);
	 }
	 
 }
 //end of main
}

// end of class IfElseDemo