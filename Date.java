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

    public int getDay() {return day;}
    public int getMonth() {return month;}
    public int getYear() {return year;}

    public String toISOString(){
        if(month < 10 && day > 10){
            return year + "-0" + month + "-0" + day;
        }
        else if(month < 10){
            return year + "-0" + month + "-" + day;
        }
        else if(day < 10){
            return year + "-" + month +"-0" + day;
        }
        else{
            return year + "-" + month + "-" + day;
        }
    }

    

    public String toString(){
        return month + "/" + day + "/"+ year;
    }

}