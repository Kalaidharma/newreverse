import java.util.*;
public class reversestring {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s;
		s=sc.nextLine();
	    StringBuffer sb=new StringBuffer(s);
	    String a=sb.reverse().toString();
	    System.out.println(a);
	    }

}
