package javaIo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomFileReading {
public static void main(String[] args) throws IOException {
	File f=new File("E://my//iojava//io.dat");
	System.out.println(f.createNewFile());
	RandomAccessFile rm=new RandomAccessFile(f, "rw");
	long pos=0;
	rm.writeChar('c');
	rm.writeLong(0);
	rm.writeInt(4);
	pos=rm.getFilePointer();
	rm.seek(0);
	rm.writeLong(pos);
	rm.close();
	
}
}
