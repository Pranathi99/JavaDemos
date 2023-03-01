package CollectionsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer>al=new ArrayList<Integer>();
//		for(int i=10;i<=100;i+=10)
//			al.add(i);
//		System.out.println(al);
//		al.set(3,101);
//		System.out.println(al);
//		al.remove(5);
//		System.out.println(al);
//		System.out.println(al.indexOf(20));
		Random rd=new Random();
		System.out.println(rd.nextInt(10,100));
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(1);
		al.add(3);
		al.add(2);
		al.add(100);
		al.add(1);
		al.add(6);
		Set<Integer>ht=new HashSet<Integer>(al);
		System.out.println(ht);
		Set<Integer>ts=new TreeSet<Integer>(al);
		ts.add(1000);
		ts.add(5);
		System.out.println(ts);
	}

}
