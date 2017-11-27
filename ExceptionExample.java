
public class ExceptionExample {

	public static void main(String[] args) {
		String str= "java";
	/*	try{
		if(str.equals("java")){
			System.out.println("Both are equal");
		}
		else{
			System.out.println("Both are not equal");
		}
		}
		catch(NullPointerException e){
			System.out.println(e);
			e.printStackTrace();
		}  */
		
		try{
			int a[]= new int[10];
			 a[10]=50/0;
			System.out.println(a);}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);} /*All catch blocks must be ordered from most specific to most general
			i.e. catch for ArithmeticException must come before catch for Exception.
			otherwise it will through an compilation exception */
		
		// exception occurs and not handled 
		try{
			int data = 50/0;
			System.out.println(data);
			}
		catch(NullPointerException e){
			System.out.println(e);}
		finally{  //For each try block there can be zero or more catch blocks, but only one finally block
			System.out.println("this finnaly block will execute always ");
		}
		System.out.println("main block execution is Started ");

		//exception occur and handled
		
		try{
			int data = 50/0;
			System.out.println(data);
			}
		catch(NullPointerException e){
			System.out.println(e);}
		finally{  //For each try block there can be zero or more catch blocks, but only one finally block
			System.out.println("this finnaly block will execute always ");
		}
		System.out.println("main block execution is Started ");

		
		
	}

}
