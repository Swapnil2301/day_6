import java.util.Scanner;
public class perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num = sc.nextInt();
        int sum  = 0;
        for(int i = 1;i< num;i++){
            if(num % i ==0){
                sum = sum + i;
            }
        }
        if(sum==num){
            System.out.println("Number is perfect number");
        }
        else{
            System.out.println("Number is not perfect");
        }


    }
}
