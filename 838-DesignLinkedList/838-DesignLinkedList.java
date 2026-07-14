// Last updated: 14/07/2026, 14:50:06
class MyLinkedList {

    private class Node{
        
        int val=0;
        Node next;

        public Node(int val){
            this.val=val;
            this.next=null;
        }

        
    }
    private Node head=null;
        private int size=0;
    
    public MyLinkedList() {
       this.head=null;
       this.size=0;
    }
    
    public int get(int index) {
        
        if(index <0 || index >= size) return -1;

        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }

        return temp.val;
    }
    
    public void addAtHead(int val) {
        
        Node nn=new Node(val);

        nn.next=head;
        head=nn;
        size++;
    }
    
    public void addAtTail(int val) {
        
        if(head==null){
            addAtHead(val);
            return;
        }

        Node nn=new Node(val);
        Node temp=head;

        while(temp.next != null){
            temp=temp.next;
        }

        temp.next=nn;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        
        if(index < 0 || index > size) return;

        if(index==0){
            addAtHead(val);
            return;
        } 

        Node nn=new Node(val);
        Node temp=head;

        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }

        nn.next=temp.next;
        temp.next=nn;
        size++;
        
    }
    
    public void deleteAtIndex(int index) {
        
          if (index < 0 || index >= size) {
            return;
        }
        
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
                temp.next = temp.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */