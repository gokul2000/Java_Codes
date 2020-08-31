/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.NetworkingConcepts;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Gokul on Aug,2020,31-08-2020 at 17:53
 */
public class ChatApplicationServer {
    ServerSocket serverSocket;
    Socket socket;
    BufferedReader br;
    PrintWriter printWriter;

    public ChatApplicationServer() throws Exception {
        serverSocket = new ServerSocket(9999);
        System.out.println("Server is Ready");
        socket = serverSocket.accept();
        br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        printWriter=new PrintWriter(socket.getOutputStream());
        startReading();
        startWriting();


    }

    private void startWriting() {
        Runnable r1 = ()->{
            System.out.println("Reader Started");
            try {
                while (true) {
                    String msg = br.readLine();
                    if(msg.equals("exit")){
                        System.out.println("Server: Client Closed the Communication");

                        break;
                    }
                    System.out.println("Client "+msg);

                }
            }catch (Exception e){
                e.printStackTrace();
            }

        };
        new Thread(r1).start();
    }

    private void startReading() {
        Runnable r2 = ()->{
            System.out.println("Writer Started");
            try {
                while (true){
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                    String content=bufferedReader.readLine();
                    printWriter.println(content);
                    printWriter.flush();

                }
            }catch (Exception e){
                e.printStackTrace();
            }

        };
        new Thread(r2).start();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Server is Starting ......");
        new ChatApplicationServer();
    }
}
