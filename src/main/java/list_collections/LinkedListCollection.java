package list_collections;

import model.Alumno;

import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Alumno> alumnos = new LinkedList<>();
        alumnos.add(new Alumno("Miguel", 2));
        alumnos.add(new Alumno("Luz", 4));
        alumnos.add(new Alumno("Mariela", 9));
        alumnos.add(new Alumno("Juan", 8));
        alumnos.add(new Alumno("Pedro", 6));
        System.out.println("alumnos = " + alumnos);

        // LinkedList Methods
        System.out.println("getFirst = " + alumnos.getFirst());
        System.out.println("getLast = " + alumnos.getLast());

        alumnos.addFirst(new Alumno("Carmen", 10));
        alumnos.addLast(new Alumno("Martin", 9));
        System.out.println("\nalumnos = " + alumnos);

        System.out.println("getFirst = " + alumnos.getFirst());
        System.out.println("getLast = " + alumnos.getLast());

        // remove
        alumnos.removeFirst();
        alumnos.poll();
//        alumnos.pollFirst();
//        alumnos.pop();

        alumnos.removeLast();
        alumnos.pollLast();

        System.out.println(alumnos);
    }
}
