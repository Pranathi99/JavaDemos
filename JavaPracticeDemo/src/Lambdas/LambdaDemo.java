package Lambdas;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Anonymous inner class
		ICalculator multiplier=new ICalculator() {

			@Override
			public int calculator(int a, int b) {
				// TODO Auto-generated method stub
				int result=a*b;
				System.out.println("Calculate "+a+"*"+b+" = "+result);
				return result;
			}	
		};
		multiplier.calculator(10, 20);
		
		int x=10,y=25;
		ICalculator addition= (a,b)->{return a+b;};
		System.out.println("Calculate "+x+" + "+y+" = "+addition.calculator(x, y));
		
		Divide dv=(a,b)->System.out.println("Division is : "+(double)a/b);
		dv.divide(x, y);
	}

}

interface ICalculator{
	int calculator(int a,int b);
}

interface Divide{
	void divide(int a,int b);
}