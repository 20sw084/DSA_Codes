public class Graph1 {
    int size;
    String[] vertices;
    boolean a[][];
    public Graph1(String [] args){
        size=args.length;
        vertices =new String [size];
        System.arraycopy(args,0,vertices,0,size);
        a=new boolean[size][size];
    }
    public void add(String v,String w){
        int i=index(v);
        int j=index(w);
        a[i][j]=a[j][i]=true;

    }
    private int index(String v){
        for(int i=0;i<size;i++){
            if(vertices[i].equals(v))
                return i;
        }
        return a.length;
    }
    public String toString(){
        if(size==0) return "{}";
        StringBuffer buf=new StringBuffer("{"+vertex(0));
        for(int i=1;i<size;i++)
            buf.append(","+vertex(i));
        return buf+"}";
    }
    private String vertex(int i){
        StringBuffer buf =new StringBuffer(vertices[i]+":");
        for(int j=0;j<size;j++)
            if(a[i][j])buf.append(vertices[j]);
            return buf+"";

    }

    public static void main(String[] args) {
        String[] arg= {"A","B","C","D","E"};
        Graph1 graph=new Graph(arg);
        graph.add("A" , "B");
        graph.add("A" , "C");
        graph.add("B" , "C");
        graph.add("B" , "D");
        graph.add("C" , "D");
        graph.add("D" , "E");
             
        System.out.println(graph);
    }
}
