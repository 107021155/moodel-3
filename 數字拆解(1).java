import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       fun(n);
    }
    public static void fun(int v1){
       String str="";
       while (v1>0){
           str=" "+Integer.toString(v1%10)+str;
           v1 = v1/10;
        }
        System.out.println(str);
    }
}
