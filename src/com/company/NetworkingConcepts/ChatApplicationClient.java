/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.NetworkingConcepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Gokul on Aug,2020,31-08-2020 at 18:12
 */
public class ChatApplicationClient {
    Socket socket;
    BufferedReader br;
    PrintWriter printWriter;

    public ChatApplicationClient() throws Exception {
        System.out.println("Sending Request.........trying to connect the Server......");
        socket=new Socket("localhost",9999);
        br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        printWriter=new PrintWriter(socket.getOutputStream());
        startReading();
        startWriting();


    }
    public static void main(String[] args) throws Exception {
        System.out.println("This is Client...");
        System.out.println("Client is going to start ...");
        new ChatApplicationClient();

    }
    private void startWriting() {
        Runnable r1 = ()->{
            System.out.println("Reader Started");
            try {
                while (true) {
                    String msg = br.readLine();
                    if(msg.equals("exit")){
                        System.out.println("Client:Server Closed the Communication");

                        break;
                    }
                    System.out.println("Server "+msg);

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
}
