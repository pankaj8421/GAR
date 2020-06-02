package javaIo;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ScannerEx {
public static void main(String[] args) {
	String s="this is a java program";
	StringTokenizer n=new StringTokenizer(s," ");
	while(n.hasMoreElements()) {
		System.out.println(n.nextToken());
		
	}
	Scanner sc=new Scanner("this is java");
	while(sc.hasNext()) {
		System.out.println(sc.next());
	}
}
}
