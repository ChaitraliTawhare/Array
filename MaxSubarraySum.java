import java.util.*;
public class MaxSubarraySum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sum(arr);
     }
     public static void sum(int arr[]){
        int sum =0;
        int maxsum= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k =i;k<=j;k++){
                    
                sum +=arr[k];
                   

                }
                System.out.println(sum);
                if(maxsum < sum){
                    maxsum =sum;
                }
                
            }
            System.out.println();
            
            
        }
        System.out.println("max sum is " + maxsum);
     }

}
