package com.Testing;

public class Sample {
	int id;
	String name;
	
	void insertValues(int i,String n){
		id=i; name=n;
	}
    void display(){
    	System.out.println(id+" " +name);
    }
	public static void main(String[] args) {
		
		Sample s= new Sample();
		s.insertValues(121945, "HUSSAIN");
		s.display();
		System.out.println(s.id);
		System.out.println(s.name);
	System.out.println("Hi Hussain welcome to the java world and Automation");

	}

}
