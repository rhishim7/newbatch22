package com.zensar.file;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
		
		try {
//			System.out.println("Enter your name");
//			String input=sc.nextLine();
//			byte[] b = input.getBytes();
			fis = new FileInputStream("abc.txt");
			
			BufferedInputStream br= new BufferedInputStream(fis);
			fos = new FileOutputStream("pqr.txt",true);
			int ch = 0;
			while ((ch = fis.read()) != -1) {
			    
				System.out.print((char) ch);
			}
//			fos.write(b);
		} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(fis!=null)
					fis.close();
				if(fos!=null)
					fos.close();
				if(sc!=null)
					sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}