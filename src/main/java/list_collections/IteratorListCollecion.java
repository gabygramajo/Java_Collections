package list_collections;

import model.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorListCollecion {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Miguel", 2));
        alumnos.add(new Alumno("Luz", 4));
        alumnos.add(new Alumno("Mariela", 9));
        alumnos.add(new Alumno("Juan", 8));
        alumnos.add(new Alumno("Pedro", 6));

        ListIterator<Alumno> li = alumnos.listIterator();

        System.out.println("======== from Start to End =======");
        while (li.hasNext()){
            System.out.println("Alumno: " + li.next());
        }

        System.out.println("\n======== from End to the Start =======");
        while (li.hasPrevious()) {
            System.out.println("Alumno: " + li.previous());
        }
    }
}
