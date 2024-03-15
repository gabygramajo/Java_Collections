package list_collections;

import model.Alumno;

import java.util.ArrayList;
import java.util.List;

public class ListCollections {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Miguel", 2));
        alumnos.add(new Alumno("Luz", 4));
        alumnos.add(new Alumno("Mariela", 9));
        alumnos.add(new Alumno("Juan", 8));
        alumnos.add(new Alumno("Pedro", 6));
        alumnos.add(new Alumno("Carmen", 10));

    }
}
