import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ReadData {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String Testfile ="D:\\PracticeExamples\\temp.txt"; // Set file path
		File f = new File(Testfile);
		f.createNewFile(); // create new file 
		
		// Write the data into the file  
		
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("This is first Line ");
		bw.append(" hello Hussain ");
		bw.newLine();
		bw.write("This is second line ");
		bw.append("Hussain");
		bw.close();
		
		// Read the data from the file 
		
		FileReader fr = new FileReader(Testfile);
		BufferedReader br = new BufferedReader(fr);
		String content=" ";
		
		while((content=br.readLine())!=null){
			System.out.println(content);
		}
	}

}
