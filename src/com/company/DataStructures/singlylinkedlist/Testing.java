/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.DataStructures.singlylinkedlist;

import java.util.Scanner;

/**
 * Created by Gokul on Sep,2020,04-09-2020 at 13:28
 */
public class Testing {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Scanner scanner = new Scanner(System.in);
        boolean cont=true;
        while (cont){
            System.out.println("0.Exit....");
            System.out.println("1.Insert....");
            System.out.println("2.Insert at First...");
            System.out.println("3.Print List....");
            System.out.println("4.Length of List...");
            System.out.println("5.Insert at position...index starts from 0");
            System.out.println("6.Convert LinkedList to List");
            System.out.println("7.clear List");
            System.out.println("8.Sort List");
            System.out.println("9.Original List Before Sorting");
            System.out.println("10.Insert Last");
            System.out.println("Press any other number to exit...");
            int choice=scanner.nextInt();
            switch (choice){
                case 1->{System.out.println("Enter Number");
                    singlyLinkedList.insert(scanner.nextInt());}
                case 2->{System.out.println("Enter Number");
                    singlyLinkedList.insertFirst(scanner.nextInt());}
                case 3->{
                    System.out.println("Showing List....");
                    singlyLinkedList.printList();
                }
                case 4->{
                    System.out.println("Length of List...");
                    System.out.println(singlyLinkedList.lengthOfList());
                }
                case 5->{
                    System.out.println("Enter position followed by data");
                    singlyLinkedList.insertAt(scanner.nextInt(),scanner.nextInt());
                }
                case 6->{
                    System.out.println("Converting....");
                    System.out.println(singlyLinkedList.convertLinkedListtoList());
                }
                case 7->{
                    singlyLinkedList.clearAll();
                }
                case 8->{
                    singlyLinkedList.SortList();

                }
                case 9->{
                    singlyLinkedList.convertListToLinkedList(singlyLinkedList.firstOrder);
                }
                case 10->{
                    System.out.println("Enter");
                    singlyLinkedList.insertLast(scanner.nextInt());
                }
                default -> {
                    System.out.println("Exiting..");
                    cont=false;}
            }
        }

    }
}
