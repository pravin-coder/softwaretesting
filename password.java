package sample;
import static org.junit.Assert.*;
import java.util.*;
class passwd{
	public static void main(String[] argv){
		Scanner s1= new Scanner(System.in);
		System.out.println("enter any string: ");
		String p1=s1.nextLine();	
		Scanner s2= new Scanner(System.in);
		System.out.println("enter the string again: ");
		String p2=s2.nextLine();
		assertEquals(p1, p2);
	}
}
