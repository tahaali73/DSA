import java.util.Scanner;
public class unionFind_problem1{
    public static void main(String[] argc){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        UnionF UF = new UnionF(N);
        int K = scanner.nextInt();
        while (K>0) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            UF.Union(i, j);
            K --;
        }
        System.out.println(UF.count());
    }
}