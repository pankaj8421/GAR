package javaIo;

import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrirting {
public static void main(String[] args) throws Exception {
	FileWriter fr=new FileWriter("E://my//iojava//io//my.txt");
	fr.write("kamal");
	fr.flush(); //it flushes d data to d destination but doesnt close d stream
	fr.write("hello");
	PrintWriter pw=new PrintWriter(fr);
	for(int i=0;i<10;i++) {
		pw.println("line"+i);
	}
pw.close(); //it flushes all d data as wellas close d stream we can not modify in this file after close statement.
}
}
