import java.util.Scanner;
public class Sum_of_even_and_odd_numbers_from_a_number{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt();
        int evenSum=0;
        int oddSum=0;
        while(num>0){
            int digit=num%10;
            if(digit%2==0){
                evenSum+=digit;
            }
            else{
                oddSum+=digit;
            }
            num=num/10;
        }
        System.out.println("Sum of Even Digits:"+evenSum);
        System.out.println("Sum of Odd Digits:"+oddSum);
    }
}