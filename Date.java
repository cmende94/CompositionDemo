public class Date{
    //variables should be private unless they need to be public
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString(){
        return month + "/" + day + "/"+ year;
    }

}