
//Rule: Call to this() must be the first statement in constructor.

package com.Testing;

public class ThisRealUse {
	int id ;
	String name;
	String location;
	 String Country;
	ThisRealUse(int id,String name,String location){
		this.id=id;
		this.name=name;
		this.location=location;
	}
	ThisRealUse(int id,String name,String location,String Country) {
		
		//this.Country=Country;
		this(id,name,location);  //Constructor call must be the first statement in a constructor so keep the this()must be put on top of the "this.country=country" then i won't through any error.
		this.Country=Country;
	
	}
	
	void display(){
		System.out.println(id+"  "+name+"  "+location+" "+Country); 
	}
	public static void main(String[] args) {
		ThisRealUse tru= new ThisRealUse(121945, "Husssain 1","Bangalore");
		ThisRealUse tru1= new ThisRealUse(121945, "Husssain 1","Bangalore"," India");
		tru.display();
		tru1.display();
		}

}
