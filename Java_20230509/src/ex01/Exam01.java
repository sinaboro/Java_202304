package ex01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam01 {

	public static void main(String[] args) throws IOException {
		String path = "c:/data/data.data";
		
		DataOutputStream out = new DataOutputStream(new FileOutputStream(path));
		
		for(int i=0; i<100; i++) {
			out.writeInt(i);
		}
		out.close();
	}

}
