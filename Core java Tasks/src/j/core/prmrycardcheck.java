package j.core;

public class prmrycardcheck {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("0012365478120777");
	int no=Integer.parseInt((sb.substring(14,15)));
	if (no==00) {
		System.out.println("this card is a primary card");
	}
	else {
		System.out.println("this card is a child card");
	
}
}
}