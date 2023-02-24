package JavaDemo;

public class DemoClass {
	static int st=20;
	DemoClass(){
		System.out.println("In constructor");
	}
	static {
		int st=100;
		System.out.println(st);
	}
	static void method() {
		System.out.println("Static method!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();
		DemoClass dc=new DemoClass();
	}

}
