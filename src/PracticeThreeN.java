import java.io.*;
import java.util.*;
public class PracticeThreeN {
    static String ReadLn (int maxLg){
        byte lin[] = new byte [maxLg];
        int lg = 0, car = -1;
        String line = "";

        try{
            while(lg < maxLg){
                car = System.in.read();
                if ((car < 0) || (car == '\n')) break;
                lin [lg++] += car;
            }
        }
        catch (IOException e){
            return (null);
        }

        if ((car < 0)&& (lg == 0)) return (null);
        return (new String (lin, 0, lg));
    }

    public static void main (String args[]){
        PracticeThreeN myWork = new PracticeThreeN();
        myWork.Begin();
    }
    void Begin(){
        String input;
        StringTokenizer idata;
        int a, b, min, max, num, n, cycle, cyclemax;

        while ((input = PracticeThreeN.ReadLn (255)) != null){
            idata =  new StringTokenizer (input);
            a = Integer.parseInt (idata.nextToken());
            b = Integer.parseInt (idata.nextToken());
            if (a<b) {min=a; max=b; } else {min=b; max=a;}
            for (cyclemax=-1, num=min; num<=max; num++){
                for (n = num, cycle = 1; n != 1; cycle++)
                    if ((n % 2) != 0) n = 3 * n + 1;
                    else n >>= 1;
                if (cycle > cyclemax) cyclemax = cycle;
            }
            System.out.println(a + " " + b + " " + cyclemax);

        }
    }
}
