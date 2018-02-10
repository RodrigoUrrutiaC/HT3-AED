
package sorts;

import java.util.Random;
import java.io.*;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 09.02.2018
 */

/**
 * Aleatorio
 * Clase qu crea un archivo "cadena.txt" con numero pseuoaleatorios de 0 a 2999
 */
public class Aleatorio implements Comparable{
    
    protected Integer[] cadena;
    public Aleatorio()throws IOException{
        
        int x=3000;
        Random  rnd = new Random();
        cadena = new Integer[x];
        for(int i = 0; i < cadena.length; i++){
            cadena[i] = rnd.nextInt(x*10);
        }
        
        File archivo = new File("cadena.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
        for(int i = 0; i<cadena.length; i++){
            bw.write(cadena[i]+"\n");
        }
    }
    
    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
