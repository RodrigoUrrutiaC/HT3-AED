
package sorts;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 09.02.2018
 */


public class Sorts {
    
    public Sorts(){ }

//    ALGORITMO QUICK SORT OBTENIDO DE:
//    https://es.stackoverflow.com/questions/7836/c%C3%B3mo-funciona-el-algoritmo-de-quicksort
    
    public int[] quickSort(int[] cadena, int izquierda, int derecha) {
        int pivote = cadena[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        while (i < j) {
            while (cadena[i] <= pivote && i < j) {
                i++;
            }
            while (cadena[j] > pivote) {
                j--;
            }
            if (i < j) {
                auxIntercambio = cadena[i];
                cadena[i] = cadena[j];
                cadena[j] = auxIntercambio;
            }
        }
        cadena[izquierda] = cadena[j];
        cadena[j] = pivote;
        if (izquierda < j - 1) {
            quickSort(cadena, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            quickSort(cadena, j + 1, derecha);
        }
        
        return cadena; 
    }
    
}