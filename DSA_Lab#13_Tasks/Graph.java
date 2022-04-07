public class Graph {
	int size;
	Node vertices;
	boolean[][] a;
	public Graph(Node args,int size) {
		this.size=size;
		vertices=copy(args);
		a=new boolean[size][size];
	}
	public Node copy(Node src) {
		Node dest=new Node(src.data);
		Node copy=dest;
		for(Node i=src.next;i.data!=null;i=i.next) {
			dest.next=new Node(i.data);
			dest=dest.next;
		}
		return copy;
	}
	public void add(String v,String w) {
		int i=pos(v);
		int j=pos(w);
		a[i][j]=a[j][i]=true;
	}
	private int pos(String s) {
		int count=0;
		for(Node i=this.vertices;i!=null;i=i.next) {
			if(i.data.equals(s))
				return count;
			count++;
		}
		return a.length;
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
//				if(a[i][j]==true) {
//					str+=("Vertex: "+i+"==>"+j+"\n");
//				}
//			}
//		}
//		return str;
	}
	public int findIndex(String data) {
		int count=0;
		for(Node i=this.vertices;i.data!=null;i=i.next) {
			if(i.data.equals(data)) {
				return count;
			}
			count++;
		}
		return -1;
	}
	public String getVertice(int i) {
		int count=0;
		for(Node j=this.vertices;j!=null;j=j.next) {
			if(count==i) {
				return j.data;
			}
			count++;
		}
		return null;
	}
	private String vertex(int i) {
		// TODO Auto-generated method stub
		StringBuffer buf=new StringBuffer(getVertice(i)+": ");
		for(Node j=this.vertices;j!=null;j=j.next) {
			try {
				// Last element in linkedlist is null
				// So, its throwing exception.
				// Didnt have suitable way to handle that situation
				// Anyother changes in this code except exception handling would be appreciated
			int index=this.findIndex(j.data);
			if(a[i][index]) {
				buf.append(j.data);
			}
			}
			catch(Exception e) {
				
			}
		}
		return buf+"";
	}
//	public static void dijkstra(int[][] graph, int source) {
//		System.out.println("!!!!!Dijktra`s Algorithm!!!!!");
//	    int count = graph.length;
//	    boolean[] visitedVertex = new boolean[count];
//	    int[] distance = new int[count];
//	    for (int i = 0; i < count; i++) {
//	      visitedVertex[i] = false;
//	      distance[i] = Integer.MAX_VALUE;
//	    }
//
//	    // Distance of self loop is zero
//	    distance[source] = 0;
//	    for (int i = 0; i < count; i++) {
//
//	      // Update the distance between neighbouring vertex and source vertex
//	      int u = findMinDistance(distance, visitedVertex);
//	      visitedVertex[u] = true;
//
//	      // Update all the neighbouring vertex distances
//	      for (int v = 0; v < count; v++) {
//	        if (!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])) {
//	          distance[v] = distance[u] + graph[u][v];
//	        }
//	      }
//	    }
//	    for (int i = 0; i < distance.length; i++) {
//	      System.out.println(String.format("Distance from %s to %s is %s", source, i, distance[i]));
//	    }
//
//	  }
//
//	  // Finding the minimum distance
//	  private static int findMinDistance(int[] distance, boolean[] visitedVertex) {
//	    int minDistance = Integer.MAX_VALUE;
//	    int minDistanceVertex = -1;
//	    for (int i = 0; i < distance.length; i++) {
//	      if (!visitedVertex[i] && distance[i] < minDistance) {
//	        minDistance = distance[i];
//	        minDistanceVertex = i;
//	      }
//	    }
//	    return minDistanceVertex;
//	  }
	public static void main(String[] args) {
//		String[] arg= {"A","B","C","D","E"};
		Node arg=new Node("A",new Node("B",new Node("C",new Node("D",new Node("E")))));
//		Node copy=arg;
//		arg.setData("A");
//		arg.next.setData("B");
//		arg.next.next.setData("C");
//		arg.next.next.next.setData("D");
//		arg.next.next.next.next.setData("E");
		Graph graph=new Graph(arg,5);
		graph.add("A" , "B");
		graph.add("A" , "C");
		graph.add("B" , "C");
		graph.add("B" , "D");
		graph.add("C" , "D");
		graph.add("D" , "E");
//		 int graf[][] = new int[][] { { 0, 0, 1, 2, 0, 0, 0 }, { 0, 0, 2, 0, 0, 3, 0 }, { 1, 2, 0, 1, 3, 0, 0 },
//		        { 2, 0, 1, 0, 0, 0, 1 }, { 0, 0, 3, 0, 0, 2, 0 }, { 0, 3, 0, 0, 2, 0, 1 }, { 0, 0, 0, 1, 0, 1, 0 } };
//		Graph.dijkstra(graf,0);
		
		System.out.println(graph);
	}
}