
/*8. Write a program to convert each 1st char to uppercase from a string*/

package StringManipulation;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        //String str = "rahim lives in sylhet";
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            String firstLetter = String.valueOf(words[i].charAt(0)).toUpperCase();
            System.out.println("ok"+ firstLetter);
            String othersLetter = words[i].substring(1);
            System.out.println("acchaok"+ othersLetter);
            System.out.print(firstLetter + othersLetter);
        }

    }
}
