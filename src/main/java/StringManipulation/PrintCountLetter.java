
/*4. Write a program that will give following output:
Input: Chattogram
Output: C8M*/

package StringManipulation;

import java.util.Scanner;

public class PrintCountLetter {
    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int i, count = 0;
        count = str.length()-2;
        String[] words = str.split(" ");
        for (i = 0; i <= words.length-1; i++) {
            String firstLetter = String.valueOf(words[i].charAt(0)).toUpperCase();
            String lastLetter = String.valueOf(words[i].charAt(words.length)).toUpperCase();

            System.out.print(firstLetter + count + lastLetter);

        }
    }
}