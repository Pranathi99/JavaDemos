package ThreadsDemo;

public class DeadlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstResource fr=new FirstResource();
		SecondResource sr=new SecondResource();
		ResourceWorker rw=new ResourceWorker(fr, sr);
		Thread t=new Thread(rw);
		t.start();  // here fr acquires lock and implement fun1 in FirstResource class, until it encounters sr.fun2()- as 
					// sr has acquired lock (look at below statement) and waiting for fr, Here both fr and sr waits till each other
					// is free but never happens, so it waits for indefinite time causing deadlock.
		
		sr.fun1(fr);
		
	}

}

class ResourceWorker implements Runnable{
	FirstResource fr;
	SecondResource sr;
	
	public ResourceWorker(FirstResource fr,SecondResource sr) {
		this.fr=fr;
		this.sr=sr;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		fr.fun1(sr);
	}
	
}

class FirstResource{
	synchronized void fun1(SecondResource sr) {
		Utils.printMessage("Inside FirstResource.fun1");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Utils.printMessage("Invoking SecondResource.fun2");
		sr.fun2();
	}
	
	 synchronized void fun2() {
		Utils.printMessage("FirstResource.fun2");
	}
}

class SecondResource{
	synchronized void fun1(FirstResource fr) {
		Utils.printMessage("Inside SecondResource.fun1");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Utils.printMessage("Invoking FirstResource.fun2");
		fr.fun2();
	}
	synchronized void fun2() {
		Utils.printMessage("SecondResources.fun2");
	}
}