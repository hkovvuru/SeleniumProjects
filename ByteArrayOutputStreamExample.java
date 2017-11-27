import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ByteArrayOutputStreamExample {

	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream fos = new FileOutputStream("D:\\PracticeExamples\\A.txt");
		FileOutputStream fos1 = new FileOutputStream("D:\\PracticeExamples\\B.txt");
		FileOutputStream fos2 = new FileOutputStream("D:\\PracticeExamples\\C.txt");
		FileOutputStream fos3 = new FileOutputStream("D:\\PracticeExamples\\D.txt");
		
		ByteArrayOutputStream baos= new ByteArrayOutputStream();
		
		baos.write(97);
		baos.writeTo(fos);
		baos.writeTo(fos1);
		baos.writeTo(fos2);
		baos.writeTo(fos3);
		baos.close();
	System.out.println("SUccess");
	}
	
	
}
