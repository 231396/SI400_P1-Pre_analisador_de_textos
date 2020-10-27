package basePackage;

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
		
		control.readText();
		control.writeText();
		control.readText();
		
		TextReader tr = new TextReader();
		String str = "Eu como maça 21 Eu como maça 21";
		DigraphMaker dm = new DigraphMaker();
		TextWriter tw = new TextWriter(dm.made(tr.stringToWords(tr.treatText(str))));
		try { 
			System.out.println(tw.Write("Arquivo"));
		} 
		catch(IOException e){}
		//System.out.println(try { tw.Write("Arquivo") } catch{});
	}		
}