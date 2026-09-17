import java.util.*;
public class head{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

public void addFirst(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
}
public void addLast(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
    tail.next=newNode;
    tail=newNode;
}
public void add(int idx,int data){
    if(idx==0){
        addFirst(data);
        return;
    }
    Node newNode=new Node(data);
    size++;
    Node temp=head;
    int i=0;
    while(i<idx-1){
        temp=temp.next;
        i++;
    }
    newNode.next=temp.next;
    temp.next=newNode;
}
public void print(){
    if(head==null){
        System.out.println("ll is empty");
        return;
    }
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
}
public int removeFirst(){
    if(head==null){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
    }
    if(size==1){
        int val=head.data;
        head=tail=null;
        size--;
        return val;
    }
    int val=head.data;
    head=head.next;
    size--;
    return val;
}
public int removeLast(){
    if(size==0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
    }
    if(size==1){
        int val=head.data;
        head=tail=null;
        size--;
        return val;
    }
    Node prev=head;
    for(int i=0;i<size-2;i++){
        prev=prev.next;
    }
    int val=prev.next.data;
    prev.next=null;
    tail=prev;
    size--;
    return val;
}
public int search(int key){
    Node temp=head;
    int idx=0;
    for(int i=0;i<size-2;i++){
        if(temp.data==key){
            return idx;
        }
        idx++;
        temp=temp.next;
    }
    return -1;
}
public int helper(Node head,int key){
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    int idx=helper(head.next,key);
    if(idx==-1){
        return -1;
    }
    return idx+1;
}
public int recSearch(int key){
    return helper(head,key);
}
public void reverse(){
    Node prev=null;
    Node curr=tail=head;
    Node next;

while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
}
head=prev;
}
public void deletefrom(int n){
    Node temp=head;
    int sz=0;
    while(temp!=null){
        temp=temp.next;
        sz++;
    }
    if(n==sz){
        head=head.next;
        return;
    }
    int i=1;
    int itofind=sz-n;
    Node prev=head;
    while(i<itofind){
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return;
}
public boolean iscycle(){
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            return true;
        }
    }
    return false;
}
public static void main(String args[]){
    head ll=new head();ll.print();
   
    ll.addFirst(2); 
    ll.addFirst(1);
    ll.addLast(4);
    ll.addLast(5);
    ll.add(2,3);
    // ll.print();
    // System.out.println(ll.size);
    // ll.removeFirst();
    // ll.print();
    // System.out.println(ll.size);
    // ll.removeLast();
    // ll.print();
    // System.out.println(ll.size);
    // System.out.println(ll.recSearch(3));
    // System.out.println(ll.recSearch(22));
    // ll.reverse();
    // ll.print();
    // ll.deletefrom(3);
    // ll.print();
    ll.iscycle();
    ll.print();
}
}
