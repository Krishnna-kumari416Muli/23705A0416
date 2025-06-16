import java .util.HashSet;
 public class App{
    public static void main(String[] args){
    HashSet<Integer> graph ;


        Graph graph = new Graph(3);
        graph.addEdge(0,1);
        graph.addEdge(1,0);
        graph.addEdge(0,2);
        graph.addEdge(2,0);
        graph.addEdge(0,3);
        graph.addEdge(3,0);
        graph.removeEdge(0,2);
        graph.printGraph();
        
    }
}
class Edge{
    int src;
    int dest;
    int weight;
    Edge(int src,int dest,int weight){
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
    Edge(itn src,int dest){
        this.src = src;
        this.dest = dest;
        this.weight = 1;
    }
    class Graph{
        HashSet < Edge > graph;
        int vertices;
        boolean isDirected;
        Graph(int Vertices,boolean isDIrected){
            this.Vertices = Vertices;
            this. isDirected = isDirected;
            graph = new HashSet<Edge>();
            
        }
    public void addEdge(int src,int dest){
            if(isValid(src,dest)){
                Edge e = new Edge(src,dest);
                graph.add(e);
                if(!isDirected){
                    Edge e2 = new Edge(dest,src);
                    graph.add(e2);
                    
                }
                else{
                    System.out.println("inavalid soruce and destination");
                }
    }
    public void addEdge(int src,int dest,int weight){
                if(isVaild(src,dest)){
                    Edge e = new Edge(src,dest,weight);
                    graph.add(e);
                    if(!isDircted){
                        var e2 = new Edge(src,dest,weight);
                        graph.add(e2);
                    }
                
                    }else{
                       System.out.println("invalid source and destination");
                }
    }
    public void removeEdge(int src,int dest){
            if(isValid(src,dest)){
                 Edge e = new Edge(src,dest);
                graph.remove(e);
                if(!isDirected){
                    Edge e2 = new Edge(dest,src);
                    graph.remove(e2);
                    
                }
                else{
                    System.out.println("inavalid soruce and destination");
                }
    }
    public void removeEdge(int src,int dest,int weight){
                if(isVaild(src,dest)){
                    Edge e = new Edge(src,dest,weight);
                    graph.remove(e);
                    if(!isDircted){
                        var e2 = new Edge(src,dest,weight);
                        graph.remove(e2);
                    }
                
                    }else{
                       System.out.println("invalid source and destination");
                     }
                
                }
    }
    public boolean isValid(int src,int dest){
            return src>= 0 && dest >= 0 && src <= Vertices && dest <= Vertices && src != dest;
    }
    void printGraph(){
            for(int i = 0; i< Vertices; i++){
                System.out.println(i + " ");
            }
    }
    
}