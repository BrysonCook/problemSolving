/*@Author Bryson Cook
1/23/2020
Anagrams problem from Graceland Contest
completed*/

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);

        int numberOfLines = in.nextInt();   //Tracks number of lines that the user will input
        String output = ""; //Used to create a nicer output at the end of the program.

        for(int i = 0; i < numberOfLines; i++){
            String firstString = in.next(); //First word in each line from user input
            String secondString = in.next(); //second word in each line from user input

            if (firstString.equals(secondString)) {
                output += "\n" + "NO";
                break;
            }

            char[] firstCharArray = firstString.toCharArray(); //splits firstString into an array of chars
            char[] secondCharArray = secondString.toCharArray(); //splits secondString into an array of chars
            boolean areAnagram = isAnagram(firstCharArray, secondCharArray); //calls and stores the output of the function isAnagram

            if(areAnagram) output += "\n" + "YES";
            else
                output += "\n" + "NO";
        }
        System.out.println(output);
    }
    public static boolean isAnagram(char[] string1, char[] string2){
        if(string1.length != string2.length)
            return false;

        Arrays.sort(string1);
        Arrays.sort(string2);

        for(int length = 0; length < string1.length; length++){
            if(string1[length] != string2[length])
                return false;
        }
        return true;
    }
}
