import java.util.Arrays;
import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.print("Cases:");
        int cases = in.nextInt();
        for (int i = 0; i < cases; i++) {
            System.out.print("Number of people:");
            int people = in.nextInt();
            int[] peoples = new int[people];
            for (int j = 0; j < people; j++) {
                System.out.print("Person " + j + " Speed = ");
                peoples[j] = in.nextInt();
            }
            Arrays.sort(peoples);


        }
    }



}
