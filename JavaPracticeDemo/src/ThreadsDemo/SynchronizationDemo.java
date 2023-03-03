package ThreadsDemo;

public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor mon=new Monitor();
		Thread t1=new Thread(new MonitorWorker(mon,"Alex"));
		Thread t2=new Thread(new MonitorWorker(mon,"Ben"));
		t1.setName("T1");
		t2.setName("T2");
		t1.start();
		t2.start();
	}

}

class MonitorWorker implements Runnable{

	Monitor monitor;
	String name;
	MonitorWorker(Monitor monitor,String name){
		this.name=name;
		this.monitor=monitor;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		monitor.greeting(name);
	}
	
}

class Monitor{
	void greeting(String name) {
		synchronized (this){
			for(int i=1;i<=10;i++)
			{
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Utils.printMessage("Welcome "+name);
			}
		}
	}
}