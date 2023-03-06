package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>al=new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
			al.add(i);
		System.out.println(al);
		List<Integer>evenList=al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		List<Integer>multiplyBy2=al.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(multiplyBy2);
		
		List<String>names=new ArrayList<>();
		names.add("MAX");
		names.add("MILLER");
		names.add("JOHN");
		names.add("COLLINS");
		
		List<String>UpperToLower=names.stream().map(i->i.toLowerCase()).collect(Collectors.toList());
		System.out.println(UpperToLower);
		
	}

}
