package ArrayList.app.src.main.java.sample;
/*
  Remove all elements from Java ArrayList Example
  This Java Example shows how to remove all elements from java ArrayList object
  using clear method.
*/
/*
Eliminar todos los elementos del ejemplo de Java ArrayList
Este ejemplo de Java muestra cómo eliminar todos los elementos del objeto java ArrayList utilizando el método clear.
*/

import java.util.ArrayList;

public class RemoveAllElementsOfArrayListExample {

    public static void main(String[] args) {
        //create an ArrayList object
        ArrayList<String> arrayList = new ArrayList<String>();

        //Add elements to Arraylist
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

        System.out.println("Size of ArrayList before removing elements : " + arrayList.size());
    
        //To remove all elements from the ArrayList use void clear() method.
    
       // Para eliminar todos los elementos de ArrayList, use el método void clear ().
       
        arrayList.clear();
        System.out.println("Size of ArrayList after removing elements : " + arrayList.size());
    }
}
/*
Output would be
Size of ArrayList before removing elements : 3
Size of ArrayList after removing elements : 0
*/
