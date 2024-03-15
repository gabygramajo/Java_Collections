package iterate_collections;

import model.Alumno;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class IterateCollections {
    public static void main(String[] args) {
        Set<Alumno> alumnos = new HashSet<>();

        alumnos.add(new Alumno("Miguel", 2));
        alumnos.add(new Alumno("Luz", 4));
        alumnos.add(new Alumno("Mariela", 9));
        alumnos.add(new Alumno("Juan", 8));
        alumnos.add(new Alumno("Pedro", 6));
        alumnos.add(new Alumno("Carmen", 10));

        for (Alumno alumno: alumnos) {
            System.out.println(alumno.getNombre());
        }

        Set<Alumno> alumnos2 = new TreeSet<>(alumnos);

        for (Alumno alumno: alumnos2) {
            System.out.println(alumno.getNombre());
        }
    }
}
