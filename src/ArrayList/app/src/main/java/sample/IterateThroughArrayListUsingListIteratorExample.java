package ArrayList.app.src.main.java.sample;
/*
  Iterate through elements Java ArrayList using ListIterator Example
  This Java Example shows how to iterate through the elements of java
  ArrayList object in forward and backward direction using ListIterator.
*/
/*
Iterar a través de elementos Java ArrayList usando el ejemplo ListIterator
Este ejemplo de Java muestra cómo iterar a través de los elementos del objeto 
java ArrayList en dirección hacia adelante y hacia atrás usando ListIterator.
*/

import java.util.ArrayList;
import java.util.ListIterator;

public class IterateThroughArrayListUsingListIteratorExample {

    public static void main(String[] args) {

        //create an ArrayList object
        ArrayList<String> arrayList = new ArrayList<String>();

        //Add elements to Arraylist
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
   
    
      //Get a ListIterator object for ArrayList using listIterator() method.
      /* Obtenga un objeto ListIterator para ArrayList usando el método listIterator ().*/
    
        ListIterator<String> itr = arrayList.listIterator();
   
    /*
      Use hasNext() and next() methods of ListIterator to iterate through
      the elements in forward direction.
    */
        System.out.println("Iterating through ArrayList elements in forward direction...");
        while (itr.hasNext())
            System.out.println(itr.next());
 
    /*
      Use hasPrevious() and previous() methods of ListIterator to iterate through
      the elements in backward direction.
    */
        /*
        Utilice los métodos hasPrevious () y previous () de ListIterator para iterar a través de los elementos en dirección hacia atrás.
      */
        System.out.println("Iterating through ArrayList elements in backward direction...");
        while (itr.hasPrevious())
            System.out.println(itr.previous());

    }
}
 
/*
Output would be
Iterating through ArrayList elements...
Iterating through ArrayList elements in forward direction...
1
2
3
4
5
Iterating through ArrayList elements in backward direction...
5
4
3
2
1
*/