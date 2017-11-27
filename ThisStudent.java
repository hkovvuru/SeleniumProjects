// this keyword is used for refer the current class variables
//this keyword invokes the method and constructor also 

package com.Testing;

public class ThisStudent {
	
	int id ;
	String name;
	String location;
	ThisStudent(int id,String name,String location){
		this.id=id;
		this.name=name;
		this.location=location;
	}
	void display(){
		System.out.println(id+"  "+name+"  "+location); 
	}

	public static void main(String[] args) {
	ThisStudent ts=new ThisStudent(121945,"Hussain","Bangalore");
	ThisStudent ts1=new ThisStudent(121945,"Hussain","chennai");
	ts.display();
	ts1.display();
	}

}
