public class CalculateAge {
    String tyear = "1999";
    String tmonth = "11";
    String tday = "04";

    String year;
    String month;
    String day;

    public void setToday(String y, String m, String d) {
        year = y;
        month = m;
        day = d;
    }

    public String calYear() {
        int ageYear = Integer.parseInt(this.year) - Integer.parseInt(tyear);
        int ageMonth = Integer.parseInt(this.month) - Integer.parseInt(tmonth);
        if (ageMonth < 0){
            ageYear = ageYear - 1;
        }

        return "" + ageYear;
    }

    public String calMonth(){
        int ageMonth = Integer.parseInt(this.month) - Integer.parseInt(tmonth);
        int ageDay = Integer.parseInt(this.day) - Integer.parseInt(tday);
        if (ageDay < 0)
            ageMonth = ageMonth -1;
        if (ageMonth  < 0)
            ageMonth = 12 - (-ageMonth);
        return "" + ageMonth;
    }
    public String calDay(){
        int ageMonth = Integer.parseInt(this.month) - Integer.parseInt(tmonth);
        int ageDay = Integer.parseInt(this.day) - Integer.parseInt(tday);
        if (ageDay < 0)
            ageDay = 30 - (-ageDay);

        return "" +  ageDay;
    }
}
