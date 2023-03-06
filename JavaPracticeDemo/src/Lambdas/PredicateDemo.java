package Lambdas;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer>gt=(i)->(i>20);
		System.out.println(gt.test(15));
		
//		Predicate<Integer>gt10=(i)->(i>10);
//		int[]arr= {0,11,25,-23};
//		fun1(gt10,arr);
		
		//Predicate<Integer>evenNo=(i)->(i%2==0 && i>5);
		Predicate<Integer>evenNo=(i)->(i%2==0);
		Predicate<Integer>gt5=(i)->(i>5);
		int[]arr= {1,2,3,4,5,6,7,8,9,10};
		fun1(gt5.and(evenNo),arr);
	}
	
	static void fun1(Predicate<Integer>p,int[]arr)
	{
//		for(int x:arr)
//		{
//			if(p.test(x))
//				System.out.println(x);
//		}
		for(int x:arr)
		{
			if(p.test(x))
				System.out.println(x);
		}
		
	}

}
