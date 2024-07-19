package LinkedList;

public class CreatingLinkedList {

    Node head;

    //Method to print all the elements available in Linked list

    public  void getdata() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
//            System.out.println(current.next);
            current = current.next;
        }
    }

    /*
    //Adding nodes in the list
    public void addElements(int no) {

        Node temp = new Node(no);

        if (head == null) {
            head = temp;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
        }
    }
        //Adding node in first
        private void addNodeInFirst(int i) {

        Node temp = new Node(i);
            if (head == null) {
                head = temp;
            }
            else{
                Node t = head;
                head = temp;
                head.next = t;
            }

        }

        //Adding elements in Md
    public void addElement(int target, int j){
        Node temp = head;
        Node ad = new Node(j);
        Node t1;
        while (temp.next!= null){
            if(temp.data == target){
                t1 = temp.next;
                temp.next = ad;
                ad.next = t1;
                return;
            }
            temp = temp.next;
        }
    }
*/
    public static void main(String[] args) {

        CreatingLinkedList creatingLinkedList = new CreatingLinkedList();
        creatingLinkedList.addElements(10);
        creatingLinkedList.addElements(20);
        creatingLinkedList.addElements(30);
        creatingLinkedList.addElements(40);
        creatingLinkedList.addElements(50);
        creatingLinkedList.addElements(60);

        //Adding new elements at the first
//        creatingLinkedList.addNodeInFirst(5);
//        creatingLinkedList.addElement(20,1);
        creatingLinkedList.removeNthElement(2);
//        creatingLinkedList.getdata();
    }

    //Adding nodes in the list
    public void addElements(int no) {

        Node temp = new Node(no);

        if (head == null) {
            head = temp;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
        }
    }
    //Adding node in first
    private void addNodeInFirst(int i) {

        Node temp = new Node(i);
        if (head == null) {
            head = temp;
        }
        else{
            Node t = head;
            head = temp;
            head.next = t;
        }

    }
    public void removeNthElement(int i){
        if (i < 1) {
            // Invalid index, handle the error or return early
            return;
        }

        Node n = new Node(-1);
        n.next = head;

        Node p = n;
        Node p1 = n;

        // Move the p1 pointer to the (i-1)-th node in the linked list
        for(int j = 0; j < i - 1 && p1 != null; j++){
            p1 = p1.next;
        }

        // Check if p1 is null, indicating an invalid index
        if (p1 == null || p1.next == null) {
            // Invalid index, handle the error or return early
            return;
        }

        // Move both pointers until p1 reaches the end of the linked list
        while (p1.next != null){
            p = p.next;
            p1 = p1.next;
        }

        // Remove the i-th node by adjusting the next pointer of the (i-1)-th node
        p.next = p.next.next;
        getPrint(n.next);
    }

    public void getPrint(Node n) {
        while (n.next!=null){
            System.out.println(n.data);
            n = n.next;
        }
    }
}
