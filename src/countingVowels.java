/*
Develop a program that counts the number of vowels in a given string.
 */


import java.util.Scanner;

public class countingVowels {
    public static void main(String[] args) {
        String s = userInput();
        System.out.println("The following string has " + vowelCounter(s) + " vowels ");
    }

    public static String userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word");
        return sc.nextLine();
    }

    public static int vowelCounter(String s) {

        String filtered = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int vowelCount = 0;

        for (int i = 0; i < filtered.length(); i++) {

            char currentChar = filtered.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }
}