package Palindrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palindrome palindrome = new Palindrome();

        System.out.println("Entrez une chaîne de caractères : ");

        palindrome.word = scanner.nextLine();
        palindrome.display();
    }
}