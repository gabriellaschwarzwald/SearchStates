package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("========== SEARCHING ==========");
        System.out.println("Would you like to find a state? (y/n)");
        Scanner myVar = new Scanner(System.in);
        String ans = myVar.nextLine();

        while (ans.equals("y")) {
            System.out.println("Enter the state you would like to check:");
            myVar = new Scanner(System.in);
            String key = myVar.nextLine();

            SearchState search = new SearchState(key);

            System.out.println("Would you like to find a new state? (y/n)");
            myVar = new Scanner(System.in);
            ans = myVar.nextLine();
        }
    }
}
