/* program : IfElseDemo2
@author : Shuruti Singhal
@Date : 9 sept 2022
*/


//Declaring class
class IfElseDemo2
{
 // calling main
 public static void main(String [] args)
 {
	 //int age=34;
	 int age=18;
	 //int age= Integer.parseInt(args[0]); //taking input and parsing
	 
	 // calling the age
	 if(age>=18)
	 {
		 System.out.println("You can vote"); // printing 
	 }
	 // end if
	 
	 else //dangling else
	 {
		 System.out.println("Too young");
	 }
	 
	 // end else
	 
 }
 //end of main
}

// end of class IfElseDemo2