/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.Basics;

/**
 * Created by Gokul on Aug,2020,29-08-2020 at 19:23
 */

import java.io.BufferedReader;
import java.util.Scanner;

/**
 * In this Program we are going to discuss about the input and output
 * Input in java is just a stream of reader "System.in"
 * Java also has specified class to read inputs like
 * BufferedReader , Scanner
 * each class in reader extends a super class reader
 * BufferedReader extends Reader it is the basic class
 * Today we use Scanner as it is advanced
 * Scanner has
 *
 * */
public class Program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse().toString());




    }
}
