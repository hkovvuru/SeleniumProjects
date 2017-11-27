package com.Testing;



 class SampleSalary {
	
	 int salary=40000;
}
class Emp extends SampleSalary{
	int bonus=10000; 
	public static void main(String args[]) {
		Emp e = new Emp();
		System.out.println("Emp salary is :"+e.salary);
		System.out.println("Emp bonus is :"+e.bonus);
		}

}

