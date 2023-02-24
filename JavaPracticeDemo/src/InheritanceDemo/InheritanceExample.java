package InheritanceDemo;

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 d3=new Demo3();
	}

}

class Demo1{
	Demo1(){
		System.out.println("Demo1");
	}
}

class Demo2 extends Demo1{
	Demo2(){
		System.out.println("Demo2");
	}
}

class Demo3 extends Demo2{
	Demo3(){
		//super();
		System.out.println("Demo3");
	}
}