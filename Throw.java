//The Java throw keyword is used to explicitly throw an exception.

public class Throw {
	
	static void validate(int age){
		if(age<18){
			throw new ArithmeticException("not valid");
		}
		else{
			System.out.println("Wlecome to vote");
		}
	}
	public static void main(String[] args) {
		Throw.validate(20);
		System.out.println("rest of the code should be execute");
	}

}
