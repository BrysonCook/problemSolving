//1.6.1 The 3n + 1 Problem From the Book
//Author: Bryson Cook

import java.util.Scanner;
public class Main {

    public static void main(final String[] args) {

        final Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int i = in.nextInt();   //first user variable in every input line
            int j = in.nextInt();   //second user variable in every input line
            int resp = maxCycleLength(i, j);    //max cycle length from the range of numbers.
            System.out.println(i + " " + j + " " + resp);
        }
    }
    public static int maxCycleLength(int min,int max){
        int start = Math.min(min, max); //reassign the start value to the minimum value given by the user
        int end = Math.max(min, max);   //reassign the end value to the maximum value given by the user
        int maxLength = 0;              //variable to hold the overall max cycle length from our range of numbers

        for (int range = start; range <= end; range++) {
            int length = 1;    //cycle length counter for each number in our range
            int n = range;     //renaming of for loop variables

            while (n != 1) {
                if (n % 2 == 0)
                    n = n / 2;
                else n = (3 * n + 1);
                length += 1;
            }
            if (length > maxLength) maxLength = length;
        }

        return maxLength;

    }
}
