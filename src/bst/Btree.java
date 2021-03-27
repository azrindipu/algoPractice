package bst;

import java.util.List;

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

    //root=>left=>right
    public void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.getData()+" ");
        this.preOrderTraversal(root.getLeftNode());
        this.preOrderTraversal(root.getRightNode());
    }

    //left=>root=>right
    public void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        this.inOrderTraversal(root.getLeftNode());
        System.out.print(root.getData()+" ");
        this.inOrderTraversal(root.getRightNode());
    }

    //left=>right=>root
    public void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        this.postOrderTraversal(root.getLeftNode());
        this.postOrderTraversal(root.getRightNode());
        System.out.print(root.getData()+" ");
    }

    public void getMinValue(Node root){
        if(root.getLeftNode() == null){
            System.out.println("Min value is : "+root.getData());
            return;
        }
        this.getMinValue(root.getLeftNode());
    }

    public void getMinValueLoop(Node root){
        if(root == null){
            System.out.println("Tree is empty");
        }
        Node node = root;
        while (true){
            if(node.getLeftNode() == null){
                System.out.println("Min value is : "+node.getData());
                break;
            }
            node = node.getLeftNode();
        }
    }

    public void getMaxValue(Node root){
        if(root == null){
            System.out.println("Tree is empty");
        }
        Node node = root;
        while (true){
            if(node.getRightNode() == null){
                System.out.println("The max value is : "+node.getData());
                break;
            }
            node = node.getRightNode();
        }
    }
}
