import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
	    int data[ ]={2,5,8,6,87,98,54,65,87,9,0};
	    for (int i=0;i<10;i++){
	       if (data[i]>=n){
               System.out.println(data[i]);
        }
      }
    }
}
