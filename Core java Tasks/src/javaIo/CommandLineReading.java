package javaIo;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CommandLineReading {
public static void main(String[] args) throws Exception {
	FileWriter fr=new FileWriter("E://my//iojava//io//my.txt",true); //true is used to append d data we entered.
	PrintWriter pw=new PrintWriter(fr);
	InputStreamReader ir=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(ir);
	String text=br.readLine();
	while(!text.equals("quit")) {
		System.out.println(text);
		pw.println(text);
		text=br.readLine();
	}
	pw.close();
	br.close();
}
}
