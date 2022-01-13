package com.DemoFlieHandling;

import java.io.File;
import java.io.IOException;

public class Program1 {
	public static void main(String[] args) {
		File f1=new File("G:/C++/bag.txt");
		try {
			boolean b1=f1.createNewFile();
			System.out.println("File create="+b1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
