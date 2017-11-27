import java.io.FileOutputStream;


public class FileOutputStreamExample {
	
	
	public static void main(String[] args) {
		try{
			String str1 ="Hussen";
		
		FileOutputStream fout = new FileOutputStream("D:\\PracticeExamples\\temp.txt");
		String str =" Welcome to Selenium Testing training " ;
		String str2 =" Qspider Bangalore " ;
		byte b[] = str.getBytes();
		byte b1[]=str2.getBytes();
		fout.write(b);
		System.out.println(fout);
		fout.write(b1);
		System.out.println(fout);
		fout.close();
		System.out.println(" Success ");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
