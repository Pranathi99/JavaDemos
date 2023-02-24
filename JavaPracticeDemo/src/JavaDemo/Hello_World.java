package JavaDemo;

public class Hello_World {

	static byte a=(byte)150;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.println(a);
		//block();
	}
	static void block() {
		int st=10;
		System.out.println(st);
		DemoClass dc1=new DemoClass();
		System.out.println(DemoClass.st);
	}

}
