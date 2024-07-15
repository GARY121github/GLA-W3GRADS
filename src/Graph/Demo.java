package Graph;

public class Demo {
    public static void main(String[] args) {
        Graph graph = new Graph(7);
//        graph.addEdge(1 , 2);
//        graph.addEdge(1 , 5);
//        graph.addEdge(2 , 3);
//        graph.addEdge(2 , 4);
//        graph.print();
        graph.addEdge(1 , 2);
        graph.addEdge(1 , 4);
        graph.addEdge(2 , 3);
        graph.addEdge(2 , 5);
        graph.addEdge(3 , 4);
        graph.addEdge(5 , 6);
        graph.addEdge(5 , 7);
        graph.addEdge(6 , 7);
//        graph.print();
//        System.out.println(graph.hasPath(1 , 6));
        graph.BFS();
    }
}
