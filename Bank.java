


public class Bank {
	int getRateOfIntrest(){
		return 0;
	}
}

 class SBI extends Bank {
	 int getRateOfIntrest(){
		return 8;
	}}
 class HDFC extends Bank{
	 int getRateOfIntrest(){
		 return 9;
	 }
 }
 class Axis extends Bank{
	 int getRateOfIntrest(){
		 return 10;
	 }
 }
	 class TestBank{
	public static void main(String[] args) {
		
		Bank B= new Bank();
		SBI s= new SBI();
		HDFC h= new HDFC();
		Axis a= new Axis();
		System.out.println("Rate of intrest of BANK is:"+B.getRateOfIntrest());
		System.out.println("Rate of intrest of SBI is:"+s.getRateOfIntrest());
		System.out.println("Rate of intrest of HDFC is:"+h.getRateOfIntrest());
		System.out.println("Rate of intrest of AXIS is:"+a.getRateOfIntrest());
}
 }
	
	