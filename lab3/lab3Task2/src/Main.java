import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the Direction:");
        Scanner sc=new Scanner(System.in);
        String direction=sc.next();
        HotelDirection hoteldirection=new HotelDirection(direction);
        hoteldirection.GetDirections(direction);


    }
}