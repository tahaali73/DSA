public class UNIFind{
    public static void main(String[] args)
    {
     int N = StdIn.readInt();
     U uf = new U(N);
     while (!StdIn.isEmpty())
     {
     int p = StdIn.readInt();
     int q = StdIn.readInt();
     if (!uf.connected(p, q))
     {
     uf.Union(p, q);
     StdOut.println(p + " " + q);
     }
     }
    }
}