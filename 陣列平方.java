import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      String strData[] = scn.nextLine().split("");
      int data[] = new int[strData.length];
      for (int i=0;i<strData.length;i++){
          data[i] = Integer.parseInt(strData[i]);
      }
      fun(data);
    }
    public static void fun(int[]data1){
      for (int i=0;i<data1.length;i++){
          System.out.print((data1[i]*data1[i]+"\t"));
        }
    }
}
