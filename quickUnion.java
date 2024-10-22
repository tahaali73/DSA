public class quickUnion{
    private int[] id;

    public quickUnion(int N){
        id = new int[N];
        for(int i=0; i<N; i++ ){
            id[i] = i;
        }
    }

    public int root(int a){
        while(a != id[a]) a = id[a];
        return a;
    }

    public boolean connected(int a, int b){
        return root(a) == root(b);
    }

    public void Union(int a, int b){
        int p = id[a];
        int q = id[b];
        id[p] = q;
    }
}