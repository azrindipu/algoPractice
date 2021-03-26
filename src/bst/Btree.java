package bst;

public class Btree {

    private Node createNewNode(int data){
        return new Node(data);
    }

    public Node insertItem(Node root, int data){
        if(root == null){
            return this.createNewNode(data);
        }
        if(data > root.getData()){
            root.setRightNode(this.insertItem(root.getRightNode(), data));
        }
        else{
            root.setLeftNode(this.insertItem(root.getLeftNode(), data));
        }
        return root;
    }
}
