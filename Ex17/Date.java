package Ex17;

public class Date {
    private int Day;
    private int Month;
    private int Year;
    public Date(int Day, int Month, int Year){
        this.Day=Day;
        this.Month=Month;
        this.Year=Year;
    }
    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }
    public void setDate(int Day, int Month, int Year){
        this.Day=Day;
        this.Month=Month;
        this.Year=Year;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", Day, Month, Year);
    }
}
