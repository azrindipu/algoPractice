package creaking_the_coding_interview;

import creaking_the_coding_interview.linklist.Node;
import creaking_the_coding_interview.linklist.CustomLinkList;
import creaking_the_coding_interview.linklist.RemoveDups;

public class MainClassLinkList {
    public static void main(String[] args){

        //test
        Node head = null;
        CustomLinkList customLinkList = new CustomLinkList();
        head=customLinkList.insertLastData(head, 10);
        head=customLinkList.insertLastData(head, 11);
        head=customLinkList.insertLastData(head, 12);
        head=customLinkList.insertLastData(head, 13);
        head=customLinkList.insertLastData(head, 14);
        customLinkList.printList(head);
        System.out.println("Length: "+customLinkList.getLength(head));
        head= customLinkList.insertFirst(head,10);
        customLinkList.printList(head);
        System.out.println("Length: "+customLinkList.getLength(head));


        /*Remove Dups: Write code to remove duplicates from an unsorted linked list.*/

        RemoveDups removeDups = new RemoveDups(customLinkList);
        removeDups.removeDuplicate(head);
        customLinkList.printList(head);

    }
}
