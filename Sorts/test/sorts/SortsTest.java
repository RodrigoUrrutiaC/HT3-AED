/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorts;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Natito
 */
public class SortsTest {
    
    public SortsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of quickSort method, of class Sorts.
     */
    @Test
    public void testQuickSort() {
        System.out.println("quickSort");
        Integer[] cadena = null;
        Integer izquierda = null;
        Integer derecha = null;
        Sorts instance = new Sorts();
        Integer[] expResult = null;
        Integer[] result = instance.quickSort(cadena, izquierda, derecha);
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of gnomeSort method, of class Sorts.
     */
    @Test
    public void testGnomeSort() {
        System.out.println("gnomeSort");
        Integer[] nums = {3,2,1};
        Sorts instance = new Sorts();
        Integer[] expResult = {1,2,3};
        Integer[] result = instance.gnomeSort(nums);
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of mergeSort method, of class Sorts.
     */
    @Test
    public void testMergeSort() {
        System.out.println("mergeSort");
        Integer[] inputArray = {3,2,1};
        Sorts instance = new Sorts();
        Integer[] expResult = {1,2,3};
        Integer[] result = instance.mergeSort(inputArray);
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of merge method, of class Sorts.
     */
    @Test
    public void testMerge() {
        System.out.println("merge");
        Integer[] leftArray = null;
        Integer[] rightArray = null;
        Integer[] sortedArray = null;
        Sorts instance = new Sorts();
        instance.merge(leftArray, rightArray, sortedArray);

    }

    /**
     * Test of radixSort method, of class Sorts.
     */
    @Test
    public void testRadixSort() {
        System.out.println("radixSort");
        Integer[] old = {3,2,1};
        Sorts instance = new Sorts();
        Integer[] expResult = {1,2,3};
        Integer[] result = instance.radixSort(old);
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of insertionSort method, of class Sorts.
     */
    @Test
    public void testInsertionSort() {
        System.out.println("insertionSort");
        Integer[] array = {3,2,1};
        Sorts instance = new Sorts();
        Integer[] expResult = {1,2,3};
        Integer[] result = instance.insertionSort(array);
        assertArrayEquals(expResult, result);

    }
    
}
