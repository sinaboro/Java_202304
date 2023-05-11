package ex01;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadToIntFile {

	public static void main(String[] args) throws IOException {
		
		String path = "c:/data/data.dat";
		
		DataOutputStream out = new DataOutputStream(new FileOutputStream(path));
		out.writeInt(35);  
		out.writeDouble(3.14);
		out.close();
		//0000 0000 0000 0000 0000 0000 0010 0011
		
	}

}
