package org.example.exercises;

import java.util.Scanner;

public class MainEx4 {
    public static void main(String[] args) {
        System.out.println(getInput());
    }
    static int getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type een heel getal: ");
        return scanner.nextInt();
    }
}
