import java.util.Scanner;
public class input{
    public static void main(String[] args){
        //String name = "Kushal";
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a= obj.nextInt();  
        System.out.println("Enter 2nd number: ");
        int b= obj.nextInt(); 
        int c= a*b;
        System.out.println("The multiple of number is " + c);
    }
}