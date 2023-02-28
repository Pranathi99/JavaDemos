package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//divideByZero();
		stringParseDemo();
		NullPointerDemo();
	}
	
	private static void NullPointerDemo()
	{
		try {
		String str=null;
		System.out.println(str.length());
		}
		catch(NullPointerException ex)
		{
			System.out.println("Null Poiner Exception occurred!");
		}
		catch(Exception ex)
		{
			System.out.println("Exception occurred!");
		}
	}
	
	private static void stringParseDemo()
	{
		try {
		String str="hello";
		int x=Integer.parseInt(str);
		System.out.println(x);
		}
		catch(NumberFormatException ex)
		{
			System.out.println(ex.getMessage());
			System.out.println("Number Format Exception occurred!"+ex.toString());
		}
		catch(Exception ex)
		{
			System.out.println("Exception occurred!");
		}
	}
	
	private static void divideByZero()
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
			System.out.println(a/b);
		}
		catch(Exception ex)
		{
			System.out.println("Exception occurred!");
		}
	}

}
