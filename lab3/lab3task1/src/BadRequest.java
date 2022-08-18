import java.util.Scanner;
import java.lang.String;
public class BadRequest {
    String ErrorRequest;
    public BadRequest(String ErrorRequest)
    {
        ErrorRequest=this.ErrorRequest;
    }
    public void FindErrorRequest(String  ErrorRequest)
    {
        switch (ErrorRequest)
        {
            case "C_400":
                System.out.println("Bad Request");
                break;
            case "C_401":
                System.out.println("Unauthorized");
                break;
            case "C-403":
                System.out.println("forbidden");
                break;
            case "C-404":
                System.out.println("Not found");
                break;
            case "C-408":
                System.out.println("Request Timeout");
                break;


        }
    }
}
