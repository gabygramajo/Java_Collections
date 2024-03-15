package list_collections;

import model.Alumno;

import java.util.*;

public class ListCollections {
    public static void main(String[] args) {
        //List<Alumno> alumnos = new ArrayList<>();
        List<Alumno> alumnos = new LinkedList<>();

        alumnos.add(new Alumno("Miguel", 2));
        alumnos.add(new Alumno("Luz", 4));
        alumnos.add(new Alumno("Mariela", 9));
        alumnos.add(new Alumno("Juan", 8));
        alumnos.add(new Alumno("Pedro", 6));
        alumnos.add(new Alumno("Carmen", 10));

        // Collections.sort(alumnos, (a,b) -> a.getNota().compareTo(b.getNota()));
        // alumnos.sort((a, b) -> a.getNota().compareTo(b.getNota()));
        // Con Java 8
        // alumnos.sort(Comparator.comparing((Alumno a) -> a.getNota()).reversed());
        alumnos.sort(Comparator.comparing(Alumno::getNota).reversed());

        alumnos.forEach(System.out::println);
    }
}
