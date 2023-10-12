package DesignPatterns.CreationalPatterns;

public class SingletonPattern {
	private static SingletonPattern singleton=null;
	public String data;
	private SingletonPattern() {
		data="Example data from singleton class";
	}
	public static SingletonPattern getInstance() {
		if(singleton==null)
			return singleton=new SingletonPattern();
		return singleton;
	}
}

