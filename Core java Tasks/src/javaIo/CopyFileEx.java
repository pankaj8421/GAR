package javaIo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFileEx {
public static void main(String[] args) throws Exception {
	FileReader fr=new FileReader("E://my//iojava//io//my.txt");
	FileWriter fw=new FileWriter("E://my//iojava//io//copy.txt");
	int ch=fr.read();
	while(ch!=-1) {
		fw.write(ch);
		ch=fr.read();
	}
	fr.close();
	fw.close();
}
}
