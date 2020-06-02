package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
public static void main(String[] args) {
	objArrayEx obj=new objArrayEx(0,"sourabh","lodu");
	objArrayEx obj1=new objArrayEx(1,"sourabh", "lassan");
	ArrayList<objArrayEx> list=new ArrayList<>();
	list.add(obj);
	list.add(obj1);
	Iterator itr=list.iterator();
	while (itr.hasNext()) {
		objArrayEx object = (objArrayEx) itr.next();
		
	//	System.out.println(object);
	}
	
	
}

@Override
public String toString() {
	return "Test [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
