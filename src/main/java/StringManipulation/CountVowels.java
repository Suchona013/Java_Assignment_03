
/*5. Write a program that will count how many vowels in the given string:*/

package StringManipulation;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.toLowerCase();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println(
                "Total no of vowels in string are: " + count);
    }
}
