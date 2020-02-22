package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String name = scanner.next();
        System.out.println("Hello " + name);
        System.out.println("Enter counts: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String vvod=br.readLine();
        String[] tok=vvod.split(" ");
        int sum = 0;
        int proiz = 1;
        for (int i = 0; i < tok.length; i++) {
            sum = sum + Integer.parseInt(tok[i]);
            proiz = proiz * Integer.parseInt(tok[i]);
        }
        System.out.println(sum + " " + proiz);

    }

}
