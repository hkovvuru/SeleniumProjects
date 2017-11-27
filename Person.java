// Multiple Inheritance implementation by using the Interfaces

/* Multiple Interfaces means a class can implements multiple interfaces and 
 an interface  can extend multiple interfaces is called "Multiple interfaces" */
public interface Person {
	void print();
}
interface Student{
	void show();
}

class Employe implements Person,Student{
	public void print(){
		System.out.println("Hello");}
	public void show(){
		System.out.println("Welcome");
	}
}

class TestPerson{
	public static void main(String[] args){
		Employe e= new Employe();
		e.print();
		e.show();
		
	}
}