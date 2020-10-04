package Arrays.app.src.main.java.sample;


/*
  Compare Two Java short Arrays Example
  This java example shows how to compare two short arrays for equality using
  Arrays.equals method.
  Ejemplo de comparación de dos matrices short de Java
   Este ejemplo de Java muestra cómo comparar dos arreglos short 
   para la igualdad usando el método Arrays.equals.
*/

import java.util.Arrays;

public class CompareShortArraysExample {

    public static void main(String[] args) {
        //create short arrays
        short[] shortArray1 = new short[]{107, 93, 58};
        short[] shortArray2 = new short[]{107, 93, 58};

    /*
      To compare two short arrays use,
      static boolean equals(short array1[], short array2[]) method of Arrays class.

      It returns true if both arrays are equal. Arrays are considered as equal
      if they contain same elements in same order.
      
    Para comparar dos matrices short, use el método 
    static boolean equals (short array1 [], short array2 []) de la clase Arrays.

       Devuelve verdadero si ambas matrices son iguales. Las matrices se 
       consideran iguales si contienen los mismos elementos en el mismo orden.*/

        boolean blnResult = Arrays.equals(shortArray1, shortArray2);
        System.out.println("Are two short arrays equal ? : " + blnResult);

    /*
      Please note that two short array references pointing to null are
      considered as equal.
      Tenga en cuenta que dos referencias de matriz short que apuntan a 
      nulo se consideran iguales.
    */

    }
}

/*
 Output of the program would be
 Are two short arrays equal ? : true
 */
