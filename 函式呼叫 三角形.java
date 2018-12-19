import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char c = scn.next().charAt(0);
        fun(n, c);
    }
    public static void fun(int x, char c) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}