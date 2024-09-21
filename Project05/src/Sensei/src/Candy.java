import java.util.Scanner;

public class Candy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int candy = 1;
        int count = 0;
        boolean giveOne = true;
        while (n > 0) {
            if (n >= candy) {
                n = n - candy;
                count++;
            } else {
                break;
            }
            if (giveOne) {
                candy = 2;
            } else {
                candy = 1;
            }
            giveOne = !giveOne;
        }
        System.out.println(count);
        sc.close();
    }
}
