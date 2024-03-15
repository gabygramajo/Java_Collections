package list_collections;

import model.Alumno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Miguel", 2));
        alumnos.add(new Alumno("Luz", 4));
        alumnos.add(new Alumno("Mariela", 9));
        alumnos.add(new Alumno("Juan", 8));
        alumnos.add(new Alumno("Pedro", 6));

        // add and move element using index
        alumnos.add(2, new Alumno("Carmen", 10));

        // set: add and replace element using index (Martin overwrites to Luz)
        alumnos.set(1, new Alumno("Martin", 9));

        // basics methods
        System.out.println("Size: " + alumnos.size());
        System.out.println("is Empty: " + alumnos.isEmpty());
        System.out.println("Contains: " + alumnos.contains(new Alumno("Juan", 8)));

        // remove Mariela
        alumnos.remove(3);

        alumnos.forEach(System.out::println);
    }
}
