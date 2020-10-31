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
	
	public MultiMap<String, String> MakeDigraph(String[] worlds) {
		DigraphMaker dm = new DigraphMaker();
		return dm.made(worlds);
	}
	
	public void writeText(MultiMap<String, String> multimap, String fileName) throws IOException {
		TextWriter tw = new TextWriter(multimap);
		tw.Write(fileName);
	}
	
	
}
