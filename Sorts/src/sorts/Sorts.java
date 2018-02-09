
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

    //    ALGORITMO GNOME SORT OBTENIDO DE:
    //    http://professorjava.weebly.com/gnome-sort.html
    
    public static int[] gnomeSort(int[] nums){ //takes unsorted array, returns sorted
    int index=1; //start of search
    int temp;
    while(index<nums.length){ //until the array is fully sorted
      if(nums[index]<nums[index-1]){ //compares nums[index] with nums[index-1]. if smaller, switch.
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
        
    //    ALGORITMO QUICK MERGE OBTENIDO DE:
    //    https://github.com/andreivisan/Algorithms/blob/master/merge_sort/MergeSort.java
    
    
    public int[] divideAndConquer(int[] inputArray) {
    int n = inputArray.length;
    if(n == 1) {
    return inputArray;
    }
    int mid = n/2;
    int[] leftArray = new int[mid];
    int[] rightArray = new int[n - mid];
    System.arraycopy(inputArray, 0, leftArray, 0, leftArray.length);
    System.arraycopy(inputArray, leftArray.length, rightArray, 0, rightArray.length);
    divideAndConquer(leftArray);
    divideAndConquer(rightArray);
    merge(leftArray, rightArray, inputArray);
    return inputArray;
    }

    public void merge(int[] leftArray,
    int[] rightArray,
    int[] sortedArray) {
      int leftArrayLength = leftArray.length;
      int rightArrayLength = rightArray.length;
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
      while(i < leftArrayLength) {
        sortedArray[k] = leftArray[i];
        i++;
        k++;
      }
      while(j < rightArrayLength) {
        sortedArray[k] = rightArray[j];
        j++;
        k++;
      }
    }

    //ALGORITMO RADIX MERGE OBTENIDO DE:
    //https://rosettacode.org/wiki/Sorting_algorithms/Radix_sort
    
    public static int[] radixSort(int[] old) {
    // Loop for every bit in the integers
    for (int shift = Integer.SIZE - 1; shift > -1; shift--) {
        // The array to put the partially sorted array into
        int[] tmp = new int[old.length];
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
 
    //ALGORITMO RADIX MERGE OBTENIDO DE:
    //https://www.javatpoint.com/insertion-sort-in-java
    
        public static int[] insertionSort(int array[]) {  
        int n = array.length;  
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