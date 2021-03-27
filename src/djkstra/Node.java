package djkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node {

    private int nodeName;
    private List<Integer> connectedNode;
    private List<Integer> connectedNodeCost;
    private int cost;
    private boolean isVisited;

    public Node(int nodeName,
                String connectedNode,
                String connectedNodeCost) {

        this.nodeName = nodeName;
        List<Integer> listInt = new ArrayList<>();
        List<String> listStr = new ArrayList<>();
        if(connectedNode != null && !connectedNode.equalsIgnoreCase("")){
            listStr = Arrays.asList(connectedNode.split(","));
            for(String str : listStr){
                listInt.add(Integer.parseInt(str));
            }
            this.connectedNode = listInt;
        }

        if(connectedNodeCost != null && ! connectedNodeCost.equalsIgnoreCase("")){
            listStr = Arrays.asList(connectedNodeCost.split(","));
            listInt = new ArrayList<>();
            for(String str : listStr){
                listInt.add(Integer.parseInt(str));
            }
            this.connectedNodeCost = listInt;
        }
        this.cost = Integer.MAX_VALUE;
        this.isVisited = false;
    }

    public int getNodeName() {
        return nodeName;
    }

    public void setNodeName(int nodeName) {
        this.nodeName = nodeName;
    }

    public List<Integer> getConnectedNode() {
        return connectedNode;
    }

    public void setConnectedNode(List<Integer> connectedNode) {
        this.connectedNode = connectedNode;
    }

    public List<Integer> getConnectedNodeCost() {
        return connectedNodeCost;
    }

    public void setConnectedNodeCost(List<Integer> connectedNodeCost) {
        this.connectedNodeCost = connectedNodeCost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }
}
