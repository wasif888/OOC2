package assignment2;

public class Stamp_Coupling {

    public class Mobile
    {
        String processor;
        int ram;
        int camera_sensor;


        public Mobile(String processor,int ram,int camera_sensor)
        {
            this.processor=processor;
            this.ram=ram;
            this.camera_sensor=camera_sensor;
        }
    }

    public class Iphone
    {
        String processor;
        int ram;
        int camera_sensor;

        public Iphone(Mobile mobile,String processor,int ram,int camera_sensor)
        {
            this.processor= mobile.processor;
            this.ram=mobile.ram;
            this.camera_sensor= mobile.camera_sensor;
        }
    }
}
//A parameter of an object of Mobile class in passed into the constructor of Iphone class
//Iphone class is dependent on the instance of Mobile class.
// Any change in the Mobile class will have direct effect on the Iphone class.