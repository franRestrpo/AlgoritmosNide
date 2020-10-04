package Arrays.app.src.main.java.sample;


/*
  Compare Two Java char Arrays Example
  This java example shows how to compare two char arrays for equality using
  Arrays.equals method.
*/

import java.util.Arrays;

public class CompareCharArraysExample {

    public static void main(String[] args) {
        //create character arrays
        char[] charArray1 = new char[]{'d', 'h', 'r', 'f'};
        char[] charArray2 = new char[]{'d', 'h', 'r', 'f'};

    /*
      To compare two char arrays use,
      static boolean equals(char array1[], char array2[]) method of Arrays class.

      It returns true if both arrays are equal. Arrays are considered as equal
      if they contain same elements in same order.
    */
    /* Para comparar dos matrices de caracteres, utilice el método 
     * static boolean equals (char array1 [], char array2 []) de la clase Arrays.
     * Devuelve verdadero si ambas matrices son iguales. Las matrices se consideran 
     * iguales si contienen los mismos elementos en el mismo orden.*/

        boolean blnResult = Arrays.equals(charArray1, charArray2);
        System.out.println("Are two char arrays equal ? : " + blnResult);

    /*
      Please note that two char array references pointing to null are
      considered as equal.
      
      Tenga en cuenta que dos referencias de matriz de caracteres que apuntan a nulo se consideran iguales.
    */

    }
}

/*
 Output of the program would be
 Are two char arrays equal ? : true
 */
