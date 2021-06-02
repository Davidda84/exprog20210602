package fp.daw.exprog20210602.ejercicio2;

import java.io.FileNotFoundException;

public class ProgE02 {
	public static void main(String[] args) {
		
		Frecuencia freq=null;
		try {
			freq = new Frecuencia("archivos\\El Quijote ISO-8859-1.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(freq.getFrecuencia("a"));

	}

}
