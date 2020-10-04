package ArrayList.app.src.main.java.sample;
/*
  Iterate through elements Java ArrayList using Iterator Example
  This Java Example shows how to iterate through the elements of java
  ArrayList object using Iterator.
*/
/*
Iterar a través de elementos Java ArrayList usando Iterator Ejemplo.
Este ejemplo de Java muestra cómo iterar a través de los elementos del objeto java ArrayList usando Iterator.
*/
import java.util.ArrayList;
import java.util.Iterator;

public class IterateThroughArrayListUsingIteratorExample {

    public static void main(String[] args) {

        //create an ArrayList object
        ArrayList<String> arrayList = new ArrayList<String>();

        //Add elements to Arraylist
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");

        //get an Iterator object for ArrayList using iterator() method.
     // obtener un objeto Iterator para ArrayList usando el método iterator ().
        Iterator<String> itr = arrayList.iterator();

        //use hasNext() and next() methods of Iterator to iterate through the elements
     // usa los métodos hasNext () y next () de Iterator para iterar a través de los elementos
        System.out.println("Iterating through ArrayList elements...");
        while (itr.hasNext()) System.out.println(itr.next());
    }
}

/*
 Output would be
 Iterating through ArrayList elements...
 1
 2
 3
 4
 5
 */
