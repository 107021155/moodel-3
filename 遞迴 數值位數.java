import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(fun(scn.nextInt()));
        }
        public static int fun(int n){
        if (n<10){
            return 1;
        }else{
            return 1+fun(n/10);
        }
        }
    }