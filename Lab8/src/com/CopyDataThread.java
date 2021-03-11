package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

public class CopyDataThread extends Thread{

	
	public void run() {
		byte b[]=new byte[1024];
		try {
			FileInputStream fis=new FileInputStream("E:/source.txt");
			fis.read(b);
			FileOutputStream fos=new FileOutputStream("E:/target.txt");
			
			int c=-10;
			int a=0;
			while(true) {
				try {
				fos.write(b,c+=10,a+=10);
				System.out.println("Copied 10 characters");
				Thread.sleep(1000);
				}
				catch(Exception e) {
					
				}
				
			}
					
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		
		
	}

	
	

}
	 

	