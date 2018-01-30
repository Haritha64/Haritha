package firstpackage;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=0;
		int b=1;
        int c=a+b;
        System.out.println(a);
		System.out.println(b);
		System.out.println(c);
        for(int i=1;i<=8;i++)
        {
        	a=b;
        	b=c;
        	c=a+b;
        	System.out.println(c);
        }
	}

}
