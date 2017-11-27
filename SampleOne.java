package com.Testing;

public class SampleOne {
	int id;
	String name;
	
	void insertValues(int i,String n){
		id=i; name=n;
	}
    void display(){
    	System.out.println(id+" " +name);
    }
	public static void main(String[] args) {
		SampleOne S1= new SampleOne();
		S1.insertValues(121945, "khn");
		S1.display();
		System.out.println(S1.id);
		System.out.println(S1.name);
		

	}

}
