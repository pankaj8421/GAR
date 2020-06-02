package javaIo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {
public static void main(String[] args) throws Exception {
	FileOutputStream fout=new FileOutputStream("E://my//iojava//io//object.ser");
	ObjectOutputStream out=new ObjectOutputStream(fout);
	Employee e=new Employee("rays", "dev", 1100, 120);
	out.writeObject(e);
	out.close();
	System.out.println("successfully writen");
	FileInputStream fin=new FileInputStream("E://my//iojava//io//object.ser");
	ObjectInputStream in=new ObjectInputStream(fin);
	Employee em=(Employee)in.readObject();
	System.out.println(em.getDes());
	System.out.println(em.getName());
	System.out.println(em.getSalary());
	System.out.println(em.getTotal());  //total is a transient variable so here it shows 0 for total value with serailizable class.
	
	
	
}
}
