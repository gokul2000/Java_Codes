/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.NetworkingConcepts;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

/**
 * Created by Gokul on Aug,2020,31-08-2020 at 17:12
 */
public class SocketServer {
    public static void main(String[] args)  throws  Exception {
        System.out.println("Server : Server Started......");
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Server : Server Started Listening");
        Socket s = serverSocket.accept();
        System.out.println("Server : Client was Connected");
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String msg=br.readLine();
        System.out.println("Client :"+msg);
        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        PrintWriter printWriter = new PrintWriter(os);
        printWriter.println("Your message Recieved");
        printWriter.flush();
        System.out.println("Server : Data Sent to Client");

        serverSocket.close();


    }
}
