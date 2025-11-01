import java.util.Scanner;
public class Armstrong_number {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int originalNum=num;
        int sum=0;
        int digits=0;
        int n=num;
        while(n!=0){
            n/=10;
            digits++;
        }
        while(num!=0){
            int digit=num%10;
            sum+=Math.pow(digit,digits);
            num/=10;
        }
        if(sum==originalNum){
            System.out.println(originalNum+" is a Armstrong Number.");
        }
        else{
            System.out.println(originalNum+" is not a Armstrong Number.");
        }
    }
}
