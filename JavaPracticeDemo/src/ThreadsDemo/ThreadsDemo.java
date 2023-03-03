package ThreadsDemo;

public class ThreadsDemo {
	public static void main(String[] args) {
		MultiThreaded mt=new MultiThreaded();
		mt.start();
		SingleThreaded st=new SingleThreaded();
		st.printNumbers();
	}
}

class SingleThreaded{
	void printNumbers() {
		//System.out.println(Thread.currentThread().getName()+"---");
		for(int i=1;i<=200;i++)
		{
			System.out.println(Thread.currentThread().getName()+"---"+i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException ex)
			{
				System.out.println(ex.getMessage());
			}
		}
	}
}

class MultiThreaded extends Thread{
	public void run() {
		//System.out.println(Thread.currentThread().getName()+"-----");
		for(int i=1;i<=200;i++)
		{
			System.out.println(Thread.currentThread().getName()+"-----"+i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException ex)
			{
				System.out.println(ex.getMessage());
			}
		}
	}
}