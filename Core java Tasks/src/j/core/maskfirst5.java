package j.core;

public class maskfirst5 {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("0521245896362158");
	System.out.println("card no:"+sb);
	sb=sb.replace(0, 4,"*****");
	sb=sb.replace(13, 17,"*****");
	System.out.println("card no:"+sb);
	
}
}