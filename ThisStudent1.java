package com.Testing;

public class ThisStudent1 {
	
	void m(){
		System.out.println("hello hussain 1");
	}
	void n(){
		System.out.println("hello hussain 2");
		this.m();// this key is invoke the m method in the n method 
		// means invoke the method by using this keyword 
	}

	public static void main(String[] args) {
	ThisStudent1 ts= new ThisStudent1();
	ts.n();
	

	}

}
