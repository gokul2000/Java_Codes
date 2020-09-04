/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.DataStructures.singlylinkedlist;

/**
 * Created by Gokul on Sep,2020,04-09-2020 at 13:26
 */
public class SinglyLinkedList {
    Node head=null;
    public void insert(int data){
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=null;
        if(head==null){
            head=newNode;
        }else{
            Node current=head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=newNode;

        }
    }
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=null;
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }
    public void printList(){
        Node current=head;
        while (current!=null){
            if(current.next==null){
                System.out.println(current.data);
            }else {
                System.out.print(current.data + "-->");
            }
            current=current.next;
        }
    }

}
