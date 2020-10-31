package basePackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public  class TextReader {

	/**
	 * Read a text file in a given path and return the content
	 * @param path path leading to the file
	 * @return String containing all the text of the text file
	 * @throws IOException fails to read the text or path not found
	 */
	public String reader(String fileName) throws IOException {
		StringBuilder sb = new StringBuilder();
//		FileReader fr = new FileReader(fileName,StandardCharsets.UTF_8);
		File file = new File(fileName);
		BufferedReader buffRead = Files.newBufferedReader(file.toPath(), Charset.forName("UTF-8"));
		
		/*Read Text File*/
		String line = "";
		while (true) {		
			sb.append(line);
			line = buffRead.readLine();
			if(line != null)
				line += "\n";
			else
				break;
		}		
		
		/*Close File*/
//		fr.close();
		buffRead.close();
		return sb.toString();
	}

	/**
	 * Treat a given string, exchanging lines for spaces, convert them to lowercase and remove punctuation.
	 * @param str string with the text to treat
	 * @return treated string
	 */
	public String treatText(String str) {		
		return str.replaceAll("\n", " ")
				.replaceAll("\r", "")
				.replaceAll("[\\\\\\/\\.\\!\\?\\,\\(\\)\\$\\[\\]\\:\\;\\�\\�\\\"\\'\\*\\�\\�\\@]", "")
				.toLowerCase();
	}
	
	/**
	 * Transforms text into an array, separated by one or more spaces characters.
	 * @param str the string that will be separated
	 * @return String array containing each word that was separated
	 */
	public String[] stringToWords(String str) {
		return str.split(" +");
	}
	
}
