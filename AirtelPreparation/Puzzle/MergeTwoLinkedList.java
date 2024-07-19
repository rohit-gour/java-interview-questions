package AirtelPreparation.Puzzle;

public class MergeTwoLinkedList {

    Node head;

    public void add(int data){
        Node n = new Node(data);
        if(head==null){
            head = n;
            return;
        }

        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;
    }

    public void getElement(){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public void mergeTwoList(Node node1, Node node2){

    }

    public static void main(String[] args) {
        MergeTwoLinkedList nodes1 = new MergeTwoLinkedList();
        nodes1.add(2);
        nodes1.add(4);
        nodes1.add(9);

        nodes1.getElement();

        MergeTwoLinkedList nodes2 = new MergeTwoLinkedList();
        nodes2.add(1);
        nodes2.add(5);
        nodes2.add(6);

        nodes2.getElement();

//        nodes1.mergeTwoList(nodes1, nodes2);
    }
}
