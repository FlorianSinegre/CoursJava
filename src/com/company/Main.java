package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 System.out.println("les briscards");
	 String name;
	 System.out.println("Entrez votre nom :");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        sc.close();
        System.out.println("Bienvenue"+name);

    }
}
