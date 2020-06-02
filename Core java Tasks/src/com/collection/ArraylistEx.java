package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<>();
		list.add("sourabh");
		list.add("lodu");
		list.add("lassan");
		list.add("soni");
//		Iterator itr=list.iterator();
//	     	while (itr.hasNext()) {
//				String object = (String) itr.next();
//				System.out.println(object);
//			}
	
	for (String string : list) {
		System.out.println(string);
	}}

}
