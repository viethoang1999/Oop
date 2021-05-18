package Donggoi.Test;

import Donggoi.Lesson1.Account;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.display();
        account.withdraw(1000);
        System.out.println("Balance: " + account.getBalance());
        account.deposit(600);
        System.out.println("Balance: " + account.getBalance());
        account.withdraw(2100);
        System.out.println("Balance: " + account.getBalance());


    }
}
