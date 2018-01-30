package firstpackage;

import java.util.Scanner;

public class EvenOROdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn=new Scanner(System.in);
     System.out.println("Enter the number");
     int num=scn.nextInt();
     if(num%2==0)
     {
    	 System.out.println("The given number is Even Number");
     }
     else{
     System.out.println("The given number is Odd number");
	}
	}
}
