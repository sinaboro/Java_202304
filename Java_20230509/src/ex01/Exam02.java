package ex01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public class Exam02 {

	public static void main(String[] args) throws IOException {
		String path = "c:/data/number.txt";
		
		Writer out = new FileWriter(path);
		
		for(int i=0; i<100; i++) {
			String data = Integer.toString(i);
			out.write(data);
		}
		out.close();
	}

}
