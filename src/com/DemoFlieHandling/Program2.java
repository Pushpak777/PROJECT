package com.DemoFlieHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Program2 {
	public static void main(String[] args) {
		String data="My Name Is Khan ";
		FileWriter fw=null;
		try {
			fw=new FileWriter("G://C++/book.txt");
			fw.write(data);
			fw.write(data);
			System.out.println("CReated");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
