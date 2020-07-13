package Sample1;

import java.io.FileReader;

public class FileReaderSample2 {

	public static void main(String[] args) {
		try (FileReader filereader = new FileReader("C:\\SampleFIle\\FileReaderSample1.txt");){			
			  int ch = filereader.read();			  
			  while(ch != -1) {
				  System.out.print((char)ch);  
				  ch = filereader.read();
			  }
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
