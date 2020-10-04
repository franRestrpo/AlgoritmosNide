package ArrayList.app.src.main.java.sample;
/*
  Replace an element at specified index of Java ArrayList Example
  This Java Example shows how to replace an element at specified index of java
  ArrayList object using set method.
*/
/*
 * Reemplazar un elemento en el índice especificado de Java ArrayList Example
 * Este ejemplo de Java muestra cómo reemplazar un elemento en el índice 
 * especificado del objeto java ArrayList usando el método set.
*/

import java.util.ArrayList;

public class ReplaceElementAtSpecifiedIndexArrayListExample {

    public static void main(String[] args) {
        //create an ArrayList object
        ArrayList<String> arrayList = new ArrayList<String>();

        //Add elements to Arraylist
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

    /*
      To replace an element at the specified index of ArrayList use
      Object set(int index, Object obj) method.
      This method replaces the specified element at the specified index in the
      ArrayList and returns the element previously at the specified position.
    */
    /*
     *Para reemplazar un elemento en el índice especificado de ArrayList, use el 
     *método Object.set (int index, Object obj).
     *Este método reemplaza el elemento especificado en el índice especificado 
     *en ArrayList y devuelve el elemento anteriormente en la posición especificada.
    */
        
        arrayList.set(1, "REPLACED ELEMENT");

        System.out.println("ArrayList contains...");
        //display elements of ArrayList
        for (int index = 0; index < arrayList.size(); index++)
            System.out.println(arrayList.get(index));
    }
}

/*
 Output would be
 ArrayList contains...
 1
 REPLACED ELEMENT
 3
 */
