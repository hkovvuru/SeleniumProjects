import java.io.IOException;


public class Conversions {

	public static void main(String[] args) throws IOException {

		System.out.println("********Convertion from  String value to Interger**************");

		String s= "100";
		int i = Integer.parseInt(s);
		System.out.println(i);
		System.out.println(s+i);// output is 100100 becoz + sign perform append operation

		
		System.out.println("********  Convertion from  Interger value to String  **************");
		int n = 10;
		String str = String.valueOf(n);//  method to convert int to string 
		String str1 = Integer.toString(n);// method to convert int to string
		System.out.println(str1);
		System.out.println(str);
		System.out.println(n+10);//output is 20 here + is binary plus operator
		System.out.println(str+122);// output is 10122 here  + is perform append operation
		
		System.out.println("*********  COnversion from String value to Long Value  ************");
		
		
		String s1 = "7815077177";
		long l = Long.parseLong(s1);
		System.out.println(l);
		
		System.out.println("*********  COnversion from long value to String Value  ************");
		
		long l1 = 9502197589L;
		String sl= String.valueOf(l1);
		String sl2 = Long.toString(l1);
		System.out.println(sl+" &  "+sl2);
		
		
		

	}

}
