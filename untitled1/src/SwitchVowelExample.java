package controlstatement;

import java.util.Scanner;

public class SwitchVowelExample {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character ?");
        char ch = scanner.next().charAt(0);
        switch (ch) {
            case 'a':
                System.out.println("Vowel"+ch);
                break;
            case 'e':
                System.out.println("Vowel"+ch);
                break;
            case 'i':
                System.out.println("Vowel"+ch);
                break;
            case 'o':
                System.out.println("Vowel"+ch);
                break;
            case 'u':
                System.out.println("Vowel"+ch);
                break;
            default:
                System.out.println("Constant" +ch);
        }
    }
}
