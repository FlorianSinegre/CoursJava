package com.company.tableau;

import java.util.Scanner;

public class tableau {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Coucou les loulou");
        System.out.print("Entrez le nom de l'apprenant 1 : ");
        String name1 = sc.nextLine();
        System.out.println("Entrez la note de "+name1);


        float note1 = sc.nextFloat();

        sc.nextLine();
        System.out.print("Entrez le nom de l'apprenant 2");
        String name2 = sc.nextLine();
        System.out.println("Entrez la note de "+name2);
        float note2 = sc.nextFloat();

        System.out.println("La moyenne de la classe est de : "+(note1+note2));
    }
}
