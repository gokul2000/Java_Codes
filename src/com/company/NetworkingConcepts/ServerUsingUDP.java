/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.NetworkingConcepts;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by Gokul on Aug,2020,31-08-2020 at 17:32
 */
public class ServerUsingUDP {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket= new DatagramSocket(9999);
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
        datagramSocket.receive(datagramPacket);
        String s= new String(datagramPacket.getData());
        int no = Integer.parseInt(s.trim());
        System.out.println(no);
        int result=no*no;
        System.out.println(result);
        InetAddress inetAddress = InetAddress.getLocalHost();
        byte[] bytes1= (result+"").getBytes();
        DatagramPacket datagramPacket1= new DatagramPacket(bytes1,bytes1.length,inetAddress,datagramPacket.getPort());
        datagramSocket.send(datagramPacket1);
        datagramSocket.close();

    }
}
