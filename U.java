public class U{
    private int[] id;

    public U(int N){
        id = new int[N];
        for(int i=0; i<N; i++){
            id[i]=i;
        }
    }

    public boolean connected(int a, int b){
        return id[a] == id[b];
    }

    public void Union(int a, int b){
        int i = id[a];
        int j = id[b];

        for(int x=0; x<id.length; x++){
            if(id[x] == i) id[x] = j;
        }
    }
}