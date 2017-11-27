package com.Testing;

 public  class Account {
	
	int acn;
	String name;
	int amount;
	void insertValues(int a,String n, int amnt){
		acn=a; name=n;amount=amnt;
	}
	
    void deposit(int amnt){
	amount = amnt+amount;
	    System.out.println("amount is deposited ");
}
    void withdraw(int amnt){
	if(amnt>amount){
		System.out.println(" insufficient funds in your account ");
	}
	else{
		amount=amount-amnt;
		System.out.println(" amount is withdrawn ");  
	}
	}
    void CheckBalance(){
	System.out.println(" Balance is: "+amount);
}
     void Display(){
	    System.out.println(acn+ " " +name+ " " +amount);
}

   	public static void main (String[] args){
   		Account A= new Account();
   		A.insertValues(121945,"K.Hussenaiah", 1000);
   		A.Display();
   		A.deposit(500);
   		A.CheckBalance();
   		A.withdraw(1000);
   		A.CheckBalance();
   		
	}
}
