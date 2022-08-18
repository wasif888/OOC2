import java.util.Scanner;

enum Position
{
    North,South,East,West;
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Direction:");
        Scanner sc=new Scanner(System.in);
        String Direction=sc.next();
        if(Position.valueOf(Direction)==Position.North)
        {
            System.out.println("I am in the postion "+Position.North+"I have to go to position "+Position.South);
        }
        else if(Position.valueOf(Direction)==Position.South)
        {
            System.out.println("I am in the postion "+Position.South+"I have to go to position "+Position.North);
        }
        else if(Position.valueOf(Direction)==Position.East)
        {
            System.out.println("I am in the postion "+Position.East+"I have to go to position "+Position.West);
        }
       else if(Position.valueOf(Direction)==Position.West)
        {
            System.out.println("I am in the postion "+Position.West+"I have to go to position "+Position.East);
        }

    }
}