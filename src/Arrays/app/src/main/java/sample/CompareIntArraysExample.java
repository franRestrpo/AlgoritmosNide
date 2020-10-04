package Arrays.app.src.main.java.sample;


/*
  Compare Two Java int Arrays Example
  This java example shows how to compare two integer arrays for equality using
  Arrays.equals method.
  Ejemplo de comparación de dos matrices de enteros de Java
   Este ejemplo de Java muestra cómo comparar dos matrices de enteros para 
   determinar la igualdad utilizando el método Arrays.equals.
*/

import java.util.Arrays;

public class CompareIntArraysExample {

    public static void main(String[] args) {
        //create int arrays
        int[] intArray1 = new int[]{27, 78, 1023};
        int[] intArray2 = new int[]{27, 78, 1023};

    /*
      To compare two int arrays use,
      static boolean equals(int array1[], int array2[]) method of Arrays class.

      It returns true if both arrays are equal. Arrays are considered as equal
      if they contain same elements in same order.
      Para comparar dos matrices de enteros, utilice el método 
      static boolean equals (int array1 [], int array2 []) de la clase Arrays.
      Devuelve verdadero si ambas matrices son iguales.
      Las matrices se consideran iguales si contienen los mismos elementos en el mismo orden.
    */

        boolean blnResult = Arrays.equals(intArray1, intArray2);
        System.out.println("Are two int arrays equal ? : " + blnResult);

    /*
      Please note that two int array references pointing to null are
      considered as equal.
      Tenga en cuenta que dos referencias de matriz de enteros que apuntan 
      a nulo se consideran iguales.
    */

    }
}

/*
 Output of the program would be
 Are two int arrays equal ? : true
 */
