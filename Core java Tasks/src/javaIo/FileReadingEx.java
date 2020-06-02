package javaIo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReadingEx {
public static void main(String[] args) throws Exception {
	FileReader fr=new FileReader("D://test.txt");
	BufferedReader br=new BufferedReader(fr);
	String line=br.readLine();
	while(line!=null) {
		System.out.println(line);
		line=br.readLine();
	}
	br.close();
	fr.close();
}
}
