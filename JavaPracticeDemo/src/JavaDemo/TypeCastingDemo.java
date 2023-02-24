package JavaDemo;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=12;
		int b=1933;
		char c='a';
		float d=(float)42.424;
		Integer x=102;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println((int)Character.MAX_VALUE);
		System.out.println((int)Character.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		if (x instanceof Integer) {
		    System.out.println("b is int");
		}
	}

}
