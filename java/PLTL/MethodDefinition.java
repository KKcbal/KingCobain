import java.io.File;

public class MethodDefinition {
    public static void main(String[] args){
        printFibonacciNumbers(55);
    }

    public static int calculateSum(int x, int y, int z) {
        return x + y + z;
    }
    public static String getInitials(String s1, String s2) {
        String s3 = "" + s1.charAt(0) + s2.charAt(0);
        return s3;
    }
    public static void printAll(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            System.out.println(s.charAt(i));
        }
    }
    public static boolean isPositive(int n) {
        if (n > 0) {
            return true;
        } else { return false; }
    }
    public static void printReverse(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }
    }
    public static int getAge(int y) {
        return 2024 - y;
    }
    public static void printEvenNumbers(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = 0; i > n; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
    public static void printOddNumbers(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = 0; i > n; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
    public static void printEvensByRange(int x, int y) {
        if (x > y) {
            for (int i = y; i < x; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = x; i > y; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
    public static void printFibonacciNumbers(int n) {
        int x = 0;
        int y = 1;
        int z;
        System.out.println(x);
        System.out.println(y);
        while (y < n) {
            z = x + y;
            x = y;
            y = z;
            System.out.println(z);
        }
    }
    public static int getAVG(int x, int y, int z) {
        int b = x + y + z;
        return b / 3;
    }
    public static void readNumbers(File file) {}
    public static char getThird(String s) {}
    private static void setX(double x) {}
    private static void getTime() {}
    protected static boolean isUpperCase(char z) {}
    protected static double currentTimeMillis() {}
    protected static double nanoTime() {}
    public static double random() {}
    public static int processArgs(String[] args) {}
}
