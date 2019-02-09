
package hdt3.sorts;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gerardo
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
     * Test of gnomeSort method, of class Sorts.
     */
    @Test
    public void testGnomeSort() {
        System.out.println("gnomeSort");
        Comparable[] arr = new Comparable[]{1,1,2,3,4,5,6,7,8,9};
        Comparable[] arr2 = new Comparable[]{9,7,6,3,4,2,5,8,1,1};
        int n = arr2.length;
        Sorts.gnomeSort(arr2, n);
        int c = 0;
        for(int i = 0; i < 10; i++){
            if(arr[i] == arr2[i]){
                c = c + 0;
            }
            else if(arr[i] != arr2[i]){
                c = c + 1;
            }
        }
        assertEquals(c, 0);
    }

    /**
     * Test of mergeSort method, of class Sorts.
     */
    @Test
    public void testMergeSort() {
        System.out.println("mergeSort");
        Comparable[] arr = new Comparable[]{1,1,2,3,4,5,6,7,8,9};
        Comparable[] arr2 = new Comparable[]{9,7,6,3,4,2,5,8,1,1};
        int n = arr2.length;
        Sorts sort = new Sorts();
        sort.mergeSort(arr2, 0, n-1);
        int c = 0;
        for(int i = 0; i < 10; i++){
            if(arr[i] == arr2[i]){
                c = c + 0;
            }
            else if(arr[i] != arr2[i]){
                c = c + 1;
            }
        }
        assertEquals(c, 0);
    }

    /**
     * Test of quickSort method, of class Sorts.
     */
    @Test
    public void testQuickSort() {
        System.out.println("quickSort");
        Comparable[] arr = new Comparable[]{1,1,2,3,4,5,6,7,8,9};
        Comparable[] arr2 = new Comparable[]{9,7,6,3,4,2,5,8,1,1};
        int n = arr2.length;
        Sorts sort = new Sorts();
        sort.quickSort(arr2, 0, n-1);
        int c = 0;
        for(int i = 0; i < 10; i++){
            if(arr[i] == arr2[i]){
                c = c + 0;
            }
            else if(arr[i] != arr2[i]){
                c = c + 1;
            }
        }
        assertEquals(c, 0);
    }

    /**
     * Test of radixSort method, of class Sorts.
     */
    @Test
    public void testRadixSort() {
        System.out.println("radixSort");
        int[] arr = new int[]{1,1,2,3,4,5,6,7,8,9};
        int[] arr2 = new int[]{9,7,6,3,4,2,5,8,1,1};
        int n = arr2.length;
        Sorts.radixSort(arr2, n);
        int c = 0;
        for(int i = 0; i < 10; i++){
            if(arr[i] == arr2[i]){
                c = c + 0;
            }
            else if(arr[i] != arr2[i]){
                c = c + 1;
            }
        }
        assertEquals(c, 0);
    }  
}
