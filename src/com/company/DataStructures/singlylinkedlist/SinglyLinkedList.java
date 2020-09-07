/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.DataStructures.singlylinkedlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Gokul on Sep,2020,04-09-2020 at 13:26
 */
public class SinglyLinkedList {
    Node head=null;
    List<Integer> firstOrder=new ArrayList<>();

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
        firstOrder.add(data);
    }
    public void insertNext(int data){
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
    public List<Integer> convertLinkedListtoList(){
        List<Integer>integerList = new ArrayList<>();
        if(head==null){
            System.out.println("No Enteries so List is null");
            return null;
        }
        else {
            Node current=head;
            while (current!=null){
                integerList.add(current.data);
                current=current.next;
            }
            return integerList;
        }
    }
    public int lengthOfList(){
        int cnt=0;
        if(head==null){
            return 0;
        }
        else{
            Node curr=head;
            while (curr!=null){
                cnt++;
                curr=curr.next;
            }
            return cnt;
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
    public void insertLast(int data){
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
    public void printList(){
        if(head==null){
            System.out.println("No Data");
            return;
        }
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
    public void insertAt(int index,int data)  {
        Node current=head;
        Node newNode=new Node();
        if(index==0){
            insertFirst(data);
        }
        else if(index>lengthOfList()||index<0){
           System.out.println("Your index is not appropriate");
        }
        else {

               int cont=0;
               newNode.data=data;
               while (cont<index-1){
                   current=current.next;
                   cont++;
               }
               Node t=current.next;
               current.next=newNode;
               newNode.next=t;

        }
    }
    public void clearAll(){
        if(head == null){
            return;
        }else{
            Node current= head;
            while (current!=null){
                System.out.println("Deleting "+current.data);
                current=current.next;
            }
            System.out.println("Deleted");
            head=null;
        }
    }
    public void SortList(boolean desc){
        if(head!=null){
            List<Integer> integerList = convertLinkedListtoList();
            if(desc){
                integerList.sort(Collections.reverseOrder());
            }else {
                Collections.sort(integerList);
            }
            clearAll();
            for(int i:integerList){
                insertNext(i);
            }
        }
    }
    public  void  convertListToLinkedList(List<Integer> list){
        clearAll();
        for(int i:list){
            insertNext(i);
        }

    }
    public void addAll(Collection<Integer> collection){
        for(int c:collection){
            insert(c);
        }
    }




}
