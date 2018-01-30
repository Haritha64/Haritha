package firstpackage;
import java.util.Scanner;

public class Addition {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	Scanner scn=new Scanner(System.in);
    System.out.println("Enter the first value");
    int a=scn.nextInt();
    System.out.println("Enter the second value");
    int b=scn.nextInt();
    int sum=a+b;
    System.out.println("The addition of two numbers is " +sum);
	}

}
