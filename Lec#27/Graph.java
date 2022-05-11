public class Graph {
	int size;
	String[] vertices;
	boolean[][] adj_matrix;
	public Graph(String[] args) {
		size=args.length;
		vertices=new String[size];
		System.arraycopy(args, 0, vertices, 0, size);
		adj_matrix=new boolean[size][args.length];
	}
	public void add(String v,String w) {
		int i=index(v);
		int j=index(w);
		adj_matrix[i][j]=adj_matrix[j][i]=true;
	}
	private int index(String s) {
		for(int i=0;i<size;i++) {
			if(vertices[i].equals(s))
				return i;
		}
		return adj_matrix.length;
	}
	public String toString() {

		//		 Implementation 1
		
		if(size==0) {
			return "{}";
		}
		StringBuffer buf=new StringBuffer("{"+vertex(0));
		for(int i=1;i<size;i++) {
			buf.append(","+vertex(i));
		}
		return buf+"}";
		
		//		Implementation 2
		
//		String str="Contents of Graph is:\n";
//		for(int i=0;i<vertices.length;i++) {
//			for(int j=0;j<vertices.length;j++) {
//				if(adj_matrix[i][j]) {
//					str+=("Vertex: "+i+"==>"+j+"\n");
//				}
//			}
//		}
//		return str;
	}
	private String vertex(int i) {
		// TODO Auto-generated method stub
		StringBuffer buf=new StringBuffer(vertices[i]+": ");
		for(int j=0;j<size;j++) {
			if(adj_matrix[i][j]) {
				buf.append(vertices[j]);
			}
		}
		return buf+"";
	}
	public static void dijkstra(int[][] graph, int source) {
		System.out.println("!!!!!Dijktra`s Algorithm!!!!!");
	    int count = graph.length;
	    boolean[] visitedVertex = new boolean[count];
	    int[] distance = new int[count];
	    for (int i = 0; i < count; i++) {
	      visitedVertex[i] = false;
	      distance[i] = Integer.MAX_VALUE;
	    }

	    // Distance of self loop is zero
	    distance[source] = 0;
	    for (int i = 0; i < count; i++) {

	      // Update the distance between neighbouring vertex and source vertex
	      int u = findMinDistance(distance, visitedVertex);
	      visitedVertex[u] = true;

	      // Update all the neighbouring vertex distances
	      for (int v = 0; v < count; v++) {
	        if (!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])) {
	          distance[v] = distance[u] + graph[u][v];
	        }
	      }
	    }
	    for (int i = 0; i < distance.length; i++) {
	      System.out.println(String.format("Distance from %s to %s is %s", source, i, distance[i]));
	    }

	  }

	  // Finding the minimum distance
	  private static int findMinDistance(int[] distance, boolean[] visitedVertex) {
	    int minDistance = Integer.MAX_VALUE;
	    int minDistanceVertex = -1;
	    for (int i = 0; i < distance.length; i++) {
	      if (!visitedVertex[i] && distance[i] < minDistance) {
	        minDistance = distance[i];
	        minDistanceVertex = i;
	      }
	    }
	    return minDistanceVertex;
	  }
	public static void main(String[] args) {
		String[] arg= {"A","B","C","D","E"};
		Graph graph=new Graph(arg);
		graph.add("A" , "B");
		graph.add("A" , "C");
		graph.add("B" , "C");
		graph.add("B" , "D");
		graph.add("C" , "D");
		graph.add("D" , "E");
		System.out.println(graph.vertex(2));
		 int graf[][] = new int[][] { { 0, 0, 1, 2, 0, 0, 0 }, { 0, 0, 2, 0, 0, 3, 0 }, { 1, 2, 0, 1, 3, 0, 0 },
		        { 2, 0, 1, 0, 0, 0, 1 }, { 0, 0, 3, 0, 0, 2, 0 }, { 0, 3, 0, 0, 2, 0, 1 }, { 0, 0, 0, 1, 0, 1, 0 } };
		Graph.dijkstra(graf,0);
		
		System.out.println(graph);
	}
}
