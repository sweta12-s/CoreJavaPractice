/*
Program : bank account balance less than 1000 (using setter and getter , constructor injection )
@author: Sweta Das
@date: 23sept 2022
*/


//import Scanner class
import java.util.Scanner;
//declaring class Account2
class Account2
{
	//declaring main method
	public static void main(String... args)
	{
		Scanner sc =new Scanner(System.in); //taking user input
		System.out.println("enter the  no of Account Holder:");     //printing no of account holder
		
		int size=sc.nextInt();        //taking size
		Bank b1[]=new Bank[size];
		
		
		//loop to input
		for(int i=0;i<size;i++)
		{
			b1[i]=new Bank();         //allocating the memory
			System.out.println("enter the  account id:");
			b1[i].setAccId(sc.nextInt());
			
			System.out.println("enter the  account name:");
			b1[i].setAccName(sc.next());
			
			System.out.println("enter the  account balance:");
			b1[i].setAccBalance(sc.nextFloat());
		}    //end for loop
		
		System.out.println("-------------Account Holder's Balance less than 1000-----------------");   //printing less than 1000 amount   
		
		//loop for output
		for(int i=0;i<size;i++)
		{
			if((b1[i].getAccBalance())<1000)   //amount is less than 1000
				
				
				{
					System.out.println("Name : "    +b1[i].getAccName());       //printing account balance
				}            //end if
		}   //end for loop
	}    //end main method
}            //end class Account2