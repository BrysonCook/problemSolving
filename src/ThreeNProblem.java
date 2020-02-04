import java.util.Scanner;

public class ThreeNProblem {

    public static final int cacheSize = 1000000;

    private static long[] cache = new long[cacheSize];

    static {
        cache[1] = 1;
        cache[2] = 2;
        cache[4] = 3;
        cache[8] = 4;
        cache[16] = 5;
    }

    public static void main(final String[] args) {

        final Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int i = in.nextInt();
            int j = in.nextInt();
            long resp = maxCycleLength(i, j);
            System.out.println(i + " " + j + " " + resp);
        }
    }

    public static long maxCycleLength(long min, long max) {

        long start = Math.min(min, max);
        long end = Math.max(min, max);
        long maxCycleLength = 0;

        for (long i = start; i <= end; i++) {
            long cycleLength = cycleLength(i);
            if (cycleLength > maxCycleLength) {
                maxCycleLength = cycleLength;
            }
        }

        return maxCycleLength;

    }

    /**
     * Calculates the cycle length for the given positive integer
     *
     * @param n
     *
     * @return
     */
    public static long cycleLength(long n) {
        if (n < cacheSize && cache[(int) n] != 0) {
            return cache[(int) n];
        } else {

            long length = 1 + cycleLength((n & 1) == 0 ? n >> 1 : 3<<1 + n + 1);
            if (n < cacheSize) {
                cache[(int) n] = length;
            }
            return length;
        }
    }
}
