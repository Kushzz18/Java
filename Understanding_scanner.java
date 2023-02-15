import java.util.Scanner;
public class Understanding_scanner{
    public static void main(String[] a){
        //String name = "Kushal";
        System.out.println("Enter your name: ");
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        System.out.println("My name is " + name);
    }
}