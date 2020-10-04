package ArrayList.app.src.main.java.sample;
/*
  Insert all elements of other Collection to Specified Index of Java
  ArrayList Example
  This Java Example shows how to insert all elements of other Collection object
  at specified index of Java ArrayList object using addAll method.
*/
/*
Inserte todos los elementos de otra colección en el índice especificado de Java ArrayList Ejemplo.
Este ejemplo de Java muestra cómo insertar todos los elementos de otro objeto Collection en el índice 
especificado del objeto Java ArrayList utilizando el método addAll.
*/

import java.util.ArrayList;
import java.util.Vector;

public class InsertAllElementsOfOtherCollectionToArrayListExample {

    public static void main(String[] args) {

        //create an ArrayList object
        ArrayList<String> arrayList = new ArrayList<String>();

        //Add elements to Arraylist
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

        //create a new Vector object
        Vector<String> v = new Vector<String>();
        v.add("4");
        v.add("5");
   
    /*
      To insert all elements of another Collection to specified index of ArrayList
      use
      boolean addAll(int index, Collection c) method.
      It returns true if the ArrayList was changed by the method call.
    */
      /*
        Para insertar todos los elementos de otra colección en el índice especificado de ArrayList
        use el método boolean addAll (int index, Collection c).
        Devuelve verdadero si la llamada al método cambió ArrayList.
      */


        //insert all elements of Vector to ArrayList at index 1
        arrayList.addAll(1, v);

        //display elements of ArrayList
        System.out.println("After inserting all elements of Vector at index 1, ArrayList contains.. ");
        for (int i = 0; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i));

    }
}
 
/*
Output would be
After inserting all elements of Vector at index 1, ArrayList contains..
1
4
5
2
3
*/