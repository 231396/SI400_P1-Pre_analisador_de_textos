package basePackage;

import java.io.IOException;

import util.MultiMap;

/**
 * The class responsible for controlling program execution
 */
public class Controller {
	
	private TextWriter tw = new TextWriter();
	private TextReader tr = new TextReader();
	private DiagraphMaker dm = new DiagraphMaker();
	
	/**
	 * Read a given fileName and return it content
	 * @param fileName name of the file of will be read
	 * @return the text read from the file
	 * @throws IOException fails to read or find the file
	 */
	public String readText(String fileName) throws IOException {
		return tr.reader(fileName);
	}
	
	/**
	 * Transform a string into various words and put them in one array
	 * @param text the string to be treated and separated
	 * @return a array of string words where they are words
	 */
	public String[] treatAndSplitText(String text){
		String treatedStr = tr.treatText(text);
		return tr.stringToWords(treatedStr);
	}
	
	/**
	 * Generate a new diagraph using a multimap and given array of words
	 * @param words array of strings that are words
	 * @return the diagraph text generated from the given words
	 */
	public String generateDiagraph(String[] words) {
		MultiMap<String, String> mm = dm.makeDiagraph(words);
		return dm.diagraphToString(mm, ',');
	}
	
	/**
	 * Create a new file with a given name and write a given text
	 * @param fileName the name of the file that will be generated
	 * @param fileExtension the type of extension the file will have Ex: .txt or .csv
	 * @param fileText the text to be write in the file
	 * @throws IOException can't write the the requested file
	 */
	public void writeText(String fileName, String fileExtension, String fileText) throws IOException {
		tw.writeFile(fileName,fileExtension,fileText);
	}
	
	
}
