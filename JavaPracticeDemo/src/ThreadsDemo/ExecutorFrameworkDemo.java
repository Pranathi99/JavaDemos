package ThreadsDemo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VideoProcessorTask[] tasks= {
				new VideoProcessorTask("Bank"),
				new VideoProcessorTask("School"),
				new VideoProcessorTask("Conference"),
				new VideoProcessorTask("HomeSecurity")
		};
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
		
		for(VideoProcessorTask vptask:tasks)
		{
			newFixedThreadPool.submit(vptask);
		}
		
		newFixedThreadPool.shutdown();
	}

}

class VideoProcessorTask implements Runnable{

	String srcName;
	public VideoProcessorTask(String srcName) {
		this.srcName=srcName;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Utils.printMessage("Processing video from "+srcName+" started...");
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		Utils.printMessage("Processing video from "+srcName+" ended...");
	}
	
}