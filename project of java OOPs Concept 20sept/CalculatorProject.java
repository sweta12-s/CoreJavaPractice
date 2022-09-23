/*
Program : Static calculator
@Author: Sweta Das
@date: 22sept 2022
*/


//import Scanner class
import java.util.Scanner;

//declaring class calculator
class CalculatorProject
{
	static double answer=0.0;         //declaring the variable and initializing value
	
	double addition(double num1,double num2)      //adding num1 and num2    
	{
		return num1+num2;
	}
	
	double subtraction(double num1,double num2)   //subtracting num1 and num2
	{
		return num1-num2;
	}
	double multiplication(double num1,double num2)             //multiplying num1 and num2
	{
		return num1*num2;
	}
	double division(double num1,double num2)      //division num1 and num2
	{
		return num1/num2;
	}
	
	
	
	//declaring main method
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);             //taking user input
		double number1,number2;                        //numbe1 and number2 taking in double
		char operator,choice;                                  //operator and choice taking in char
		
		System.out.println("--------------Calculator----------");        //printing
		System.out.println("Enter 2 numbers:");                        //printing enter numbers
		number1= sc.nextDouble();             //number1 input from the user
		number2= sc.nextDouble();
		
		Calculator cal = new Calculator();         // creating an object of calculator class
		
		while(true)                         // start while loop
		{
			System.out.println("Enter the operator: ");             //printing the operator
			operator= sc.next().charAt(0);
			switch(operator)                               //switch case start
			{
				case '+': Calculator.answer= cal.addition(number1,number2);
				           break;
			    case '-': Calculator.answer= cal.subtraction(number1,number2);
				           break;
				case '*': Calculator.answer= cal.multiplication(number1,number2);
				           break;
			    case '/': Calculator.answer= cal.division(number1,number2);
				           break;
			   default: System.out.println("Wrong input");                //print wrong input
			   
			}       //end switch case
			
			System.out.println(number1+" "+operator+ " "+number2+" = "+Calculator.answer);             //concatenate the numbers
			System.out.println("Do you want to perform more operation");            //printing                 
			choice= sc.next().toLowerCase().charAt(0);
			
			if(choice=='y')                          //start if loop
			{
				number1= Calculator.answer;
				System.out.println("Enter the number: ");
				number2= sc.nextDouble();
			}
			//end if loop
			else                       //start else
			{
				break;
			}                   //end else 
			
		}                            //end while loop
		
	}                   //end main method
	
	
}                  //end main class calculator