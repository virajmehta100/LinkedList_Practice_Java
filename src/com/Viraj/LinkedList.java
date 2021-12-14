package com.Viraj;

public class LinkedList {
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head==null){
            head = node;
        }
        else{
            Node n = head; //temporary variable to hold the data that we are trying to insert
            while(n.next!=null){
                n = n.next; // till not null we will iterate
            }
            n.next = node; // when we get null as the address we will update the value...
        }

    }
}
