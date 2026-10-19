import java.util.Scanner;
public class TaskO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean f = false;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x == 0) {
                f = true;
            }
        }
        if (f) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}