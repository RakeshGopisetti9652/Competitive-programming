import java.util.*;
public class Brute_force{
    public static int maxSubArraySum(int arr[]){
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE; 
        for(int i=0;i<arr.length;i++){
            int start = i;
            

            for(int j=i;j<arr.length;j++){
                int end = j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    currsum+=arr[k];
                }
                if(maxSum<currsum){
                    maxSum=currsum;
                }
            }
        }
        return maxSum;
    }
    //maxsubarray_sum
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(maxSubArraySum(arr));
        sc.close();
    }
}