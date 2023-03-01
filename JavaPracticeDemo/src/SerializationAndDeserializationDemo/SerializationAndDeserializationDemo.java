package SerializationAndDeserializationDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationAndDeserializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerializeObject();
		DeserializeObject();
	}

	private static void DeserializeObject() {
		try(FileInputStream fis=new FileInputStream("C:/Users/prganti/Desktop/Sample.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);){
				Student std=(Student) ois.readObject();
				System.out.println("Object Deserialized\n"+std);
			}
			catch(FileNotFoundException ex)
			{
				System.out.println(ex.getMessage());
			}
			catch(IOException ex)
			{
				System.out.println(ex.getMessage());
			} 
			catch (ClassNotFoundException ex) {
				System.out.println(ex.getMessage());
			}
	}

	private static void SerializeObject() {
		try(FileOutputStream fos=new FileOutputStream("C:/Users/prganti/Desktop/Sample.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);){
			Student std=new Student(1,"Harry","CSE","2424XYZ");
			oos.writeObject(std);
			System.out.println("Object Serialized");
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex.getMessage());
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}

class Student implements Serializable{
	private int id;
	private String name;
	private String dept;
	private String aadhar_no;

	Student(int id,String name,String dept,String aadhar_no)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.aadhar_no=aadhar_no;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+"|"+name+"|"+dept+"|"+aadhar_no;
	}
}
