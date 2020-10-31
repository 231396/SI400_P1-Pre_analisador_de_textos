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
	
	
	public String[] readText(String fileName) throws IOException {
		//TextReader tr = new TextReader();		
		String str = tr.reader(fileName);
		String treatedStr = tr.treatText(str);
		return tr.stringToWords(treatedStr);
	}
	
	public String createDiagraph(String[] words) {
		MultiMap<String, String> mm =  dm.makeDiagraph(words);
		return dm.diagraphToString(mm, ',');
	}
	
	public void writeText(String fileName, String fileExtension, String fileText) throws IOException {
		tw.writeFile(fileName,fileExtension,fileText);
	}
	
	
}
