package assignment2;

public class Independence {

    public interface human
    {
        public void race();
    }

    public class Asian implements human
    {

        @Override
        public void race() {
            System.out.println("I am asian");
        }
    }
    public class African implements human
    {

        @Override
        public void race() {
            System.out.println("I am African");
        }
    }
    public class European implements human
    {

        @Override
        public void race() {
            System.out.println("I am European");
        }
    }
}
//this is an example of independent coupling