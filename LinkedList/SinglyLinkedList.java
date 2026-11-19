public class SinglyLinkeddList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void insertAtEnd(int data){
        Node new_node = new Node(data);
        if(head==null){
            head=new_node;
            return;
        }
        Node last = head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=new_node;
    }
    public void insertAtBeginning(int data){
        Node new_node = new Node(data);
        new_node.next=head;
        head=new_node;
    }
    public void deleteAtbeginning(){
        if(head==null){
            return;
        }
        head=head.next;
    }
    public void deleteAtEnd(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node second_last = head;
        while(second_last.next.next!=null){
            second_last=second_last.next;
        }
        second_last.next=null;
    }
    public void peek(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("First element is: "+head.data);
    }
    public void search(int key){
        Node current = head;
        while(current!=null){
            if(current.data==key){
                System.out.println("Element found");
                return;
            }
            current=current.next;
        }
        System.out.println("Element not found");
    }
    public void show(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        SinglyLinkeddList sll = new SinglyLinkeddList();
       sll.insertAtEnd(1);
       sll.insertAtEnd(2);
       sll.insertAtEnd(3);
       sll.insertAtBeginning(0);
       sll.insertAtBeginning(8);
       sll.deleteAtbeginning();
       sll.deleteAtEnd();

       sll.peek();
       sll.search(2);
       sll.show()   ;
    }
}
