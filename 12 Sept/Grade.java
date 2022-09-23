/* program : Grade
@author : Shuruti Singhal
@Date : 12 sept 2022
*/


//Declaring class
class Grade
{
	//calling main
  public static void main(String[] args)  
  {
  
    int grade = Integer.parseInt(args[0]);  //taking input
	
    if(grade<25)
	{
      System.out.println("F");    //printing
    }
    else if((grade>=25)&&(grade<note45))
	{
      System.out.println("E");
    }
    else if((grade>=45)&&(grade<50))
	{
      System.out.println("D");
    }
    else if((grade>=50)&&(grade<60))
	{
      System.out.println("C");
    }
    else if((grade>=60)&&(grade<80))
	{
      System.out.println("B");
    }
    else if((grade>=80)&&(grade<=100))
	{
      System.out.println("A");
    }
    else   
	{
      System.out.println("Wrong Marks");
    }
	
  }
  // end of main
}

//end of class Grade