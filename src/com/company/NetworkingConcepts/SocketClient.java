/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.NetworkingConcepts;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Gokul on Aug,2020,31-08-2020 at 17:12
 */
public class SocketClient {
    public static void main(String[] args) throws  Exception {
        String ip = "localhost";
        int port=9999;
        String str="Gokul";
        Socket s = new Socket(ip,port);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(s.getOutputStream());
        PrintWriter printWriter = new PrintWriter(outputStreamWriter);
        printWriter.println(str);
        printWriter.flush();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String sr =br.readLine();
        System.out.println("Server :"+sr);

    }
}
