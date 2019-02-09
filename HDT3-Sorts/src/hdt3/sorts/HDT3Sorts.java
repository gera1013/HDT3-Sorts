/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt3.sorts;

import java.util.Random;

/**
 *
 * @author Gerardo
 */
public class HDT3Sorts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sorts sorting = new Sorts();
        int numerosGenerados = 3000;
        int  numeros[];
        numeros = new int [numerosGenerados];
        
        for(int i = 0; i < numerosGenerados; i++)
        {
            Random rand = new Random();
            numeros[i] = rand.nextInt(numerosGenerados);
        }
        
        //Sorts.gnomeSort(numeros, numeros.length);
        //sorting.mergeSort(numeros, 0, numeros.length-1);
        //sorting.quickSort(numeros, 0, numeros.length-1);
        Sorts.radixSort(numeros, numeros.length);
    }
    
}
