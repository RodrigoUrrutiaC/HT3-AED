
package sorts;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 09.02.2018
 */

/**
 * Sorts
 * Clase en donde se definen los metodos Sorts
 */
public class Sorts {
    
    public Sorts(){ }

//    ALGORITMO QUICK SORT OBTENIDO DE:
//    https://es.stackoverflow.com/questions/7836/c%C3%B3mo-funciona-el-algoritmo-de-quicksort
/**
 * metodo quicksort
 * @param cadena cadena de  numeros random
 * @param izquierda int izquierdo con el que compara
 * @param derecha int derecho con el que compara
 * @return cadena ordenada
 */
    public Integer[] quickSort(Integer[] cadena, Integer izquierda, Integer derecha) {
        Integer pivote = cadena[izquierda];
        Integer i = izquierda;
        Integer j = derecha;
        Integer auxIntercambio;
        while (i < j) {
            while (cadena[i].compareTo(pivote) < 0 && i < j) {
                i++;
            }
            while (cadena[j].compareTo(pivote) > 0) {
                j--;
            }
            if (i.compareTo(j) < 0) {
                auxIntercambio = cadena[i];
                cadena[i] = cadena[j];
                cadena[j] = auxIntercambio;
            }
        }
        cadena[izquierda] = cadena[j];
        cadena[j] = pivote;
        if (izquierda.compareTo(j - 1) < 0) {
            quickSort(cadena, izquierda, j - 1);
        }
        if ( derecha.compareTo(j+1) < 0) {
            quickSort(cadena, j + 1, derecha);
        }
        
        return cadena; 
    }

    //    ALGORITMO GNOME SORT OBTENIDO DE:
    //    http://professorjava.weebly.com/gnome-sort.html
    /**
     * metodo gnomeSort
     * @param nums cadena de numeros aleatorios 
     * @return cadena de numeros aleatorios ordenados
     */
    public Integer[] gnomeSort(Integer[] nums){ //takes unsorted array, returns sorted
    int index=1; //start of search
    Integer temp;
    while(index<nums.length){ //until the array is fully sorted
      if(nums[index].compareTo(nums[index-1])<0){ //compares nums[index] with nums[index-1]. if smaller, switch.
        temp=nums[index];
        nums[index]=nums[index-1];
        nums[index-1]=temp;
        index--; //must decrease index to recheck. since they have been swapped, the array may still be out of order
        if(index==0){ //prevents index from going lower than 1
          index=1;
        }
      }
      else{
        index++; //if sorted, go up
      }
    }
    return(nums); //reaching the end of the array- completely sorted, returns nums
  }
        
    //    ALGORITMO MERGE SORT OBTENIDO DE:
    //    http://programminglife.io/merge-sort-in-java/
    /**
     * motodo mergeSort
     * @param inputArray arreglo de numeros aleatorios
     * @return array de numeros aleatorios ordenados
     */
    public Integer[] mergeSort(Integer[] inputArray) {
        Integer n = inputArray.length;
        if(n == 1) {
          return inputArray;
        }
        Integer mid = n/2;
        Integer[] leftArray = new Integer[mid];
        Integer[] rightArray = new Integer[n - mid];
        System.arraycopy(inputArray, 0, leftArray, 0, leftArray.length);
        System.arraycopy(inputArray, leftArray.length, rightArray, 0, rightArray.length);
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, inputArray);
        
        return inputArray;
    }
    /**
     * metodo mergeSort
     * @param leftArray numero izquierdo
     * @param rightArray numero derecho
     * @param sortedArray array de numeros aleatorios
     */
    public void merge(Integer[] leftArray, Integer[] rightArray, Integer[] sortedArray) {
        Integer leftArrayLength = leftArray.length;
        Integer rightArrayLength = rightArray.length;
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < leftArrayLength && j < rightArrayLength) {
            if(leftArray[i] < rightArray[j]) {
               sortedArray[k] = leftArray[i];
               i++;
            } else {
              sortedArray[k] = rightArray[j];
              j++;
            }
            k++;
          }
          //copy the rest of the first half if there is anything left
          while(i < leftArrayLength) {
            sortedArray[k] = leftArray[i];
            i++;
            k++;
          }
          //copy the rest of the second half if there is anything left
          while(j < rightArrayLength) {
            sortedArray[k] = rightArray[j];
            j++;
            k++;
          }
        }
    
    //ALGORITMO RADIX SORT OBTENIDO DE:
    //https://rosettacode.org/wiki/Sorting_algorithms/Radix_sort
    /**
     * metodo radixsort
     * @param old cadena de numeros aleatorios
     * @return cadena de numeros aleatorios ordenados
     */
    public Integer[] radixSort(Integer[] old) {
    // Loop for every bit in the integers
    for (int shift = Integer.SIZE - 1; shift > -1; shift--) {
        // The array to put the partially sorted array into
        Integer[] tmp = new Integer[old.length];
        // The number of 0s
        int j = 0;
 
        // Move the 0s to the new array, and the 1s to the old one
        for (int i = 0; i < old.length; i++) {
            // If there is a 1 in the bit we are testing, the number will be negative
            boolean move = old[i] << shift >= 0;
 
            // If this is the last bit, negative numbers are actually lower
            if (shift == 0 ? !move : move) {
                tmp[j] = old[i];
                j++;
            } else {
                // It's a 1, so stick it in the old array for now
                old[i - j] = old[i];
            }
        }
        // Copy over the 1s from the old array
        for (int i = j; i < tmp.length; i++) {
            tmp[i] = old[i - j];
        }
        // And now the tmp array gets switched for another round of sorting
        old = tmp;
    }
 
    return old;
}
 
    //ALGORITMO INSERTION SORT OBTENIDO DE:
    //https://www.javatpoint.com/insertion-sort-in-java
    /**
     * metodo insertionsort
     * @param array array de numeros aleatorios
     * @return array de numeros aleatorios ordenados
     */
        public Integer[] insertionSort(Integer array[]) {  
        Integer n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;             
        }  
        return array;
       }
}