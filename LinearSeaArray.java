import java.util.*;
public class LinearSeaArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int array[] = new int[3];
        System.out.println("enter elements of an array : ");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();

        }

        System.out.print("enter a key which you want to search : ");
        int key =sc.nextInt();
       

      int index =searchKey(array, key);
      if(index==-1){
        System.out.println("not found ,key is not there in array ");
      }
      else{
        System.out.println(index);
      }
        


    }
    public static int searchKey(int array[],int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
         return -1;

       
    }

}
