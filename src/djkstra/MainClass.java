package djkstra;

public class MainClass {
    public static void main(String[] args){
        Graph graph = new Graph();
        graph.createTheGraph();
        graph.run(0);
        graph.printResult();
    }
}
