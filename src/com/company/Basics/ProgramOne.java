/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.Basics;

import java.util.Scanner;

/**
 * Created by Gokul on Aug,2020,30-08-2020 at 16:38
 */
public class ProgramOne {
    public static String str="Gokul";

    public static void main(String[] args) {
        int a;
        String b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        sc.nextLine();
        b=sc.nextLine();
        System.out.println(a+" "+b);
        Scanner scanner = new Scanner(b).useDelimiter(":");
        System.out.println(scanner.nextInt());





    }


}

