import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int data[]=new int[n];
        int maxval = Integer.MIN_VALUE,v1=0;
        for (int i=0;i<n;i++){
            data[i] = scn.nextInt();
        }
        for (int i=0;i<n;i++){
            v1 = data[i];
            for (int j=i+1;j<n;j++){
                v1 = v1*data[j];
                if (v1>maxval){
                    maxval = v1;
                }
            }
        }
        System.out.println(maxval);
    }
}
