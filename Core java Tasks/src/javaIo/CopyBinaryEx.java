package javaIo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CopyBinaryEx {
public static void main(String[] args) throws Exception {
	FileInputStream fin=new FileInputStream("E://my//iojava//io//sample.png");
	BufferedInputStream bin=new BufferedInputStream(fin);
	FileOutputStream fout=new FileOutputStream("E://my//iojava//god.png");
	BufferedOutputStream bout=new BufferedOutputStream(fout);
	int b=bin.read();
	while(b!=-1) {
		bout.write(b);
		b=fin.read();
	}
	bout.close();
	bin.close();
}
}
