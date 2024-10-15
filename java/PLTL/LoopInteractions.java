import java.util.Scanner;

public class LoopInteractions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Enter name: ");
        String Name = scnr.nextLine();

        System.out.print("for: ");
        for (int i = 0; i < n; i++){
            System.out.print(Name + ", ");
        }
        System.out.println();

        System.out.print("while: ");
        int b = 0;
        while (b < n) {
            System.out.print(Name + ", ");
            b++;
        }
        System.out.println();

        System.out.print("do while: ");
        int l = 0;
        do {
            System.out.print(Name + ", ");
            l++;
        } while (l < n); 

        scanner.close();
        scnr.close();
    }
}
