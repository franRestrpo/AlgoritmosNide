package Arrays.app.src.main.java.sample;


/*
  Compare Two Java double Arrays Example
  This java example shows how to compare two double arrays for equality using
  Arrays.equals method.
*/

import java.util.Arrays;

public class CompareDoubleArraysExample {

    public static void main(String[] args) {
        //create double arrays
        double[] dblArray1 = new double[]{10.3221, 789.23, 427.213};
        double[] dblArray2 = new double[]{10.3221, 789.23, 427.213};

    /*
      To compare two double arrays use,
      static boolean equals(double array1[], double array2[]) method of Arrays class.

      It returns true if both arrays are equal. Arrays are considered as equal
      if they contain same elements in same order.

      Two double elements are considered as equal if
      new Double(d1).equals(new Double(d2))
      
      para comparar dos matrices use el método 
      static boolean equals(double array1[], double array2[]) de la clase array.
      Devuelve verdadero si ambas matrices son iguales. Las matrices se consideran 
      iguales si contienen los mismos elementos en el mismo orden.
      Dos elementos se consideran iguales si new Double(d1).equals(new Double(d2))
      
    */

        boolean blnResult = Arrays.equals(dblArray1, dblArray2);
        System.out.println("Are two double arrays equal ? : " + blnResult);

    /*
      Please note that two double array references pointing to null are
      considered as equal.
      Also, two NaN values are considered equal. But 0.0d and -0.0d are
      considered as unequal.
      Tenga en cuenta que dos referencias de matriz doble que apuntan a nulo se consideran iguales.
       Además, dos valores de NaN se consideran iguales. Pero 0.0d y -0.0d se consideran desiguales.
    */

    }
}

/*
 Output of the program would be
 Are two double arrays equal ? : true
 */
