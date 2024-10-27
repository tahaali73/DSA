public class UnionF{
    private int[] id;
    private int[] sz;
    private int count;

    public UnionF(int N){
        id= new int[N];
        sz= new int[N];
        count = N;
        for(int i=0; i < N; i++){
            id[i] = i;
            sz[i] = 1;
        }
    }

    private int root(int a){
        while(a != id[a]) 
        {
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
        if( p == q) return;
        if(sz[p] < sz[q]){
            id[p] = q;
            sz[q] += sz[p];
        }else{
            id[q] = p;
            sz[p] += sz[q]; 
        }
        count --;
    }
    public int count(){
        return count;
    }
}