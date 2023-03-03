package JavaDemo;

public class InnerClassDemo2 {
	public static void main(String[] args) {
		Car myCar=new Car("Red");
		myCar.fun1();
		System.out.println(Car.model);
		Car.MusicSystem ms=myCar.new MusicSystem(5);
		ms.playMusic();
	}
}

class Car{
	public static String model="Hyundai";
	private String color;
	
	Car(String color){
		this.color=color;
	}
	
	void fun1() {
		System.out.println("Color is: "+color);
	}
	
	class MusicSystem{
		private int channels;
		MusicSystem(int channels)
		{
			this.channels=channels;
		}
		
		void playMusic() {
			System.out.println("Model is : "+Car.model);
			System.out.println("Color is : "+Car.this.color);
			System.out.println("Channels : "+channels);
		}
	}
}