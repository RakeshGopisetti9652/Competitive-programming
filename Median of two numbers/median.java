import java.util.*;
public class median
{
	public static void medianofarrays(int arr1[],int arr2[],int n1,int n2){
        int ans[] = new int[n1+n2];
        for(int i=0;i<arr1.length;i++){
            ans[i]=arr1[i];
        }
        
        for(int j=0;j<arr2.length;j++){
            ans[j+arr1.length]=arr2[j];
        }
        Arrays.sort(ans);
        if(ans.length%2==0){
            int a1=(0+ans.length-1)/2;
            int a2=a1+1;
            int a3=(ans[a1]+ans[a2])/2;
            System.out.print("Median:"+a3);
        }else{
            int a4=(0+ans.length-1)/2;
            System.out.print("Median:"+ans[a4]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sizes of two arrays:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        System.out.println("Enter the elements into array1:");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements into array2:");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        medianofarrays(arr1,arr2,n1,n2);
        sc.close();
    }
}