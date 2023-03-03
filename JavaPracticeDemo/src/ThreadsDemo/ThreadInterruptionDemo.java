package ThreadsDemo;

public class ThreadInterruptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utils.printMessage("Start");
		Thread t=new Thread(new Runnable() {

			@Override
			public void run() {
				Utils.printMessage("Start");
				// TODO Auto-generated method stub
				for(int i=1;i<=10;i++)
				{
					Utils.printMessage(""+i);
					try {
						Thread.sleep(5000);
					}
					catch(InterruptedException ex)
					{
						Utils.printMessage("Thread interrupted!");
					}
				}
				Utils.printMessage("End");
			}
		});
		t.start();
		try {
			Thread.sleep(3000);
			t.interrupt();
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		Utils.printMessage("End");
	}

}
