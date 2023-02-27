package InheritanceDemo;

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 d3=new Demo3(10,20);
	}

}

class Demo1{
	int a,b;
	Demo1()
	{
		System.out.println("Demo1");
	}
	Demo1(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
}

class Demo2 extends Demo1{
	int a,b;
	Demo2(int a,int b){
		//super(0,0);
		System.out.println(a+" "+b);
	}
}

class Demo3 extends Demo2{
	Demo3(){
		super(0,0);
		System.out.println("Demo3");
	}
	int a,b;
	Demo3(int a,int b){
		super(a,b);
		System.out.println("Demo3");
	}
}