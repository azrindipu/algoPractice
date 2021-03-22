package linkedList;

public class MainClass {
    public static void main(String[] args){
        CustomLinkedList customLinkedList = new CustomLinkedList();
        System.out.println("Length: "+customLinkedList.getLength());
        customLinkedList.printList();
        customLinkedList.insert(10);
        customLinkedList.insert(11);
        customLinkedList.insert(12);
        customLinkedList.insert(13);
        customLinkedList.insert(14);
        customLinkedList.insert(15);
        customLinkedList.printList();
        System.out.println("Length: "+customLinkedList.getLength());
    }
}
