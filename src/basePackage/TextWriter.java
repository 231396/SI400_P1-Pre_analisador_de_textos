package basePackage;

import java.io.FileWriter;
import java.io.IOException;

/**
 * This class has the responsibility to perform all the program output
 */
public class TextWriter {

	/**
	 * Create a text file of a given name and extension, after that it will write a given text int that file.
	 * @param fileName name of the file
	 * @param fileExtension extension of the file
	 * @param fileText text that will be write on the file
	 * @throws IOException fail to write to the file
	 */
	public void writeFile(String fileName, String fileExtension, String fileText) throws IOException {
		
		/*Create a PrintWriter to write in the file*/
		FileWriter fileWriter = new FileWriter(fileName+fileExtension);	
		/* Write content into file */
		fileWriter.write(fileText);		
	    /*Close and save the file*/
		fileWriter.flush();
	    fileWriter.close();
	}	
}