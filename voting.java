package sample;
import java.util.*;
import static org.junit.Assert.*;
public class vote {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the age:");
		int age=s1.nextInt();
		assertTrue("not eligibe",18<=age);
		System.out.println("ellgible");
	}

}
