package JavaDemo;

public class AnonymousInnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrinterConnection con=PrinterDriver.getConnection();
		con.print();
	}

}

class PrinterDriver{
	static PrinterConnection getConnection() {
		PrinterConnection con=new PrinterConnection() {
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Printing....");
			}
		};
		return con;
	}
}

interface PrinterConnection{
	void print();
}