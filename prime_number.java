import java.util.Scanner;
public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        boolean a = true;
        for(int i =2;i<num;i++){
            if(num%i==0){
                a= false;
            }
        }
        System.out.println(a);
    }
}
