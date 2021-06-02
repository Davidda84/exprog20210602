package fp.daw.exprog20210602.ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

public class Frecuencia {

	static Map<String,Integer> mapa = new TreeMap<String,Integer>();
	private String ruta;
	
	public Frecuencia(String archivo) throws FileNotFoundException {
		this.ruta = archivo;
		try (BufferedReader reader1 = new BufferedReader(new FileReader(this.ruta))) {
			String line;
			while ((line = reader1.readLine()) != null) {
				for (String l : line.toLowerCase().split("\\P{L}+")) {
					if(l.length()>0) {
						if (mapa.get(l) == null) {
							mapa.put(l,1);
						}else {
							mapa.put(l,mapa.get(l) +1);						
						}
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (PrintWriter pw = new PrintWriter(new FileWriter(this.ruta))) {
			pw.println(mapa.toString().replace("{","").replace("}","").replace(", ","\n"));
			System.out.println("Archivo creado");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public int getFrecuencia(String cadena) {
		try (BufferedReader reader = new BufferedReader(new FileReader("archivos\\examen_ejercicio2.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] l = line.split("=");
				mapa.put(l[0], Integer.parseInt(l[1]));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(mapa.get(cadena)!=null) {
			return mapa.get(cadena);
		}
		
		return 0;
		
	}

}
