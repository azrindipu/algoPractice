package creaking_the_coding_interview.linklist;

import java.util.HashSet;
import java.util.Set;

public class RemoveDups {

    private CustomLinkList customLinkList = null;

    public RemoveDups(CustomLinkList customLinkList){
        this.customLinkList=customLinkList;
    }

    public void removeDuplicate(Node head){
        if(head == null){
            return;
        }
        Set<Integer> tracker = new HashSet<>();
        Node temp = head;
        Node prevNode = head;
        while (temp != null){
            if(!tracker.add(temp.data)){
                prevNode.next=temp.next;
                temp=temp.next;
                continue;
            }
            prevNode = temp;
            temp=temp.next;
        }
    }

    public void removeDuplicateInPlace(Node head){
        if(head == null) return;
        Node tempHead = head;
        while (tempHead != null){
            Node runner = tempHead;
            while (runner.next != null){
                if(runner.next.data == tempHead.data){
                    runner.next=runner.next.next;
                }
                else{
                    runner=runner.next;
                }
            }
            tempHead=tempHead.next;
        }
    }
}
