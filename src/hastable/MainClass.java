package hastable;


public class MainClass {
    public static void main(String[] args){
        HashMethods hashTable = HashTable.getInstance();
        hashTable.addItem("item1");
        hashTable.getItem("item1");
    }
}
