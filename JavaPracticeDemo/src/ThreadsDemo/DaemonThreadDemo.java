package ThreadsDemo;

public class DaemonThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Utils.printMessage(""+Thread.currentThread().getName());
//		Worker1 worker = new Worker1();
//		worker.setDaemon(true);
//		Utils.printMessage(""+worker.isDaemon());
//		worker.start();
		Thread t = new Thread(new Worker1());
        t.setDaemon(true); // Setting the thread as daemon
        t.start();
        System.out.println("Main thread finished.");
	}

}

class Worker1 extends Thread{
//	public void run() {
//		for(int i=0;i<10;i++)
//			Utils.printMessage(""+i);
//		try {
//			Thread.sleep(1000);
//		}
//		catch(InterruptedException ex)
//		{
//			System.out.println(ex.getMessage());
//		}
//	}
	@Override
    public void run() {
        while (true) {
            System.out.println("Daemon thread is running.");
            try {
                Thread.sleep(1000); // Delaying the thread for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
