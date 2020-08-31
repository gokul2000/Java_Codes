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
public class ClientUsingUDP {
    public static void main(String[] args) throws  Exception{
        DatagramSocket datagramSocket = new DatagramSocket();
        int i=8;
        byte[] bytes = (Integer.toString(i)).getBytes();
        byte [] bytes1 = new byte[1024];
        InetAddress inetAddress = InetAddress.getLocalHost();
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length,inetAddress,9999);
        datagramSocket.send(datagramPacket);
        DatagramPacket datagramPacket1 = new DatagramPacket(bytes1,bytes1.length);
        datagramSocket.receive(datagramPacket1);
        String str = new String(datagramPacket1.getData());
        System.out.println(str);




    }
}
