package JavaDemo;

import java.util.Scanner;

public class JavaScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//int sum=0;
//		while(sc.hasNextInt())
//		{
//			sum+=sc.nextInt();
//		}
//		System.out.println("Total Sum = "+sum);
//		String str="";
//		while(sc.hasNextLine())
//		{
//			str+=sc.nextLine()+"\n";
//		}
//		System.out.println("String is : "+str);
		int arr[]= {3,5,4,5,6,3,5,7};
//		for(int i=1;i<arr.length;i++)
//		{
//			if(arr[i]==5 && arr[i-1]==3)
//				arr[i]=0;
//		}
//		for(int i=0;i<arr.length;i++)
//			System.out.print(arr[i]+" ");
//		
//		int sum=0;
//		for(int x:arr)
//		{
//			sum+=(x%2==0)?x:0;
//		}
//		System.out.println("Sum is : "+sum);
//		
		String str="Hello World",res="";
		for(char x:str.toCharArray())
		{
			res=x+res;
		}
		System.out.println("Reverse string : "+res);
	}

}
