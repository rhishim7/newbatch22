package com.zensar.file;

import java.io.*;
import java.io.FileReader;
import java.io.IOException;
public class MyFileReader {
	{
	
FileReader reader = null;
	try
	{
	
		reader = new FileReader("pqr.txt");

		int ch = 0;
		while ((ch = reader.read()) != -1) {
			System.out.println((char) ch);
		}

	}
	catch(FileNotFoundException e1)
	{
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	catch(IOException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		try
		{
			if(reader!=null)
			{
				reader.close();
			}
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
}
}

	