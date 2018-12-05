import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int data[] = new int[n];
        for (int i=0;i<n;i++){
            data[i] = scn.nextInt();
        }
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (data[i]<data[j]){
                    int val = data[i];
                    data[i] = data[j];
                    data[j] = val;
                }
            }
        }
        for (int k=0;k<data.length;k++){
            System.out.println(data[k]);
        }
      }
    }
