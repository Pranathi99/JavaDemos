package JavaDemo;

public class RuntimePolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoEg dm=new DemoEg2();
		dm.fun1();
	}

}

class DemoEg{
	void fun1() {
		System.out.println("In DemoEg fun1");
	}
}

class DemoEg2 extends DemoEg{
	void fun1() {
		System.out.println("In DemoEg2 fun1");
	}
}
