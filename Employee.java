
// Program for Static variable

package com.Testing;

public class Employee {
	int emp_id;
	String emp_name;
	static String emp_location="Bangalore PSN";
	static String emp_company="Capgemini";
	String emp_State;
	Employee(int i,String n){
		emp_id=i;
		emp_name=n;
	}
	Employee(int i,String n,String S) {
		emp_id=i;
		emp_name=n;
		emp_State=S;
	}
	void display(){
		System.out.println(emp_id+" - "+emp_name+" - "+emp_State+" - "+emp_company+" - "+emp_location);
	}
	
	public static void main(String[] args) {
	Employee E1=new Employee(121945,"Hussain"," ANDHRA PRADHESH");
	Employee E2= new Employee(121946,"shyam"," NEPALI ");
	Employee E3= new Employee(063145,"Omprakash"," ANDHRA PRADHESH ");
	E1.display();
	E2.display();
	E3.display();

	}

}
