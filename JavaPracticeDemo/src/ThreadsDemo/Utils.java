package ThreadsDemo;

public class Utils {
	public static void printMessage(String msg)
	{
		System.out.println(Thread.currentThread().getName()+"---"+msg);
	}
}
