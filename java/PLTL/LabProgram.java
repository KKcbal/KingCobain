import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      for (int i = 1; i < 6; i++) {
        System.out.print(7 * i);
        System.out.print(", ");
      }

      System.out.println();
      System.out.println();

      for (int l = 0; l < 8; l++) {
        System.out.print(30 - (5 * l));
        System.out.print(", ");
      }

      System.out.println();
      System.out.println();

      for (int p = 0; p < 5; p++) {
        System.out.print(10 * (Math.pow(10, p)));
        System.out.print(", ");
      }

      System.out.println();
      System.out.println();

      for (double k = 0; k < 6.0; k++) {
        System.out.print(1.0 + (0.2 * k));
        System.out.print(", ");
      }
   }
}
