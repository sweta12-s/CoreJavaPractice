/* program : Average of 3 subjects
@author : Shuruti Singhal
@Date : 6 sept 2022
*/

// declaring a class
class AverageDemo
{
	
	
	// calling main
	public static void main(String[] args)
	{
		float marks1= Float.parseFloat(args[0]);
		float marks2= Float.parseFloat(args[1]);
		float marks3= Float.parseFloat(args[2]);
		
		float averageMarks= (marks1+marks2+marks3)/3;
		System.out.println("the average marks are :"+averageMarks);
	}
	
	
	
	//end of main
}
//end of class WelcomeDemo