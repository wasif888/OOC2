import java.util.*;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Code:");
        Scanner sc=new Scanner(System.in);
        String requestNumber= sc.next();
        BadRequest badrequest=new BadRequest(requestNumber);
        badrequest.FindErrorRequest(requestNumber);




    }
}