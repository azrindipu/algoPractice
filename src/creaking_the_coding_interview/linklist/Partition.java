package creaking_the_coding_interview.linklist;

public class Partition {

    private CustomLinkList customLinkList = null;

    public Partition(CustomLinkList customLinkList){
        this.customLinkList=customLinkList;
    }

    public Node makePartition(Node head, int partitionValue){
        Node beforeStart=null;
        Node beforeEnd=null;
        Node afterStart=null;
        Node afterEnd=null;
        Node tempHead = head;
        while (tempHead != null){
            Node node = new Node(tempHead.data);
            if(tempHead.data>=partitionValue){
                if(afterStart== null){
                  afterStart= node;
                  afterEnd=afterStart;
                }
                else{
                    afterEnd.next=node;
                    afterEnd=node;
                }
            }
            else{
                if(beforeStart== null){
                    beforeStart=node;
                    beforeEnd=beforeStart;
                }
                beforeEnd.next = node;
                beforeEnd = node;
            }
            tempHead=tempHead.next;
        }
        beforeEnd.next=afterStart;
        return beforeStart;
    }
}
