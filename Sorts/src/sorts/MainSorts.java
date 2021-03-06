
package sorts;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 09.02.2018
 */


import java.io.IOException;
import java.util.Arrays;
/**
 * MainSorts
 * Clase en donde se implementan los metodos Sorts
 */
public class MainSorts {
    
    public static void main(String[] args) throws IOException{
        
        Aleatorio a = new Aleatorio();
        Sorts s = new Sorts();
        
        Integer[] cadenaGnome = s.gnomeSort(a.cadena);
        System.out.println("Gnome Sort:");
        System.out.println(Arrays.toString(cadenaGnome));
        
        Integer[] cadenaMerge = s.mergeSort(a.cadena);
        System.out.println("Merge Sort:");
        System.out.println(Arrays.toString(cadenaMerge));

        Integer[] cadenaQuick = s.quickSort(a.cadena,0,2999);
        System.out.println("Quick Sort:");
        System.out.println(Arrays.toString(cadenaQuick));
      
        Integer[] cadenaInsertion = s.insertionSort(a.cadena);
        System.out.println("Insertion Sort:");
        System.out.println(Arrays.toString(cadenaInsertion));
        
        Integer[] cadenaRadix = s.radixSort(a.cadena);
        System.out.println("Radix Sort");
        System.out.println(Arrays.toString(cadenaRadix));      

    }
 }

