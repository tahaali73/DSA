import java.util.Scanner;
import java.util.Random;
public class PorcolationAPI{

    public static void main(String[] argc){

     Random rand = new Random();
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("inter size of grid: ");
     int N = scanner.nextInt();
     UnionFIND U = new UnionFIND(N);
     
     int min = 0;
     int max = N*N;
     int randNum1 = rand.nextInt((max - min) + 1) + min;
     int randNum2 = rand.nextInt((max - min) + 1) + min;
      
     if(randNum1 != randNum2){
        U.Union(randNum1,randNum2);
     }

    }
}