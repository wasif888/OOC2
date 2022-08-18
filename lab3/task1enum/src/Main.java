import java.util.Scanner;

enum Badrequest{
    C_400,C_401,C_403,C_404,C_408;
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter code");
        Scanner sc=new Scanner(System.in);
        String request=sc.next();


        if(Badrequest.valueOf(request)==Badrequest.C_400)
        {
            System.out.println("Bad request");
        }
        else if(Badrequest.valueOf(request)==Badrequest.C_401)
        {
            System.out.println("unauthorized");
        }
        else if(Badrequest.valueOf(request)==Badrequest.C_403)
        {
            System.out.println("Forbidden");
        }
        else if(Badrequest.valueOf(request)==Badrequest.C_404)
        {
            System.out.println("Not found");
        }
        else if(Badrequest.valueOf(request)==Badrequest.C_408)
        {
            System.out.println("request timeout");
        }
    }
}