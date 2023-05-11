package ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteBufferFile {

	public static void main(String[] args) throws IOException {
		
		//String path = "c:\\data\\data.dat";
		String path = "c:/data/data.dat";
		String message = "Hello, Java";
		
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(path));
//		BufferedInputStream
		byte[] data = message.getBytes();  //문자열 저장시
		out.write(data);
		System.out.println(" 파일을 정상적으로 저장했습니다.");
		out.close();		
		
	}

}
