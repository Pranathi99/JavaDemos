package FunctionDemo;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,Integer>fn=s->s.length();  //Here String is Function Argument and Integer is return type
		System.out.println("Length of 'hello'="+fn.apply("Hello"));
	}

}
