package ThreadsDemo;

import java.util.Scanner;

public class ThreadsJoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"-- Sum of first N numbers");
		System.out.println(Thread.currentThread().getName()+"-- Enter n value:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Calculator calc=new Calculator(n);
		calc.start();
		try {
			calc.join();   // waits for this to complete execution
		}
		catch(InterruptedException ex)
		{
			System.out.println(ex.getMessage());
		}
		System.out.println(Thread.currentThread().getName()+"-- Sum of first "+n+" numbers = "+calc.getSum());
	}

}

class Calculator extends Thread{
	int n,sum=0;
	Calculator(int n)
	{
		this.n=n;
	}
	public void run() {
		for(int i=1;i<=n;i++)
		{
			this.sum+=i;
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(100);
			}
			catch(InterruptedException ex)
			{
				System.out.println(ex.getMessage());
			}
		}
	}
	
	public int getSum()
	{
		return this.sum;
	}
}