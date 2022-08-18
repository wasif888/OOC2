import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sc=new Scanner(System.in);

        String Input=sc.next();
        ExceptionHandler exception=new ExceptionHandler(Input);
        try {
            exception.findexception(Input);
        }
        catch (Exception e) {
          System.out.println("not eligible");
        }
    }
}