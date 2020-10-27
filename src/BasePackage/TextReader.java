package BasePackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public  class TextReader {


	public static void leitor(String path) throws IOException {
	    String aux = null;
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if (linha != null) {
				//System.out.println(linha);
				aux = aux + linha;

			} else
				break;
			linha = buffRead.readLine();
		}
        aux.replace("\n", " ");
		System.out.println(aux);
		buffRead.close();
	}

}
