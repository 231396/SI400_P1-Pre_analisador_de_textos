package basePackage;

import java.io.FileWriter;
import java.io.IOException;

public class TextWriter {

	/**
	 * Write a given text in a file with
	 * @param fileName
	 * @param fileExtension
	 * @param fileText
	 * @throws IOException
	 */
	public void WriteFile(String fileName, String fileExtension, String fileText) throws IOException {
		
		/*Create a PrintWriter to write in the file*/
		FileWriter fileWriter = new FileWriter(fileName+fileExtension);	
		/* Write content into file */
		fileWriter.write(fileText);		
	    /*Close and save the file*/
		fileWriter.flush();
	    fileWriter.close();
	}	
}