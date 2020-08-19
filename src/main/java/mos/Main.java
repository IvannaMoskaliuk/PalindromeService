/**
 * @author Ivanna Moskaliuk KNUTE
 * @version 09.08.2020
 *
 * class Main
 **/
package mos;

public class Main {
    public static void main(String[] args) {

        String abba = "ABba"; // true

        PalindromeService palindromeService = new PalindromeService(abba);
        System.out.println(palindromeService.isValid());
        System.out.println(PalindromeService.isValid(abba));
    }
}
