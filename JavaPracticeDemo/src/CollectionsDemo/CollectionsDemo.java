package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayListDemo();
//		RandomDemo();
//		SetDemo();
		//SetComparatorDemo();
		//ComparatorDemo();
//		ComparableDemo();
		//MapDemo();
		Queue<Integer>pq=new PriorityQueue<Integer>();
		for(int i=1;i<=10;i++)
			pq.add(i);
		System.out.println(pq);
		pq.remove(3);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		
	}

	public static void MapDemo() {
		Map<String,Integer>mp=new HashMap<String,Integer>();
		mp.put("Alexa", 101);
		mp.put("Ben", 102);
		mp.put("Cathy", 103);
		mp.put("Aiden",104);
		mp.put("Alex", 105);
		System.out.println(mp);
		System.out.println(mp.keySet());
		System.out.println(mp.values());
	}

	public static void ComparableDemo() {
		ArrayList<Student>al=new ArrayList<Student>();
		al.add(new Student(1,"Alex","CSE"));
		al.add(new Student(2,"Ben", "EEE"));
		al.add(new Student(3,"Aiden","CSE"));
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

	public static void ComparatorDemo() {
		Set<Employee>st=new TreeSet<Employee>(new ObjectNameComparator());
		st.add(new Employee(1,"Alex",15000));
		st.add(new Employee(2, "Ben", 20000));
		st.add(new Employee(3,"Aiden",16000));
		st.add(new Employee(4,"Catherine",25000));
		System.out.println(st);
	}

	public static void SetComparatorDemo() {
		Set<String>st=new TreeSet<String>(new StringComparator());
		st.add("Aiden");
		st.add("Ben");
		st.add("Cally");
		st.add("Anna");
		System.out.println(st);
	}

	public static void SetDemo() {
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

	public static void ArrayListDemo() {
		ArrayList<Integer>al=new ArrayList<Integer>();
		for(int i=10;i<=100;i+=10)
			al.add(i);
		System.out.println(al);
		al.set(3,101);
		System.out.println(al);
		al.remove(5);
		System.out.println(al);
		System.out.println(al.indexOf(20));
	}

	public static void RandomDemo() {
		Random rd=new Random();
		System.out.println(rd.nextInt(10,100));
	}

}
class StringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length()>=o2.length())
			return 1;
		else if(o1.length()<=o2.length())
			return -1;
		else
			return 0;
	}
	
}

class Employee{
	public int id;
	public String name;
	public int salary;
	Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+"|"+name+"|"+salary;
	}
}

class ObjectNameComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}

class Student implements Comparable<Student>{
	public int id;
	public String name;
	public String dept;

	Student(int id,String name,String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+"|"+name+"|"+dept;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	
}