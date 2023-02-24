package JavaDemo;

public class LoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
		int sum=0,i=1;
		while(i<=10)
		{
			sum+=(i%2==0)?0:i;
			i++;
		}
		System.out.println(sum);
	}
}
