
public class ArrayExaxmple2 {

	public static void main(String[] args) {
		int[] arr={10,20,30,40,50,60};// Arary is declared instantiate and initialized
		//addition of an array elements 
		int sum = 0;
		try{
		for(int i=0; i<arr.length;i++){
			sum=sum+arr[i];
			//System.out.println("the sum of the array values are :"+sum);
			}
			System.out.println("the sum of the array values are :"+sum);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception is handled");
		}
	finally{
		System.out.println("now everything is fine ");
	}
	}
	

}
