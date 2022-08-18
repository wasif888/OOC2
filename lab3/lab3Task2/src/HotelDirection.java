public class HotelDirection {
    String Direction;
    public HotelDirection(String Direction)
    {
        Direction=this.Direction;
    }

    public void GetDirections(String Direction)
    {
        switch (Direction)
        {
            case "North":
                System.out.println("I am in North. Go to South");
                break;
            case "South":
                System.out.println("I am in South. Go to North");
                break;
            case "East":
                System.out.println("I am in East. Go to West");
                break;
            case "West":
                System.out.println("I am in West. Go to East");
                break;
        }

    }
}
