package bst;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args){
        Btree btree = new Btree();
        Node root = null;
        root = btree.insertItem(root, 10);
        root = btree.insertItem(root, 5);
        root = btree.insertItem(root, 2);
        root = btree.insertItem(root, 7);
        root = btree.insertItem(root, 3);
        root = btree.insertItem(root, 12);
        root = btree.insertItem(root, 11);
        root = btree.insertItem(root, 14);

        //pre order traversal
        btree.preOrderTraversal(root);
        System.out.println();


        //in order traversal
        //always sorted list
        btree.inOrderTraversal(root);
        System.out.println();

        //post order traversal
        btree.postOrderTraversal(root);
        System.out.println();

        //get the minimum value of btree
        btree.getMinValue(root);

        //get the max value of btree
        btree.getMaxValue(root);
        
    }
}
