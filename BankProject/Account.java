/*
Program : bank account balance less than 1000 (using setter and getter , constructor injection )
@author: Sweta Das
@date: 23sept 2022
*/

//declaring class Account
class Account
{
	
	// calling main method
	public static void main(String...args)
	{
		                  // Creating an array of Account
		Bank b1[]=new Bank[4];
		
		          // Constructor injection
		b1[0]=new Bank(1,"Rahul",150);
		b1[1]=new Bank(2,"Ram",1500);
		b1[2]=new Bank(4,"Sweety",800);
		b1[3]=new Bank(6,"Rinky",2000);
		
		for(int i=0;i<4;i++)
		{
			if((b1[i].getAccBalance())<1000)    //amount is less than 1000
			{
				//System.out.println("---------------BankAccount Details-----------");
				System.out.println("Name : "    +b1[i].getAccName());         //printing account balance
			}         //if ends
		}           //for ends
	}         //end main method
}         //end class account