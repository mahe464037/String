package javaaaaa;

import java.util.Scanner;

public class StringReverse {


public static void main(String[] args)

{
	String sc= "Where is my";
//	StringBuilder sb= new StringBuilder();
//	sb.append(sc);
//	     sb=sb.reverse();
//	     System.out.println(sb);
	char[] try1 = sc.toCharArray();
	for(int i=try1.length-1;i>=0;i--)
	{
		System.out.println(try1[i]);
	}
}
}