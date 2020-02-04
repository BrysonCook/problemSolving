import java.math.BigDecimal;
import java.util.*;
public class PiecesOfLand {

    public static void main (String args[])
    {
        BigDecimal userInput = new BigDecimal("0");
        BigDecimal nC4 = new BigDecimal("0");
        BigDecimal nC2 = new BigDecimal("0");
        String output = "";
        Scanner in = new Scanner(System.in);
        long n;
        n = in.nextInt();

        for (int i=0; i<n; i++)
        {
            userInput = in.nextBigDecimal();
            nC4 = userInput.multiply( userInput.subtract(BigDecimal.valueOf(1)));
            nC4 = nC4.multiply(userInput.subtract(BigDecimal.valueOf(2)));
            nC4 =  nC4.multiply(userInput.subtract(BigDecimal.valueOf(3)));
            nC4 = nC4.divide(BigDecimal.valueOf(24));
            nC2 = userInput.multiply(userInput.subtract(BigDecimal.valueOf(1)));
            nC2 = nC2.divide(BigDecimal.valueOf(2));
            BigDecimal nC4PlusnC2 = nC4.add(nC2);
            BigDecimal numberOfRegions = nC4PlusnC2.add(BigDecimal.valueOf(1));

            output += numberOfRegions.toString() + "\n";

        }
        System.out.print(output);
    }

}