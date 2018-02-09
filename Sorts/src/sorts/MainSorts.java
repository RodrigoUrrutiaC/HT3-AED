
package sorts;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 09.02.2018
 */


import java.io.IOException;
import java.util.Arrays;

public class MainSorts {
    
    public static void main(String[] args) throws IOException{
        
        Aleatorio a = new Aleatorio();
        Sorts s = new Sorts();
        
        int[] cadenaGnome = s.gnomeSort(a.cadena);
        System.out.println("Gnome Sort:");
        System.out.println(Arrays.toString(cadenaGnome));

        int[] cadenaQuick = s.quickSort(a.cadena,0,2999);
        System.out.println("Quick Sort:");
        System.out.println(Arrays.toString(cadenaQuick));
      
        int[] cadenaRadix = s.radixSort(a.cadena);
        System.out.println("Radix Sort");
        System.out.println(Arrays.toString(cadenaRadix));
        
        //Ya funciona pero imprime el orden un numero por fila
        int[] inputArray =  {1, 3, 5, 2, 4, 6};
        int[] sortedArray = s.divideAndConquer(a.cadena);
        for (int i=0; i<sortedArray.length; i++) {
        System.out.println(sortedArray[i]);
     }
    }
 }

