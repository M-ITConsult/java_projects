package technofutur.Java.Lambda;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>();
        HashMap<Integer, String> listeJour = new HashMap<>();

        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(5);

        listeJour.put(1,"Monday");
        listeJour.put(2,"Tuesday");
        listeJour.put(3,"Wednesday");
        listeJour.put(4,"Thursday");
        listeJour.put(5,"Friday");
        listeJour.put(6,"Saturday");
        listeJour.put(7,"Sunday");

        for(int element : liste) {
            System.out.println(element);
        }

        System.out.println("------------------------");

        // Lambda
        liste.forEach(e -> System.out.println(e));
        liste.forEach((e) -> System.out.println(e));

        listeJour.forEach((k,v) -> {
//            System.out.println(k);
//            System.out.println(v);

            System.out.println();
            // Affichage liste valeur k et v
            System.out.printf("The day %s is %s%n", k, v);
        });

        Runnable hello = () -> System.out.println("Hello World!");

        hello.run();


    }


}
