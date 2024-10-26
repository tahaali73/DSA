import java.util.Scanner;
public class unionFind_problem1{
    public static void main(String[] argc){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = scanner.nextInt();
        UnionF UF = new UnionF(N);
        System.out.println("Enter no of edges: ");
        int edges = scanner.nextInt();
        System.out.println("Enter pair of Edges: ");
        while (edges>0) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            UF.Union(i, j);
            edges--;
        }
        System.out.println("Enter node a: ");
        int a = scanner.nextInt();
        System.out.println("Enter node b: ");
        int b = scanner.nextInt();
        System.out.println( "Output: " + UF.connected(a, b));
    }
}