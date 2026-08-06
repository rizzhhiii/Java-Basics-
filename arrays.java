import java.util.*;

public class arrays{
    public static void main(String args[]){

        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);


        marks[0] =sc.nextInt();
        marks[1] =sc.nextInt();
        marks[2] =sc.nextInt();
       
       System.out.println("Physics:" + marks[0]);
       System.out.println("Maths:" + marks[1]);
       System.out.println("Chemistry:" + marks[2]);
    
        marks[2] = marks[2] + 1;
    System.out.println("Chemistry:" + marks[2]);

    int percentage = (marks[0] + marks[1] + marks[2])/3;
    System.out.println("The Percentage is" + percentage + "%");
    



    }
}