﻿package basePackage;

import java.io.IOException;

public class Main 
{
	/**
	 * Main thread of the program
	 * @param args args of passed from console
	 */
	public static void main(String[] args) 
	{
		
		Controller control = new Controller(); 
				
		for(String fileName : args) {
			System.out.println("Filename : "+fileName);
			try {
				String text = control.readText(fileName);
				System.out.println(text);
				String[] words = control.treatAndSplitText(text);
				String fileText = control.generateDiagraph(words);
				control.writeText(fileName,".csv",fileText);
			} catch (IOException e2) {
				System.out.println("Program finished with error: "+e2.getMessage());
			}
		}

		System.out.println("End");
	}		
}