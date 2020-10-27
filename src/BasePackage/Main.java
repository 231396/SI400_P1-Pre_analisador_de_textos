package BasePackage;

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
	}		
}