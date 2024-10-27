import java.util.Scanner;
public class unionFind_problem2{
    public static void main(String[] argc){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N: ");
        int N = scanner.nextInt();
        UnionF UF = new UnionF(N);

        System.out.println("Enter M: ");
        int M = scanner.nextInt();

        boolean fool = true;
        int x = 0;

        System.out.println("Enter members freindship: ");
        while (M>0) {
            int timestamp = scanner.nextInt();
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            UF.Union(u, v);
            if(UF.count()==1 && fool){
                x = timestamp;
                fool = false;
             }
             M--;
            }

        if(x==0)
        System.out.println("not all member are connected");
        else System.out.println(x);
    }
}