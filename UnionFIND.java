public class UnionFIND{

    private int[] id;
    private int[] sz;
    
    public UnionFIND(int N){
        int grid = N*N;
        id = new int[grid];
        sz = new int[grid];
        for(int i=0; i<grid; i++){
            id[i] = i;
            sz[i] = i;
        }
    }

    private int root(int a){
        while(a != id[a]){
            id[a] = id[id[a]];
            a = id[a];
        }
        return a;
    }

    public boolean connected(int a, int b){
        return root(a) == root(b);
    }

    public void Union(int a, int b){
        int p = root(a);
        int q = root(b);
        if(p==q) return;
        if(sz[p] < sz[q]){id[p] = q; sz[q] += sz[p];}
        else{id[q] = p; sz[p] += sz[q];}
    }
}