package javaIo;

import java.io.Serializable;

public class Employee implements Serializable {
private String name;
private String des;
private static int sal;
private transient int total; 

public String getName() {
	return name;
	
}
public String getDes() {
	return des;
}
public int getSalary() {
	return sal;
}
public int getTotal() {
	return total;
}
public Employee() {
	
}
public Employee(String n,String d,int s,int t) {
	name=n;
	des=d;
	sal=s;
	total=t;
}
}