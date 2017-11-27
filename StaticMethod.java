
//Program of Static Method
//Program of changing the common property of all objects(static field).  

package com.Testing;

public class StaticMethod {
	int id ;
	String name;
	static String college;
	
	static void method(){
	college=" KORM College of Engineering Kadapa ";
	}
	
	StaticMethod(int i, String n) {
		id =i;
		name=n;
		}
	void display(){
		System.out.println(id+" - "+name+" - "+college);
	}

	public static void main(String[] args) {
		StaticMethod.method();  // call the method without creating the method instance 
		
		StaticMethod sm1=new StaticMethod(121945, " Hussain ");
		//sm1.method(121945,"khn");
		sm1.display();
		

	}

}
