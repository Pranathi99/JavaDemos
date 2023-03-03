package ThreadsDemo;

public class ChallengeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddNumbers on=new OddNumbers();
		EvenNumbers en=new EvenNumbers();
		Thread t1=new Thread(on);
		t1.setName("Odd");
		Thread t2=new Thread(en);
		t2.setName("Even");
		for(int i=0;i<=10;i++)
		{
			Utils.printMessage(""+i);
		}
		t2.start();
		t1.start();
	}

}


class OddNumbers implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++)
		{
			if(i%2==1)
				Utils.printMessage(""+i);
		}
	}	
}

class EvenNumbers implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
				Utils.printMessage(""+i);
		}
	}
	
}