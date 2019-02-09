
package hdt3.sorts;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class HDT3Sorts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Sorts sorting = new Sorts();
        int numerosGenerados = 0;
        
        try
        {
            while(numerosGenerados < 10 || numerosGenerados > 3000)
            {
                System.out.println("Ingrese la cantidad de numeros que desea ordenar");
                numerosGenerados = scan.nextInt();
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("Por favor reinice el programa e ingrese un numero");
        }
        
        Comparable  numeros[];
        numeros = new Comparable [numerosGenerados];
        
        for(int i = 0; i < numerosGenerados; i++)
        {
            Random rand = new Random();
            numeros[i] = rand.nextInt(numerosGenerados);
        }
        
        int dec = 0;
        
        try
        {
            while(dec < 1 || dec > 4)
            {
                System.out.println("Ingrese el numero del metodo de sorting que desea utilizar");
                System.out.println("1. Gnome Sort");
                System.out.println("2. Merge Sort");
                System.out.println("3. Quick Sort");
                System.out.println("4. Radix Sort");
                dec = scan.nextInt();
            }
            
        }
        catch(InputMismatchException e)
        {
            System.out.println("Por favor reinice el programa e ingrese un numero");
        }
        
        switch(dec)
        {
            case 1:
                Sorts.gnomeSort(numeros, numeros.length);
            break;
            
            case 2:
                sorting.mergeSort(numeros, 0, numeros.length-1);
            break;
            
            case 3:
                sorting.quickSort(numeros, 0, numeros.length-1);
            break;
            
            case 4:
                int[] arrr = new int[numerosGenerados];
                Sorts.radixSort(arrr, arrr.length);
            break;
        }
        
        Sorts.printArray(numeros);
    }
}
