import java.util.Scanner;
public class CountEven_and_CountOdd_Numbers_in_Array {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int countEven=0;
        int countOdd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }
        }
        System.out.println("Total Even Numbers:"+countEven);
        System.out.println("Total Odd Numbers:"+countOdd);
    }
}
