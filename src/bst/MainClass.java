package bst;
public class MainClass {
    public static void main(String[] args){
        Btree btree = new Btree();
        Node root = null;
        root = btree.insertItem(root, 10);
        root = btree.insertItem(root, 5);
        root = btree.insertItem(root, 12);
        root = btree.insertItem(root, 15);
    }
}
