
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
        
//        int[] cadenaGnome = sort.GnomeSort(data);
//        System.out.println("Gnome Sort:");
//        System.out.println(Arrays.toString(cadenaGnome));
//        
//        int[] cadenaMerge = sort.MergeSort(data.lista);
//        System.out.println("Merge Sort:");
//        System.out.println(Arrays.toString(cadenaMerge));
       
        int[] cadenaQuick = s.quickSort(a.cadena,0,2999);
        System.out.println("Quick Sort:");
        System.out.println(Arrays.toString(cadenaQuick));
      
//        int[] cadenaRadix = sort.RadixSort(data);
//        System.out.println("Radix Sort");
//        System.out.println(Arrays.toString(cadenaRadix));
       
    }
    
}
