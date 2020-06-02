package javaIo;

import java.io.File;

public class FileHandlingEx {
public static void main(String[] args) {
	String path="E://my//iojava//io";
	String name="io.txt";
	File f=new File(path,name);
	System.out.println(f.mkdirs()); //it shows boolean value if d file were created.
	if(f.exists()) {
		System.out.println("name"+f.getName());
		System.out.println("path"+f.getAbsolutePath());
        System.out.println("readable"+f.canRead());	
        System.out.println("writable"+f.canWrite());
	
	
	}
}
}