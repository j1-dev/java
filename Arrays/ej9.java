import java.util.Scanner;

public class ej9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = new int[8];

    System.out.println("Introduce 8 números");

    for (int i = 0; i < nums.length; i++) {
      nums[i] = sc.nextInt();
    }

    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]);
      if (nums[i] % 2 == 0) {
        System.out.println("<- PAR");
      } else {
        System.out.println("<- IMPAR");
      }
    }
  }
}
