package ArrayList.app.src.main.java.sample;
/*
 * Get Sub List of Java ArrayList Example
 * This Java Example shows how to get sub list of java ArrayList using subList
 * method by providing start and end index.
*/
/*
 * Obtener sublista del ejemplo de Java ArrayList.
 * Este ejemplo de Java muestra cómo obtener una sublista de java ArrayList, usando el método 
 * subList y proporcionando índice de inicio y finalización.
*/

import java.util.ArrayList;
import java.util.List;

public class GetSubListOfJavaArrayListExample {

    public static void main(String[] args) {

        //create an ArrayList object
    	ArrayList<String> arrayList = new ArrayList<String>();

        //Add elements to Arraylist
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");

    /*
       To get a sub list of Java ArrayList use
       List subList(int startIndex, int endIndex) method.
       This method returns an object of type List containing elements from
       startIndex to endIndex - 1.
    */
        /*
        Para obtener una sublista de Java ArrayList use su método 
        List subList (int startIndex, int endIndex)
        Este método devuelve un objeto de tipo Lista que contiene elementos de inicio del índice hasta el final del índice - 1.     */


        List<String> lst = arrayList.subList(1, 3);

        //display elements of sub list.
        System.out.println("Sub list contains : ");
        for (int i = 0; i < lst.size(); i++) System.out.println(lst.get(i));

    /*
      Sub List returned by subList method is backed by original Arraylist. So any
      changes made to sub list will also be REFLECTED in the original Arraylist.
    */
     /*
        La sublista devuelta por el método subList está respaldada por ArrayList original. Por lo tanto, cualquier cambio 
        realizado en la sublista también se REFLEJARÁ en la ArrayList original.
    */

        //remove one element from sub list
        Object obj = lst.remove(0);
        System.out.println(obj + " is removed from sub list");

        //print original ArrayList
        System.out.println("After removing " + obj + " from sub list, original ArrayList contains : ");
        for (int i = 0; i < arrayList.size(); i++) System.out.println(arrayList.get(i)); 
    }
}
/*
Output would be
Sub list contains :
2
3
2 is removed from sub list
After removing 2 from sub list original ArrayList contains :
1
3
4
5
*/
