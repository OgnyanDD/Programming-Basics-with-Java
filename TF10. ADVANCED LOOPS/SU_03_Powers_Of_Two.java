import java.util.Scanner;

public class SU_03_Powers_Of_Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;

        for (int i = 0; i <= n; i++) {
            System.out.println(num);
            num *= 2;
        }

    }
}
