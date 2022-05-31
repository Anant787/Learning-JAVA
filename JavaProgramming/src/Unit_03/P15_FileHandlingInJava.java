package Unit_03;
import java.util.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class P15_FileHandlingInJava {

	public static void main(String[] args) throws IOException {
		
		FileInJava obj=new FileInJava();
		obj.takeInputFromAFileNotFromConsole();
		obj.saveOutputIntoAFile();
		//obj.createALogFile();

	}

}

class FileInJava
{
	void takeInputFromAFileNotFromConsole() throws IOException
	{
		String path="/Users/Anant/git/Learning-JAVA/JavaProgramming/src/Unit_03/input.txt";
		File file=new File(path);
		BufferedReader br= new BufferedReader(new FileReader(file));  
		
		String st;
		while((st=br.readLine())!=null)
		{
			System.out.println(st);
		}
		
		if(br.readLine()==null)
		{
			System.out.println("Yess!");
		}
		br.close();
		
		BufferedReader br1=new BufferedReader(new FileReader(file));
		//list that holds string of a file
		List<String>listOfStrings=new ArrayList<String>();
		//read entire line as string
		
		String line = br1.readLine();
		
		while(line!=null)
		{
			listOfStrings.add(line);
			line=br1.readLine();
		}
		
		for(String str: listOfStrings)
		{
			System.out.println(str);
		}
		System.out.println("\n");
		br1.close();
	}
	void saveOutputIntoAFile() throws IOException
	{
		FileWriter myObj = null;

		try {
			myObj = new FileWriter("C:\\Users\\Anant\\git\\Learning-JAVA\\JavaProgramming\\src\\Unit_03\\output.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

		BufferedWriter f_writer = new BufferedWriter(myObj);

		String text = "Hey this would store in Output file";

		f_writer.write(text);
		f_writer.close();

	}
	void createALogFile() throws IOException
	{
		int a=10;
		a++;
		
		//Find current time and Date
		LocalTime ltime = java.time.LocalTime.now();
		LocalDate ldate = java.time.LocalDate.now();
		
		FileWriter myObj = null;

		try {
			myObj = new FileWriter("C:\\Users\\Anant\\git\\Learning-JAVA\\JavaProgramming\\src\\Unit_03\\log.txt",true);
		} catch (IOException e) {
	
			e.printStackTrace();
		}

		BufferedWriter f_writer = new BufferedWriter(myObj);

		String text = "The Program executed at: " + ltime.toString() + " " + ldate.toString() + "\n";

		try {
			f_writer.write("Value of a: " + a + ", ");
			f_writer.write(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		f_writer.close();

	}
		
}