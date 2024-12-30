import java.util.Arrays;
import java.util.Collections;
public class InbuildSort {
    public static void main(String args[]){
        Integer arr[]={4,6,2,8,5};
        Arrays.sort(arr , Collections.reverseOrder());
        
        printarr(arr);
    }
    public static void printarr(Integer arr[]){
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
