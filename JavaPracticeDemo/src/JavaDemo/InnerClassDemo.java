package JavaDemo;

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass oc=new OuterClass();
		oc.fun1();
		OuterClass.fun1();
		OuterClass.InnerStaticClass.fun1();
		OuterClass.InnerStaticClass isc=new OuterClass.InnerStaticClass();
		isc.fun2();
		OuterClass.InnerNonStaticClass.fun1();
		OuterClass.InnerNonStaticClass insc=oc.new InnerNonStaticClass();
		insc.fun2();
	}

}

class OuterClass{
	static void fun1() {
		System.out.println("Inside static fun1 of OuterClass class");
	}
	
	static class InnerStaticClass{
		static void fun1() {
			System.out.println("Inside static fun1 of InnerStaticClass class");
		}
		
		void fun2() {
			System.out.println("Inside non-static fun2 of InnerStaticClass class");
		}
	}
	
	class InnerNonStaticClass{
		static void fun1() {
			System.out.println("Inside fun1 of InnerNontaticClass of OuterClass");
		}
		
		void fun2() {
			System.out.println("Inside fun2 of InnerNonStaticClass of OuterClass");
		}
	}
}
