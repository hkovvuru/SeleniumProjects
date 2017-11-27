// Super() referential keyword operation 
public class SuperStudent {
	int id;
	String name;
SuperStudent(int id,String name){ // Parameterized  constructor declaration
	this.id=id;
	this.name=name;
	}
}
class Peeraiah extends SuperStudent{
    int salary;
	Peeraiah(int id,String name,int salary){
		super(id,name); // copy the parent class variables into subclass by using Super() method
		this.salary=salary;
	}

void display(){
	System.out.println(id+"  "+name+"  "+salary);
}
}
class TestSuperSTudent{
	    public static void main(String[] args){
		Peeraiah p= new Peeraiah(121945,"Hussain",20000);
		p.display();	
	}
}
