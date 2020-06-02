package javaIo;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataWriting  {
public static void main(String[] args) throws Exception {
	FileOutputStream fout=new FileOutputStream("E://my//iojava//ko.dat");
	DataOutputStream dout=new DataOutputStream(fout);
	dout.writeInt(4);
	dout.writeBytes("suman");
	dout.writeBoolean(false);
	FileInputStream fin=new FileInputStream("E://my//iojava//ko.dat");
	DataInputStream din=new DataInputStream(fin);
	System.out.println(din.readInt()); //we have to read data in same order in which we wrote.
	
	
	
}
}
