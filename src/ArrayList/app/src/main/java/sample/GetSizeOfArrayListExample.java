package ArrayList.app.src.main.java.sample;
/*
  Get Size of Java ArrayList and loop through elements Example
  This Java Example shows how to get size or number of elements currently
  stored in ArrayList. It also shows how to loop through element of it.
*/
/*
  Obtiene  el tamaño del ArrayList de Java y recorre los elementos del Ejemplo
  Este ejemplo de Java muestra cómo obtener el tamaño o la cantidad de elementos actualmente
  almacenados en el  ArrayList. También muestra cómo recorrer los  elementos del mismo.
*/
import java.util.ArrayList;

public class GetSizeOfArrayListExample {

    public static void main(String[] args) {
        //create an ArrayList object
        ArrayList<String> arrayList = new ArrayList<String>();

        //Add elements to Arraylist using
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

        //To get size of Java ArrayList use int size() method
        int totalElements = arrayList.size();

        System.out.println("ArrayList contains...");
        //loop through it
        for (int index = 0; index < totalElements; index++)
            System.out.println(arrayList.get(index));
    }
}

/*
 Output would be
 ArrayList contains...
 1
 2
 3
 */
