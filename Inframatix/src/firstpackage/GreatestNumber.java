package firstpackage;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn=new Scanner(System.in);
     System.out.println("Enter the first number");
     int a=scn.nextInt();
	 System.out.println("Enter the second number");
	 int b=scn.nextInt();
	 if(a>b)
	 {
		 System.out.println("A is bigger");
	 }
	 else if(b>a)
		 {
		 System.out.println("B is bigger" );
		  }
	 else if(a==b)
	 {
		 System.out.println("Both are equal");
	 }
	 
		 }

}
