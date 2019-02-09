import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class GenerateRandom {

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    ArrayList<Integer> rndNum= new ArrayList<Integer>();

    public void Random() {
      System.out.println("Ingrese la cantidad de datos al que le desea hacer sort. ");
      int Num = scan.nextInt();
      int cNum = Num;
      if (cNum > 10 && cNum <3001) {
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
            System.out.println("Done");
          }

          catch(Exception e){
            e.printStackTrace();
          }
      }

      else {
        System.out.println("Ingrese un numero entre 10 y 3000");
      }
    }
}
