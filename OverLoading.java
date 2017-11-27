package com.Testing;

public class OverLoading {
	int id;
	String name;
	String location;
	
	OverLoading(int i, String n){
		id=i;
		name=n; 
	}
	OverLoading(int i,String n,String l){
		id=i;
		name=n;
		location=l;
	}
	void Display(){
		System.out.println(id+" "+name+" "+location);
	}
	public static void main(String[] args) {
		
		OverLoading OL1=new OverLoading(1219405,"Hussenaiah");
		OverLoading OL2= new OverLoading(1219405,"Hussenaiah","Bangalore");
		OL1.Display();
		OL2.Display();
		
	}

}
