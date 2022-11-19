import Assignment1.Next_day_date_generator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Nex_date_test {
    @Test
    void Day_Test(){
        Next_day_date_generator nextdaygenerator=new Next_day_date_generator(31,12,2022);
        String expected="The next day is: 1.1.2023";
        assertEquals(expected,nextdaygenerator.Date_generator(nextdaygenerator.getDay(), nextdaygenerator.getMonth(), nextdaygenerator.getYear()));
    }
    @Test
    void Month_Test(){
        Next_day_date_generator nextdaygenerator=new Next_day_date_generator(30,9,2022);
        String expected="The next day is: 1.10.2022";
        assertEquals(expected,nextdaygenerator.Date_generator(nextdaygenerator.getDay(), nextdaygenerator.getMonth(), nextdaygenerator.getYear()));
    }
    @Test
    void leap_year_test(){
        Next_day_date_generator nextdaygenerator=new Next_day_date_generator(29,2,2024);
        String expected="The next day is: 1.3.2024";
        assertEquals(expected,nextdaygenerator.Date_generator(nextdaygenerator.getDay(), nextdaygenerator.getMonth(), nextdaygenerator.getYear()));
    }
    @Test
    void nonleap_year_february_test(){
        Next_day_date_generator nextdaygenerator=new Next_day_date_generator(28,2,2022);
        String expected="The next day is: 1.3.2022";
        assertEquals(expected,nextdaygenerator.Date_generator(nextdaygenerator.getDay(), nextdaygenerator.getMonth(), nextdaygenerator.getYear()));
    }
    @Test
    void day_test(){
        Next_day_date_generator nextdaygenerator=new Next_day_date_generator(28,5,2022);
        String expected="The next day is: 29.5.2022";
        assertEquals(expected,nextdaygenerator.Date_generator(nextdaygenerator.getDay(), nextdaygenerator.getMonth(), nextdaygenerator.getYear()));
    }


}
