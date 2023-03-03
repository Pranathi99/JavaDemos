package ThreadsDemo;

public class ThreadwithRunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageProcessor ip=new ImageProcessor();
		Thread t=new Thread(ip);
		t.start();
		
		Thread rt=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Utils.printMessage("Same with Anonymous class");
			}
		});
		rt.start();
		Utils.printMessage("Ended Main");
	}

}

class ImageProcessor implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Utils.printMessage("Processing an image");
	}
	
}
