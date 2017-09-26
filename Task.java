package Vigenere;

import java.util.Scanner;

public class Task {

    public static void main(String[] arg) {
        String text = null;
        String key = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your text: ");
        text = sc.nextLine();
        System.out.print("Enter your key: ");
        key = sc.next();

        System.out.println("1 - Encode\n2 - Decode");
        System.out.print("What would you like to do with the data provided? ");
        int opt = sc.nextInt();

        switch(opt) {
            case 1:
                text = Vigenere.compress(text);
                text = Vigenere.fiveLetterWords(text);
                text = Vigenere.encode(text, key);
                System.out.println("Your encrypted text is: "+text);
                break;
            case 2:
                text = Vigenere.decode(text, key);
                System.out.println("Your decrypted text is: "+text);
                break;
        }
    }
}
