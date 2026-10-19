import java.util.Scanner;
public class TaskN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int z = 0;
        int p = 0;
        int neg = 0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x == 0) {
                z++;
            } else if (x > 0) {
                p++;
            } else {
                neg++;
            }
        }
        System.out.println(z);
        System.out.println(p);
        System.out.println(neg);
    }
}