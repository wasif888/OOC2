package Assignment1;

public class Next_day_date_generator {
    private int day;
    private int month;
    private int year;

    //constructor
    public Next_day_date_generator(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //getter & setters for day

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    //getter & setters for month

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    //getter & setters for year

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public boolean leap_year_checker(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean february_checker(int month) {
        if (month == 2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean December_checker(int month) {
        if (month == 12) {
            return true;
        } else {
            return false;
        }
    }

    public boolean month_checker_31days(int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month==12) {
            return true;
        } else {
            return false;
        }
    }

    //day checkers

    public boolean checker_for_30th_day(int day) {
        if (day == 30) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checker_for_31th_day(int day) {
        if (day == 31) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checker_for_28th_day(int day) {
        if (day == 28) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checker_for_29th_day(int day) {
        if (day == 29) {
            return true;
        } else {
            return false;
        }
    }


    public String Date_generator(int day, int month, int year) {

        String date;
       if(month_checker_31days(month))
       {
           if(December_checker(month)) {
               if (checker_for_31th_day(day)) {
                   day = 1;
                   month = 1;
                   year++;
               } else {
                   day++;
               }
           }
           else
           {
               if(checker_for_31th_day(day))
               {
                   day=1;
                   month++;
               }
               else
               {
                   day++;
               }
           }
       }
       else
       {
           if(february_checker(month))
           {
               if(leap_year_checker(year)) {
                   if (checker_for_29th_day(day)) {
                       day = 1;
                       month++;
                   } else {
                       day++;
                   }
               }
               else
               {
                   if(checker_for_28th_day(day))
                   {
                       day=1;
                       month++;
                   }
                   else
                   {
                       day++;
                   }
               }
           }
           else
           {
               if(checker_for_30th_day(day))
               {
                   day=1;
                   month++;
               }
               else
               {
                   day++;
               }
           }
       }


        date="The next day is: "+day+"."+month+"."+year;
       return date;

    }
}
