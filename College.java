
public interface College { // Interface file
	//Initialized static variable. 
	//No need to write static because It Is by default static.
	 static String collegeName="KORM college of engineering 2 ";
	
	 //Created non static methods without body.
	void StudentDetails();
	void StudentResults();
}

/* class Computer implements College{

	@Override
	public void StudentDetails() {
		System.out.println("Computer dept.Student details Part ");
		
	}

	@Override
	public void StudentResults() {
		System.out.println("Computer dept.Student results part");
		
	}
	
}
  class EEE implements College{

	@Override
	public void StudentDetails() {
	System.out.println(" EEE dept.Student Dertails part ");
		
	}

	@Override
	public void StudentResults() {
	System.out.println("EEE dept. Students Results part");
	}
	 
 }
 
 public class TestCollege {
	  public static void main (String[] args){
		  
		  System.out.println(C.collegeName+" College student details are ");
		  
		  
		  College C= new Computer();
		  C.StudentDetails();
		  C.StudentResults();
		  
		  // create an object to the EEE class
		  College E = new EEE();
		  E.StudentDetails();
		  E.StudentResults();
		  
	  }
  }  
 */