import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        for (int i=0;i<n;i++){
            String strData[]=scn.nextLine().split(" ");
            int m = strData.length;
            int data[] = new int[m];
            for (int j=0;j<m;j++){
                switch (strData[j].charAt(0)) {
                    case 'C':
                        data[j] = 0;
                        break;
                    case 'D':
                        data[j] = 13;
                        break;
                    case 'H':
                        data[j] = 26;
                        break;
                    case 'S':
                        data[j] = 39;
                        break;
                }
                data[j] = data[j] + Integer.parseInt(strData[j].substring(1));
            }
            for (int j=0;j<m;j++){
                for (int k=j+1;k<m;k++){
                    if (data[j]>data[k]){
                        int tmp = data[j];
                        data[j] = data[k];
                        data[k] = tmp;
                        String strtmp = strData[j];
                        strData[j] = strData[k];
                        strData[k] = strtmp;
                    }
                }
                System.out.println(strData[j]+"\t");
            }
        }
    }
}
