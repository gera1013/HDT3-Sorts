
package hdt3.sorts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class HDT3Sorts 
{

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Integer> rndNum= new ArrayList<Integer>();
        
        int Num = 0;
                
        while(Num < 10 || Num > 3000) 
        {
            System.out.println("Ingrese la cantidad de datos al que le desea hacer sort. ");
            Num = scan.nextInt();
        }
        int cNum = Num;
        for (int i = 0; i < cNum; i++) {
            int number = rand.nextInt(3000 + 1);
            rndNum.add(number);
        }

        String yup = rndNum.toString();

        String fileName = "RND.txt";
        try {
            PrintWriter outputStream = new PrintWriter(fileName);
            outputStream.println(yup);
            outputStream.close();
            System.out.println("Listo");
        }

        catch(FileNotFoundException e){
            e.printStackTrace();
        }

        Comparable numeros[] = new Comparable[Num];
        Scanner read = new Scanner(new File("RND.txt"));
        read.useDelimiter(",");
        String data;
        
        for(int i = 0; i < Num ; i++)
        {
            data = read.next();
            numeros[i] = data;
        }
        
        Sorts sorting = new Sorts();        
        
        Sorts.printArray(numeros);
        Sorts.gnomeSort(numeros, numeros.length);
        sorting.mergeSort(numeros, 0, numeros.length-1);
        sorting.quickSort(numeros, 0, numeros.length-1);
        //Sorts.radixSort(numeros, numeros.length);
        Sorts.printArray(numeros);
    }
    
}
