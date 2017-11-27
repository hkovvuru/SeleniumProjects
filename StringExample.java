
public class StringExample {
	
	public static void main(String[] args) {
		String s1="Hussain";
		char[] ch={'j','a','v','a'};
		String s2=new String(ch);// convert the character values to String values
		String s3= new String("Tutorial");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);   
		
		
		// access the characters from an Array
		
		int ch1[]={1,2,3,4,5};
		System.out.println(ch1.length);
		for(int i=0; i<5;i++){
			for(int j=0;j<5;j++){
				System.out.println(ch1[i]);
			}
				System.out.println();
		}
		//Operation of chatAt() method means get the specific characters from string
		//The java string charAt() method returns a char value at the given index number
		char ch2=s1.charAt(5);
		System.out.println(ch2);
		
		//length of the string 
		System.out.println(s1.length());
		
		// String Format Example
		String name="sonoo";  
		String sf1=String.format("name is %s",name);  
		String sf2=String.format("value is %.2f",32.33434);  
		String sf3=String.format("value is %32.12f",32.33434);// returns 12 char fractional part filling with 0  
		System.out.println(sf1);
		System.out.println(sf2);
		System.out.println(sf3);
		
		//Operation of SubStrings
		
		String name1="Kovvuru Hussenaiah";
		System.out.println(name1.substring(0, 7));
		System.out.println(name1.substring(8,18));
		
		// Java String contains method. true if sequence of char value exists, otherwise false.
		
		String S6=" Hai hello how are you ";
		System.out.println(S6.contains("how are you"));//it returns true becoz char are exist
		System.out.println(S6.contains("Hussain"));// it returns false becoz char not exist
		System.out.println(S6.contains("hello"));
		
		//String Join() method
		String s7=String.join("_","Welcome","to","Bangalore");
		System.out.println(s7);// output is Like Welcome_to_Bangalre 
		
		//equals() method 
		
		String a="capgemini";
		String b="capgemini";
		String c="CAPGEMINI";
		String d="Bangalore";
		System.out.println(a.equals(b));// it compares the two strings contents.if characters are equal it returns True vicevesa 
		System.out.println(c.equals(d));
		System.out.println(d.equals(a));
		
		// String Empty() method
		String s="";
		String p="Hussain";
		System.out.println(s.isEmpty()); //if string empty it returns true
		System.out.println(p.isEmpty());
		
		//concat() method operation 
		System.out.println(p.concat(" is from AP"));

		//replace() method operation
		String q="welcome to java tutorial";
		System.out.println(q.replace("java","javaTpoint"));
		System.out.println(q.replace("t","T"));
	
		//equalsIgnoreCase() method operation
		
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(a.equalsIgnoreCase(d));
		
		//Split() method Operation
		
		String z="welcome to java tutorial";
		System.out.println("Returning Words");
		for(String m:z.split("\\s",3)){  //split the given word into 3 parts
		System.out.println(m);}
		System.out.println("Returning Words2");
		for(String m:z.split("\\s",1)){
			System.out.println(m);}
		System.out.println("Returning Words3");
		for(String m:z.split("\\s",2)){  // split the word into 3 parts
			System.out.println(m);}
		
		//String valueOf() method operation
		
		int value=31;
		String X=String.valueOf(value);
		System.out.println(X+10);
		
		// String Buffer Reverse() Method
		String n="Hussenaiah";
		StringBuffer sb= new StringBuffer("uyyalawada narasimha reddy");
		sb.reverse();
		String h=n.toUpperCase();
		System.out.println("Reverse value of string :"+sb);
		System.out.println(h);
		for(int i=0;i<n.length();i++){
			System.out.println(n.charAt(i));}
	
	}
	
}


