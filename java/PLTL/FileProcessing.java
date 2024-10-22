import java.util.Scanner;
import java.io.*;

public class FileProcessing {
    public static void main(String[] args)throws IOException {
        Scanner nums = new Scanner(new File("java/PLTL/numbers.txt"));
        Scanner nums2 = new Scanner(new File("java/PLTL/numbers.txt"));
        int fill;
        double y;
        double sum = 0;
        double M = 0;
        int S = 10000;
        int L = -10000;
        double Sx;
        double counter = 0;

        while(nums.hasNext()) {
            counter++;
            String theN = nums.next();
            fill = Integer.parseInt(theN);

            if (fill < S) {
                S = fill;
            }
            if (fill > L) {
                L = fill;
            }
            M += fill;

            System.out.println(theN);
        }

        M = M / counter;
        nums.close();

        while(nums2.hasNext()) {
            String x = nums2.next();
            y = Integer.parseInt(x);

            sum += Math.pow((y - M), 2);
        }

        Sx = Math.sqrt(sum/(counter));

        System.out.println("The mean is " + M);
        System.out.println("The smallest is " + S);
        System.out.println("The largest is " + L);
        System.out.print("The standard deviation is ");
        System.out.printf("%.2f", Sx);
    }
    
}
