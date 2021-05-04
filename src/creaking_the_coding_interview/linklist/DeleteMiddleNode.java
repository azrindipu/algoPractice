package creaking_the_coding_interview.linklist;

public class DeleteMiddleNode {

    private CustomLinkList customLinkList = null;
    public DeleteMiddleNode(CustomLinkList customLinkList){
        this.customLinkList=customLinkList;
    }

    public void deleteGivenNode(Node node){
        if(node == null){
            return;
        }
        node.data = node.next.data;
        node.next = node.next.next;
    }
}
