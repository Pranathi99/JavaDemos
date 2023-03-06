package ThreadsDemo;

public class GarbageCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
			new House(i);
		System.gc(); //requesting garbage collector, But NOT Recommended as it is already optimally made to run
		//It does not guarantee the garbage collection, may or may not clear all the objects 
	}

}

class House{
	int id;
	House(int id)
	{
		this.id=id;
		Utils.printMessage("House Created--"+id );
	}
	
	 @Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Destroying House ---"+id);
	}
}