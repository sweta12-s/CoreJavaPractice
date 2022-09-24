/*
Program : bank account balance less than 1000 (using setter and getter , constructor injection )
@author: Sweta Das
@date: 23sept 2022
*/


//declaring class Bank
class Bank
{
	
	//instance variable
	public int accId;
	private String accName;
	private float accBalance;
	
	
	Bank()           // no arg constructor
	{
		
	}
	

	//paramaterized constructor
	Bank(int accId, String accName, float accBalance)
	{
		this.accId = accId;            //initializing variable
		this.accName = accName;
		this.accBalance = accBalance;
	}
	
	
	
	
	// Setter and getter 
	

	 void setAccId(int accid)            
	{
		this.accId=accId;
	}
	
	 int getAccId()
	{
		return this.accId;
	}
	
	 void setAccName(String accName)            
	{
		this.accName=accName;
	}
	
	 String getAccName()
	{
		return this.accName;
	}
	
	 void setAccBalance(float accBalance)            
	{
		this.accBalance=accBalance;
	}
	
	float getAccBalance()
	{
		return this.accBalance;
	}
}

//end of class bank 
