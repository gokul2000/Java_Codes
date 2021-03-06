/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.oops;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by Gokul on Aug,2020,29-08-2020 at 21:41
 */
public class BankManagement {
    public static void main(String[] args) {
        List<BankAccounts> list = new ArrayList<>();
        list.add(new BankAccounts(1234567891234L,123400.50,"Hari"));
        list.add(new BankAccounts(1234564534545L,13400.50,"Aswathi"));
        list.add(new BankAccounts(1908743847348L,123400.50,"Ranjith"));
        Stream<BankAccounts> bankAccountsStream = list.stream().sorted(Comparator.comparing(o -> o.accountHolderName));
        Iterator<BankAccounts> bankAccountsIterator=bankAccountsStream.iterator();
        while (bankAccountsIterator.hasNext()){
            System.out.println(bankAccountsIterator.next());
        }
        Stream<BankAccounts> bankAccountsStream1=list.stream().sorted(Comparator.comparing(new Function<BankAccounts, Double>() {
            @Override
            public Double apply(BankAccounts bankAccounts) {
                return bankAccounts.accountBalance;
            }
        }));
        bankAccountsIterator=bankAccountsStream1.iterator();
        while (bankAccountsIterator.hasNext()){
            System.out.println(bankAccountsIterator.next());
        }

    }
}
class BankAccounts{
    long accountNumber;
    double accountBalance;
    String accountHolderName;
    public BankAccounts(long accountNumber, double accountBalance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountHolderName = accountHolderName;
    }

    @Override
    public String toString() {
        return "BankAccounts{" +
                "accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", accountHolderName='" + accountHolderName + '\'' +
                '}';
    }
}
