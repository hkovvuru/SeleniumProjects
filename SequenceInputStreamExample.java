import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;


public class SequenceInputStreamExample {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\PracticeExamples\\temp.txt");
		FileInputStream fis1= new FileInputStream("D:\\PracticeExamples\\textoutput.txt");
		FileOutputStream fos = new FileOutputStream("D:\\PracticeExamples\\text.txt");
		SequenceInputStream sis = new SequenceInputStream(fis,fis1);
		
		int i;
		while(( i=sis.read())!=-1){
			System.out.print((char)i);
			fos.write(i);
	
		}
		System.out.println("\nSuccessfully read the data from temp & text file and write the data in the new file called textoutput file\n ");

			sis.close();
			fis.close();
			fis1.close();
			fos.close();
	}

}
