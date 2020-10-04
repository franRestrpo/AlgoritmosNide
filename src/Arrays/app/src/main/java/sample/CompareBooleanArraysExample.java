package Arrays.app.src.main.java.sample;


/*
  Compare Two Java boolean Arrays Example
  This java example shows how to compare two boolean arrays for equality using
  Arrays.equals method.
*/

/* Ejemplo de comparación de dos matrices booleanas de Java
 * Este ejemplo de Java muestra cómo comparar si dos matrices 
 * booleanas son iguales  utilizando el método Arrays.equals.
 */

import java.util.Arrays;

public class CompareBooleanArraysExample {

    public static void main(String[] args) {
        //create boolean arrays
        boolean[] blnArray1 = new boolean[]{true, false, true};
        boolean[] blnArray2 = new boolean[]{true, false, true};

    /*
      To compare two boolean arrays use,
      static boolean equals(boolean array1[], boolean array2[])
      method of Arrays class.

      It returns true if both arrays are equal. Arrays are considered as equal
      if they contain same elements in same order.
    */
        /*
         * Devuelve verdadero si ambas matrices son iguales. Las matrices se 
         * consideran iguales si contienen los mismos elementos en el mismo orden.
         */
        

        boolean blnResult = Arrays.equals(blnArray1, blnArray2);
        System.out.println("Are two boolean arrays equal ? : " + blnResult);

    /*
      Please note that two boolean array references pointing to null are
      considered as equal.
    */
    /*Tenga en cuenta que dos referencias de matriz booleana que apuntan a 
     * nulo se consideran iguales.
     */

    }
}

/*
 Output of the program would be
 Are two boolean arrays equal ? : true
 */
