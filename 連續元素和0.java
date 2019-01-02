import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int data[]=new int[n];
        int v1 = 0;
        String str ="";
        for (int i=0;i<n;i++){
            data[i] = scn.nextInt();
        }
        for (int i=0;i<n;i++){
            v1 = data[i];
            str = Integer.toString(data[i])+"\t";
            for (int j=i+1;j<n;j++){
                v1 = v1+data[j];
                str=str+Integer.toString(data[j])+"\t";
                if (v1==0){
                    System.out.println(str);
                }
            }
        }
    }
}
