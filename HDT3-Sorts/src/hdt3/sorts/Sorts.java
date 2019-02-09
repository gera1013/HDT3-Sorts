
package hdt3.sorts;

import java.util.Arrays;

/**
 *
 * @author Gerardo
 */
public class Sorts 
{
    /**
     * @param arr, un array de tipo comparable, que es el objeto que se va a ordenar 
     * @param n, tamaño del array que se ingresa como parametro 
     */
    static void gnomeSort(Comparable arr[], Comparable n) 
    { 
        Comparable l = 0;
        int index = 0; 
  
        while (n.compareTo(index) == 1) 
        { 
            if (l.compareTo(index) == 0) 
                index++; 
            if (arr[index].compareTo(arr[index - 1]) == 1 || arr[index].compareTo(arr[index - 1]) == 0) 
                index++; 
            else 
            { 
                Comparable temp = 0; 
                temp = arr[index]; 
                arr[index] = arr[index - 1]; 
                arr[index - 1] = temp; 
                index--; 
            } 
        } 
    }
    
    /**
     * 
     * @param arr un array de tipo comparable, que es el objeto que se va a ordenar 
     * @param l indice minimo 
     * @param m punto medio
     * @param r indice maximo 
     */
    void merge(Comparable arr[], int l, int m, int r) 
    { 
        // Tamaño de los dos sub arreglos
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        // Arreglos temporales
        Comparable L[] = new Comparable [n1]; 
        Comparable R[] = new Comparable [n2]; 
  
        // Copiar informacion a los arreglos temporales 
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Unir los arreglos temporales */
  
        // Indice inicial de los sub arreglos
        int i = 0, j = 0; 
  
        // Indice inicial del arreglo 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i].compareTo(R[j]) == 0 || L[i].compareTo(R[j]) == -1) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        // Se copia el elemento sobrante de L[]
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        // Se copia el elemento sobrante de R[]
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    /**
     * 
     * @param arr, un array de tipo comparable, que es el objeto que se va a ordenar 
     * @param l siempre tiene valor 0, representa el indice mas pequeño
     * @param r largo del array - 1
     */
    void mergeSort(Comparable arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Se encuentra el punto intermedio 
            int m = (l+r)/2; 
  
            //Se ordenan ambas mitades
            mergeSort(arr, l, m); 
            mergeSort(arr , m+1, r); 
  
            // Union de ambas mitades  
            merge(arr, l, m, r); 
        } 
    }
    
    /**
     * 
     * @param arr un array de tipo comparable, que es el objeto que se va a ordenar 
     * @param low indice mas pequeño 
     * @param high indice mas grande 
     * @return indice numerico 
     */
    
    int partition(Comparable arr[], int low, int high) 
    { 
        Comparable pivot = arr[high];  
        int i = (low-1); // Indice del elemento mas bajo 
        for (int j=low; j<high; j++) 
        { 
            // Si el elemento actual es menor que el pivote 
            if (arr[j].compareTo(pivot) == 0 || arr[j].compareTo(pivot) == -1) 
            { 
                i++; 
  
                // Se cambia arr[i] con arr[j] 
                Comparable temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // Se cambian arr[i+1] con arr[high]
        Comparable temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
  
    /**
     * @param arr un array de tipo comparable, que es el objeto que se va a ordenar 
     * @param low indice inicial 
     * @param high inidice final
     */
    void quickSort(Comparable arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            //Se parte el indice
            int pi = partition(arr, low, high); 
  
            // Ordenamiento antes y despues de la particion 
            quickSort(arr, low, pi-1); 
            quickSort(arr, pi+1, high); 
        } 
    }
    
    /**
     * @param arr un array de tipo comparable, que es el objeto que se va a ordenar 
     * @param n largo del array introducido
     * @return indice numerico 
     */
    static int getMax(int arr[], int n) 
    { 
        int mx = arr[0]; 
        for (int i = 1; i < n; i++) 
            if (arr[i] > mx) 
                mx = arr[i]; 
        return mx; 
    } 
  
    /**
     * 
     * @param arr un array de tipo comparable, que es el objeto que se va a ordenar 
     * @param n largo del array 
     * @param exp indice numerico 
     */
    static void countSort(int arr[], int n, int exp) 
    { 
        int output[] = new int[n]; // output array 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count,0); 
  
        // Almacena la cantidad de ocurrencias 
        for (i = 0; i < n; i++) 
            count[ (arr[i]/exp)%10 ]++; 
  
        // Se hace que count[i] tenga ahora la verdadera 
        // posicion 
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
  
        // Construccion del array output
        for (i = n - 1; i >= 0; i--) 
        { 
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
            count[ (arr[i]/exp)%10 ]--; 
        } 
  
        // Se copia el array de output al array inicial 
        // asi este ya tiene los elementos ordenados
        for (i = 0; i < n; i++) 
            arr[i] = output[i]; 
    } 
  
    /**
     * 
     * @param arr array de tipo int
     * @param n largo del array 
     */
    static void radixSort(int arr[], int n) 
    { 
        // El numero maximo dentro del array 
        int m = getMax(arr, n); 
  
        // Ordenamiento por medio de conteo 
        for (int exp = 1; m/exp > 0; exp *= 10) 
            countSort(arr, n, exp); 
    } 
    
    /**
     * 
     * @param arr array que se va a imprimir 
     */
    public static void printArray(Comparable arr[]) 
    {
        for (Comparable arr1 : arr) 
        {
            System.out.println(arr1);
        }
    }
    
}
