package sample;

import static org.junit.Assert.*;
import java.util.*;
public class palindrome {
		public static void main(String[] args) {
			String p3="";
			char ch;
			Scanner s1= new Scanner(System.in);
			System.out.println("enter any string: ");
			String p1=s1.nextLine();
			System.out.println("string: "+p3);
			int l=p1.length();
		   
			for(int i=l;i>0;i--) {
			   ch=p1.charAt(i-1);

			  p3=p3+ch;
			}
			System.out.println(" reversed string: "+p3);
			assertEquals("not same",p3,p1);
			System.out.println(" palindrome");
			}
}
