package assignment2;

import java.sql.SQLOutput;

public class Control_coupling {
    public class Spider{
        public int legs;

        public Spider() {
            this.legs = 8;
        }
    }
    public class Grasshopper{
        public int legs;

        public Grasshopper() {
            this.legs = 6;
        }
    }

    public class insects {
        int legs;

        public insects(int type)
        {
            switch (type)
            {
                case 1:
                    Spider spider=new Spider();
                    this.legs= spider.legs;
                    break;
                case 2:
                    Grasshopper grasshopper=new Grasshopper();
                    this.legs=grasshopper.legs;
                    break;
                default:
                    this.legs=0;

            }
        }
    }
}
//here insects controls the execution flow of the classes