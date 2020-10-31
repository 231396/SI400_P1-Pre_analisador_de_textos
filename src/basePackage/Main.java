﻿package basePackage;

import java.io.IOException;

import util.MultiMap;

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
				String[] worlds = control.readText(fileName);
				MultiMap<String, String> multimap = control.MakeDigraph(worlds);
				control.writeText(multimap,fileName);
			} catch (IOException e2) {
				System.out.println("Program finished with error: "+e2.getMessage());
			}
		}

		System.out.println("End");
	}		
}