/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt3.sorts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class HDT3Sorts {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException 
    {
        ArrayList<String> array = new ArrayList<>();
        Scanner read = new Scanner(new File("doc.txt"));
        read.useDelimiter(" ");
        String data;
        
        while(read.hasNext())
        {
            data = read.next();
            array.add(data);
        }
        
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
        //Sorts.radixSort(numeros, numeros.length);
    }
    
}
