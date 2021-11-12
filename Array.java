


public class Array {

	public static void main(String[] args) {
		int arr[]= new int [5]; // Array declaration and instantiation
		arr[0]=1; // Array initialization
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		//Prints the array values
		try{
			for(int i=4;i<arr.length;--i){
				System.out.println(arr[i]);}
		}
		/*catch(Exception e){
			System.out.println("Exception is handled ");
			System.out.println(e.getMessage());
		}*/
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception is handled");
		}
		finally{
			System.out.println("Execute rest of the code ");
		}
	}
}

// Successfully Executed Program

