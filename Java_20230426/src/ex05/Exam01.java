package ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class Exam01 {

	public static void main(String[] args) throws IOException {

		String filePath = "C:/data/sample.txt";  //읽어올 파일 경로
		String filePath2 = "C:/data/data.txt";  //읽어올 파일 경로
		BufferedReader reader=null;
		BufferedWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader(filePath));
			writer = new BufferedWriter(new FileWriter(filePath2));
			String line=null;
			
			while( (line = reader.readLine()) != null) {
//				System.out.println(line);
				writer.write(line+"\r\n");
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			reader.close();
			writer.close();
		}
	}

}
