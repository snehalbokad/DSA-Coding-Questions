import java.util.Scanner;
public class Count_Negative_Numbers_in_Array {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int countNegative=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                countNegative++;
            }
        }
        System.out.println("Number od negative numbers in array:"+countNegative);
    }
}
