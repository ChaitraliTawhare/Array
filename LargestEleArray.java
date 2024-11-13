import java.util.*;
public class LargestEleArray {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int array[]=new int[5];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
           
        }

        

        int number =Largest(array);
        System.out.println(number);

    }
    public static int Largest(int array[]){
        int largest =Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                largest=array[i];
            }
        }


        return largest;
    }

}
