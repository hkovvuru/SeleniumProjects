package com.Testing;

public class Student {
	 int s_id;
	 String s_name;
	 int salary;
	 Student(int s,String s1,int sa){
		 //System.out.println(s_id+" "+ s_name);
		 
		 s_id=s;s_name=s1;salary=sa;
	 }
	 void Display(){
		
		System.out.println(s_id+" "+s_name+" "+salary);
	 }
	public static void main(String[] args) {
		Student s1=new Student(121945,"khn1",20000);
		//System.out.println(s1.s_id+" "+ s1.s_name);
		//s1.Student1(121945,"Hussain");
		///s1.s_name="hussain";
		//System.out.println(s1.s_id);
		s1.Display();
	}

}
