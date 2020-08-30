/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.Serialization;

import java.io.*;

/**
 * Created by Gokul on Aug,2020,30-08-2020 at 13:29
 */
public class ProgramSerializableOne {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BankAccountHolderDetails holderDetails=new BankAccountHolderDetails();
        FileOutputStream fileOutputStream = new FileOutputStream("accountdetails.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(holderDetails);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("accountdetails.txt"));
        BankAccountHolderDetails bankAccountHolderDetails = (BankAccountHolderDetails) objectInputStream.readObject();
        System.out.println(bankAccountHolderDetails.accountNumber+" "+bankAccountHolderDetails.nameOfAccountHolder+" "+bankAccountHolderDetails.password);


    }
}

class BankAccountHolderDetails implements Serializable {
    public String nameOfAccountHolder="HariHaran";
    public long accountNumber=1234567891234L;
    public transient String password="Hari@2000#CNB4356"; //transient key word make it unavailable in serialization


}


