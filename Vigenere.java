package Vigenere;

public class Vigenere {
    private static String alphabets = "abcdefghijklmnopqrstuvwxyz";
    private static char[][] vigenereMatrix = new char[26][26];
    public static String compress(String text) {
        text = text.replaceAll("[^a-zA-Z]", "");
        text = text.toLowerCase();
        return text;
    }

    public static String fiveLetterWords(String text) {
        StringBuilder newText = new StringBuilder();
        for(int i = 0; i < text.length(); i++) {
            String t = null;
            if(i != 0 && i % 5 == 0)
                newText.append(' ');
            newText.append(text.toCharArray()[i]);
        }
        return newText.toString();
    }

    public static String encode(String message, String key) {
        init();
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < message.length(); i++) {
            if(message.toCharArray()[i] == ' ')
                s.append(' ');
            else
            s.append(vigenereMatrix[alphabets.indexOf(key.toCharArray()[i % key.length()])][alphabets.indexOf(message.toCharArray()[i])]);
        }
        return s.toString();
    }

    public static String decode(String codedText, String key) {
        init();
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < codedText.length(); i++) {
            if(codedText.toCharArray()[i] == ' ')
                s.append(' ');
            else {
                int a = alphabets.indexOf(codedText.toCharArray()[i]) - alphabets.indexOf(key.toCharArray()[i % key.length()]);
                if (a < 0)
                    a = 26 + a;
                s.append(alphabets.toCharArray()[a]);
            }
        }
        return s.toString().replaceAll(" ", "");
    }

    private static void init() {
        int shift = 0;
        for(int row = 0; row < alphabets.length(); row++) {
            for(int col = 0; col < alphabets.length(); col++) {
                vigenereMatrix[row][col] = alphabets.toCharArray()[((col+shift) % 26)];
            }
            shift++;
        }
    }
}