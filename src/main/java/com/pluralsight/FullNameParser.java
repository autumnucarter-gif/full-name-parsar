package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter you name: ");
        String name = scanner.nextLine();

        int spaceIndex = name.indexOf(" ");
        String firstName = name.substring(0, spaceIndex);
        System.out.println(firstName);
        String lastName = name.substring(spaceIndex + 1);
        System.out.println(lastName);


    }
}
