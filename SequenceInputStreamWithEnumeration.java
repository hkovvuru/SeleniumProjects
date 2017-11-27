import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;


public class SequenceInputStreamWithEnumeration {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\PracticeExamples\\A.txt");
		FileInputStream fis1 = new FileInputStream("D:\\PracticeExamples\\B.txt");
		FileInputStream fis2= new FileInputStream("D:\\PracticeExamples\\C.txt");
		FileInputStream fis3 = new FileInputStream("D:\\PracticeExamples\\D.txt");
		
		
		Vector e= new Vector();
		e.add(fis);
		e.add(fis1);
		e.add(fis2);
		e.add(fis3);
		
		Enumeration n =e.elements();
		
		SequenceInputStream sis = new SequenceInputStream(n);
		
		int i;
		while ((i=sis.read())!=-1) {
			
			System.out.print((char)i);
		}


	}

}
