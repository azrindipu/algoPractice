package djkstra;

import java.util.*;

public class Graph {

    private List<Node> nodes = new ArrayList<>();
    private List<Boolean> visitedList = new ArrayList<>();
    private List<Integer> allNodes = new ArrayList<>();
    private Map<Integer, Integer> dijkstraMap = new HashMap<>();

    public void createTheGraph(){
        nodes.add(new Node(0, "1,4", "4,8"));
        nodes.add(new Node(1, "0,2,4", "4,8,11"));
        nodes.add(new Node(4, "0,1,8,5", "8,11,7,1"));
        nodes.add(new Node(2, "1,8,6,3", "8,2,4,7"));
        nodes.add(new Node(8, "2,4,5", "2,7,6"));
        nodes.add(new Node(5, "4,8,6", "1,6,2"));
        nodes.add(new Node(3, "2,6,7", "7,14,9"));
        nodes.add(new Node(6, "5,3,7", "2,14,10"));
        nodes.add(new Node(7, "", ""));
    }

    public void run(int src){
        List<Node> minNodeList = new ArrayList<>();
        Node srcNode = this.getSrcNode(src);
        if(srcNode != null){
            minNodeList.add(srcNode);
        }
        while (true){
            if(minNodeList.isEmpty()){
                break;
            }
            Node minNode = this.getminNode(minNodeList);
            minNode.setVisited(true);
            for(int i = 0; i< minNode.getConnectedNode().size(); i++){
                Node node = this.getByName(minNode.getConnectedNode().get(i));
                if(node != null && !node.isVisited()){
                    if(minNode.getCost() + minNode.getConnectedNodeCost().get(i) < node.getCost()){
                        node.setCost(minNode.getCost() + minNode.getConnectedNodeCost().get(i));
                        minNodeList.add(node);
                    }
                }
            }
        }
    }

    public void printResult(){
        for(Node node : nodes){
            System.out.println("Node name: "+node.getNodeName()+" Cost : "+node.getCost());
        }
    }

    public Node getminNode(List<Node> nodes){
        int minValu = Integer.MAX_VALUE;
        Node minNode = null;
        if(nodes != null && !nodes.isEmpty()){
            for(Node node : nodes){
                if(node.getCost() < minValu){
                    minNode = node;
                }
            }
        }
        if(minNode != null){
            nodes.remove(minNode);
            return minNode;
        }
        return null;
    }

    public Node getSrcNode(int src){
        for(int i =0; i<nodes.size(); i++){
            if(nodes.get(i).getNodeName() == src){
                nodes.get(i).setCost(0);
                return nodes.get(i);
            }
        }
        return null;
    }

    public Node getByName(int nodeName){
        for(Node node : nodes){
            if(node.getNodeName() == nodeName){
                return node;
            }
        }
        return null;
    }
}
