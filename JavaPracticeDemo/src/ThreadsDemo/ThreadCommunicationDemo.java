package ThreadsDemo;

public class ThreadCommunicationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt=new MyThread();
		Thread t=new Thread(mt);
		t.setName("T1");
		t.start();
		
		synchronized(t) {
			Utils.printMessage("Going to wait");
			try {
				t.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Utils.printMessage("Notified");
			Utils.printMessage("Total= "+mt.total);
		}
	}

}

class MyThread implements Runnable{
	int total=0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this)
		{
			for(int i=0;i<=10;i++)
			{
				total+=i;
			}
			Utils.printMessage("Calcultion Completed...Notifying");
			this.notify();
		}
	}
	
	public int getTotal() {
		return total;
	}
	
}