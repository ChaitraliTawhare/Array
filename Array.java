import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];
        //int marks2[] = {1,2, 3,};
        //String fruits[] = {"mango","banana","graps"};
       

        //System.out.println(marks2[0]);
        //System.out.println(fruits[1]);

        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        int percentage = (marks[0] +marks[1] + marks[2])/3;
        System.out.println(percentage);
        // length of an array
        System.out.println("lenth of an array :" + marks.length);
    }

    
}
