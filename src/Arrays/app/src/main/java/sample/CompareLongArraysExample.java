package Arrays.app.src.main.java.sample;


/*
  Compare Two Java long Arrays Example
  This java example shows how to compare two long arrays for equality using
  Arrays.equals method.
  Ejemplo de comparación de dos matrices long de Java
   Este ejemplo de Java muestra cómo comparar dos matrices long 
   para determinar la igualdad utilizando el método Arrays.equals.
*/

import java.util.Arrays;

public class CompareLongArraysExample {

    public static void main(String[] args) {
        //create long arrays
        long[] longArray1 = new long[]{213873, 87210, 320918};
        long[] longArray2 = new long[]{213873, 87210, 320918};

    /*
      To compare two long arrays use,
      static boolean equals(long array1[], long array2[]) method of Arrays class.

      It returns true if both arrays are equal. Arrays are considered as equal
      if they contain same elements in same order.
      
      Para comparar dos matrices largas, use el método 
      static boolean equals (long array1 [], long array2 []) de la clase Arrays.

      Devuelve verdadero si ambas matrices son iguales. Las matrices se 
      consideran iguales si contienen los mismos elementos en el mismo orden.
    */

        boolean blnResult = Arrays.equals(longArray1, longArray2);
        System.out.println("Are two long arrays equal ? : " + blnResult);

    /*
      Please note that two long array references pointing to null are
      considered as equal.
      Tenga en cuenta que dos referencias de matriz largas que apuntan a 
      nulo se consideran iguales.
    */

    }
}

/*
 Output of the program would be
 Are two long arrays equal ? : true
 */
