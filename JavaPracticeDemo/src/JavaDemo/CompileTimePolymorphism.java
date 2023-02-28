package JavaDemo;

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoEg3 dm=new DemoEg3();
		dm.fun1();
		dm.fun1(10, 20);
		dm.fun1("XYZ");
		System.out.println(dm.getName());
	}

}

class DemoEg3{
	private String name="";
	void fun1() {
		System.out.println("Fun1 with no parameters");
	}
	void fun1(int a,int b)
	{
		System.out.println("Fun1 with int parameters");
	}
	void fun1(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return this.name;
	}
}