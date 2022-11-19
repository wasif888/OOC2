package assignment2;

public class data_coupling {

    public class Fitness_Index
    {
        public float BMI_Calculator(float weight,float  height)
        {
            return weight/(height*height);//height should be in meters
        }
        public float weight_to_loose(float weight,float height)
        {
            return weight-((height*height)*24);
        }
    }
    public class Fitness_Calculator
    {
        Fitness_Index fitness_index=new Fitness_Index();
        public void SeeBMI(float weight,float height)
        {
            System.out.println(fitness_index.BMI_Calculator(weight,height));
        }
        public void See_weight_to_loose(float weight,float height)
        {
            System.out.println(fitness_index.weight_to_loose(weight,height));
        }
    }
}

//Fitness_calculator class passes important data to Fitness_index class