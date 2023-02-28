package FilesDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fileInputOutputDemo();
		fileWriterDemo();
		fileReaderDemo();
		bufferedReaderDemo();
	}

	private static void bufferedReaderDemo() {
		String line="";
		File myFile=new File("C:/Users/prganti/Desktop/Sample.txt");
		try {
			FileReader fr=new FileReader(myFile);
			BufferedReader br=new BufferedReader(fr);
			System.out.println("File opened in BufferedReader");
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
			br.close();
			fr.close();
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

	private static void fileWriterDemo() {
		int i;
		File myFile=new File("C:/Users/prganti/Desktop/Sample.txt");
		try {
			FileWriter fw=new FileWriter(myFile,true);
			System.out.println("File opened in FileWriter");
			String data="Adding a line at end\n";
			fw.append(data);
			fw.close();
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

	private static void fileReaderDemo() {
		int i;
		File myFile=new File("C:/Users/prganti/Desktop/Sample.txt");
		try {
			FileReader fr=new FileReader(myFile);
			System.out.println("File opened in FileReader");
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			fr.close();
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

	private static void fileInputOutputDemo() {
		int i;
		File myFile=new File("C:/Users/prganti/Desktop/Sample.txt");
		try {
			FileOutputStream fos=new FileOutputStream(myFile);
			String data="Adding line to the file\n";
			byte[] dataBytesArray = data.getBytes();
			fos.write(dataBytesArray);
			FileInputStream fis=new FileInputStream(myFile);
			System.out.println("File opened");
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
			fis.close();
			fos.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex.getMessage());
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}

}
