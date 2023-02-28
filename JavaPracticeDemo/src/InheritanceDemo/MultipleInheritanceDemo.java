package InheritanceDemo;

interface A {
	public default void Fun1() {
		System.out.println("Fun1 in A interface running...");
	}
}

interface B {
	public default void Fun1() {
		System.out.println("Fun1 in B interface running...");
	}
}

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MIDemo md=new MIDemo();
		md.Fun1();
	}

}

class MIDemo implements A,B{

	@Override
	public void Fun1() {
		// TODO Auto-generated method stub
		A.super.Fun1();
		B.super.Fun1();
	}
	
}
