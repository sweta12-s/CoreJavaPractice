/* program : EligibleDemo (totalMarks<60 : not eligible , totalMarks>60 : eligible , B.Tech : totalMarks>80 pcmMarks>85 )
@author : Shuruti Singhal
@Date : 9 sept 2022
*/


//Declaring class
class EligibleDemo
{
 // calling main
 public static void main(String [] args)
 {
	 float totalMarks= Float.parseFloat(args[0]);  // taking input
	 float pcmMarks= Float.parseFloat(args[1]);
	 
	 //Nested if
	   if(totalMarks>60)
	   {
		   if((totalMarks>=80) || (pcmMarks>=80))
		   {
			   System.out.println("you are eligible to take admission in B.tech");
		   }
		   
		   //end of inner if
		   else
		   {
			   System.out.println("you are eligible to take admission(Except B.Tech)");
		   }
		   
		   // end of inner else
	   }
   //end if outer if
   else
   {
	   System.out.println("you are not eligible for our college");
   }
   // end of outer else
 }
//end of main 
}

// end of class EligibleDemo

 
		   