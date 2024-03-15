package set_collections;

import set_collections.model.Alumno;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollection {
    public static void main(String[] args) {

        Set<Alumno> alumnos = new TreeSet<>();

        alumnos.add(new Alumno("Miguel", 2));
        alumnos.add(new Alumno("Luz", 4));
        alumnos.add(new Alumno("Mariela", 9));
        alumnos.add(new Alumno("Juan", 8));
        alumnos.add(new Alumno("Pedro", 6));
        alumnos.add(new Alumno("Carmen", 10));

        System.out.println("alumnos = " + alumnos);
        //>>alumnos = [Carmen , nota=10, Juan , nota=8, Luz , nota=4, Mariela , nota=9, Miguel , nota=2, Pedro , nota=6]

        // Al ser Ordenado, tiene un costo de rendimiento extra.
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("uno");
        treeSet.add("dos");
        treeSet.add("tres");
        treeSet.add("cuatro");
        treeSet.add("cinco");

        System.out.println("treeSet = " + treeSet);
        //>> treeSet = [cinco, uno, dos, tres, cuatro]

        boolean b = treeSet.add("tres");
        System.out.println("b = " + b);
        //>> false

        Set<Integer> treeSetNumber = new TreeSet<>();
        treeSetNumber.add(10);
        treeSetNumber.add(3);
        treeSetNumber.add(1);
        treeSetNumber.add(20);
        treeSetNumber.add(8);

        System.out.println("treeSetNumber = " + treeSetNumber);
        //>> treeSetNumber = [1, 3, 8, 10, 20] orden natural
        // para que sean ordenados deben de ser comparables, o sea, tener definido el método equals y compareTo

//        Set<Integer> treeSetNumber2 = new TreeSet<>((a, c) -> c.compareTo(a));
        Set<Integer> treeSetNumber2 = new TreeSet<>(Comparator.reverseOrder());
        treeSetNumber2.add(10);
        treeSetNumber2.add(3);
        treeSetNumber2.add(1);
        treeSetNumber2.add(20);
        treeSetNumber2.add(8);

        System.out.println("treeSetNumber2 = " + treeSetNumber2);
        //>> treeSetNumber2 = [20, 10, 8, 3, 1]
    }
}
