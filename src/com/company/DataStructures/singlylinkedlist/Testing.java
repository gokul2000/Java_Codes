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
            System.out.println("1.Insert....");
            System.out.println("2.Insert at First...");
            System.out.println("3.Print List....");
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
                default -> {
                    System.out.println("Exiting..");
                    cont=false;}
            }
        }

    }
}
