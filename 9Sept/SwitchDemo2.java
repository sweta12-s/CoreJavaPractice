/* program : SwitchDemo2
@author : Shuruti Singhal
@Date : 9 sept 2022
*/


//Declaring class
class SwitchDemo2
{
 // calling main
 public static void main(String [] args)
 {
	 char grade='C';           //taking input
	 switch(grade)
	 {
		 
		 case 'A': System.out.println("Pass: Excellent");
		          break;
		 case 'B': System.out.println("Pass: very Good");
		          break;
		 case 'C': System.out.println("pass:Good");
		          break;
		 case 'D': System.out.println("pass:Can Do Better");
		          break;
		 case 'F': System.out.println("Fail");
		          break;
		 default : System.out.println("Wrong Input");		  
		 
	 }
	 
     //end if switch
 }
 // end of main
}

// end of class SwitchDemo2
 
		