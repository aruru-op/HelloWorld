package Sample1;

import java.io.*;

public class FileReaderSample1 {

	public static void main(String[] args) {
		try (FileReader filereader = new FileReader(new File("C:\\SampleFIle\\FileReaderSample1.txt"));){			
			  int ch = filereader.read();			  
			  while(ch != -1) {
				  System.out.print((char)ch);  
				  ch = filereader.read();
				  if(ch == -1) {
					  System.out.println(ch);
				  }
			  }
		}catch(Exception e){
			System.out.println(e);
		}
	}
}