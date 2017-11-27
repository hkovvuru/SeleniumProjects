import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


//public class FileInputStreamExample {
/*

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream ("D:\\PracticeExamples\\temp.txt");
		
	int s= fis.read();
		System.out.println(s);
		
	int d=fis.available();
	System.out.println(d);
	System.out.println(fis.equals(s));
	}

*/

	import java.io.*;  
	public class FileInputStreamExample{    
	 public static void main(String args[]){    
	  try{    
	    FileInputStream fin=new FileInputStream("D:\\PracticeExamples\\temp.txt");    
	    BufferedInputStream bin=new BufferedInputStream(fin);    
	    int i;    
	    while((i=bin.read())!=0){    
	     System.out.print((char)i);    
	    }    
	    bin.close();    
	    fin.close();    
	  }
	  catch(Exception e){System.out.println(e);}    
	 }    
	}  

