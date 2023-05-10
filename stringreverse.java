package sample;
import static org.junit.Assert.*;
import java.util.*;
public class reversestr {

	public static void main(String[] args) {
		String p3="";
		char ch;
		Scanner s1= new Scanner(System.in);
		System.out.println("enter any string: ");
		String p1=s1.nextLine();
		int l=p1.length();
	   
		for(int i=l;i>0;i--) {
		   ch=p1.charAt(i-1);

		  p3=p3+ch;
		}
		System.out.println(" string: "+p3);
			
		}
	}


