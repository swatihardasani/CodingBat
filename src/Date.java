public class Date {

    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int month, int day, int year){
       this.month = month;
       this.day = day;
       this.year = year;

       System.out.printf("Date object constructor for date %s%n", this);



    }

    public String toString(){
        return String.format("%d/%d/%d", month, day, year);

    }


}
