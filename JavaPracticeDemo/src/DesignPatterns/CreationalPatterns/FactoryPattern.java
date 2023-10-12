package DesignPatterns.CreationalPatterns;

public class FactoryPattern {
	public static class EmpFactory{
		public static Person getEmp(String name,String gender) {
			if(gender=="M")
				return new Male(name);
			else if(gender=="F")
				return new Female(name);
			else
				return null;
		}
	}
	public static void main(String[]args) {
		Person man=EmpFactory.getEmp("Ben","M");
		System.out.println(man.getNameAndSalutations());
		Person woman=EmpFactory.getEmp("Alex","F");
		System.out.println(woman.getNameAndSalutations());
	}
}
	
	abstract class Person{
		protected String name;
		public Person(String name){
			this.name=name;
		}
		abstract String getSalutations();
		abstract String getNameAndSalutations();
	}
	class Male extends Person{
		public Male(String name)
		{
			super(name);
		}
		@Override
		String getSalutations() {
			// TODO Auto-generated method stub
			return "Mr.";
		}
		@Override
		String getNameAndSalutations() {
			// TODO Auto-generated method stub
			return this.getSalutations()+" "+name;
		}
	}
	class Female extends Person{
		public Female(String name)
		{
			super(name);
		}

		@Override
		String getSalutations() {
			// TODO Auto-generated method stub
			return "Miss/Mrs.";
		}

		@Override
		String getNameAndSalutations() {
			// TODO Auto-generated method stub
			return this.getSalutations()+" "+name;
		}
		
	}
	
