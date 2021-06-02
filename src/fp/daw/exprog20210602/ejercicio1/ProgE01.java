package fp.daw.exprog20210602.ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ProgE01 {

	public static void main(String[] args) {
		Alumno a1 = new Alumno("nombre1", "apellido1", LocalDate.parse("2018-10-11"), "DAW", 1);
		Alumno a2 = new Alumno("nombre2", "apellido2", LocalDate.parse("2018-10-02"), "DAW", 1);
		Alumno a3 = new Alumno("nombre3", "apellido3", LocalDate.parse("2018-10-07"), "DAM", 1);
		Alumno a4 = new Alumno("nombre4", "apellido4", LocalDate.parse("2018-10-04"), "DAW", 2);
		Alumno a5 = new Alumno("nombre5", "apellido5", LocalDate.parse("2018-10-15"), "DAM", 1);
		Alumno a6 = new Alumno("nombre6", "apellido6", LocalDate.parse("2018-10-06"), "DAW", 1);
		
		List<Alumno> alumnos = new ArrayList<Alumno>();
		TreeSet<Alumno> ordenAPyN = new TreeSet<Alumno>();
		alumnos.add(a1);
		alumnos.add(a2);
		alumnos.add(a3);
		alumnos.add(a4);
		alumnos.add(a5);
		alumnos.add(a6);
		ordenAPyN.addAll(alumnos);
		System.out.println(ordenAPyN);
		
		
		
		

	}

}
