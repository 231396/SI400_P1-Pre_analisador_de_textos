package basePackage;

import java.io.IOException;

import util.MultiMap;

/**
 * The class responsible for controlling program execution
 */
public class Controller {
	
	public String[] readText(String fileName) throws IOException {
		//TextReader tr = new TextReader();
		
		TextReader tr = new TextReader();
		String str = tr.reader(fileName);
		return tr.stringToWords(tr.treatText(str));
	}
	
	public String MakeDigraph(String[] worlds) {
		DigraphMaker dm = new DigraphMaker();
		MultiMap<String, String> mm =  dm.madeDiagraph(worlds);
		return dm.diagraphToString(mm, ',');
	}
	
	public void writeText(String fileName, String fileExtension, String fileText) throws IOException {
		TextWriter tw = new TextWriter();
		tw.writeFile(fileName,fileExtension,fileText);
	}
	
	
}
