import java.util.Scanner;

public class ArraysAndMethods {
    public static void print(int[] list) {
        int x = 0;

        System.out.print("Scores: ");
        for (int z : list) {
            System.out.print(z);
            if (x != list.length - 1) {
                System.out.print(", ");
            }
            x++;
        }
    }
    
    public static double getAvg(int[] list) {
        double avg = 0.0;

        for (int n : list) {
            avg += n;
        }

        return avg / list.length;
    }

    public static void getGradeByAvg(double n) {
        if (n >= 90) {
            System.out.println("Letter Grade: A");
        } else if (n >= 80) {
            System.out.println("Letter Grade: B");
        } else if (n >= 70) {
            System.out.println("Letter Grade: C");
        } else if (n >= 60) {
            System.out.println("Letter Grade: D");
        } else {System.out.println("Letter Grade: F");}
    }

    public static int findMaxGrade(int[] list) {
        int high = list[0];
        for (int m : list) {
            if (m > high) {
                high = m;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int x;
        int sum = 0;

        System.out.println("How many scores?");
        int a = scnr.nextInt();

        int[] list = new int[a];

        System.out.println("Type the scores: ");
        for (int i = 0; i < a; i++) {
            x = scnr.nextInt();
            sum += x;
            list[i] = x;
        }

        System.out.println();

        System.out.print("Sum: ");
        System.out.println(sum);

        System.out.print("Average: ");
        System.out.println(getAvg(list));

        getGradeByAvg(getAvg(list));

        System.out.println("Highest Score: " + findMaxGrade(list));
    }
}
