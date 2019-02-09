package hdt3.sorts;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.PrintWriter;

public class GenerateRandom 
{

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    ArrayList<Integer> rndNum= new ArrayList<Integer>();

    public void Random(int n) 
    {   
        for (int i = 0; i < n; i++) 
        {
            int number = rand.nextInt(3000 + 1);
            rndNum.add(number);
        }

        String yup = rndNum.toString();

        String fileName = "RND.txt";
        
        try 
        {
            PrintWriter outputStream = new PrintWriter(fileName);
            outputStream.println(yup);
            outputStream.close();
            System.out.println("Listo");
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
