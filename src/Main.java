/*Creare una classe Fruit che accenti nel costruttore il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata*/

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<Fruit> fruitsList = new LinkedList<>(List.of(new Fruit("Pineapple"),
                new Fruit("Peach"),
                new Fruit("Apple"),
                new Fruit("Orange")));
        System.out.println(fruitsList);

        fruitsList.addFirst(new Fruit("Banana"));
        fruitsList.addLast(new Fruit("Pear"));
        System.out.println(fruitsList);
    }
}