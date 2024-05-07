import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the n number required: ");
        int user_i = sc.nextInt();
        int a =0;
        int b = 1;
        for(int i =0;i<user_i;i++){
            System.out.print(a+" ");
            int temp =a;
            a=b;
            b=temp+b;
        }
    }
}
