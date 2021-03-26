package linkedList;

public class MainClass {
    public static void main(String[] args){
        CustomLinkedList customLinkedList = new CustomLinkedList();
        System.out.println("Length: "+customLinkedList.getLength());
        customLinkedList.printList();
        customLinkedList.insertLast(10);
        customLinkedList.insertLast(11);
        customLinkedList.insertLast(12);
        customLinkedList.insertLast(13);
        customLinkedList.insertLast(14);
        customLinkedList.insertLast(15);
        customLinkedList.printList();
        customLinkedList.insertFirt(2);
        customLinkedList.printList();
        System.out.println("Length: "+customLinkedList.getLength());
        customLinkedList.getMiddleValue();
        customLinkedList.deleteElement(2);
        customLinkedList.printList();
        customLinkedList.deleteElement(15);
        customLinkedList.printList();
    }
}
