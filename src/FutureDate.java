public class FutureDate {
    String year;
    String month;
    String day;

    public void setdate(String y, String m, String d) {
        year = y;
        month = m;
        day = d;
    }

    public String addMonth(int month) {


        int cmonth = Integer.parseInt(this.month);
        int cyear = Integer.parseInt(this.year);

        cmonth = cmonth + month;
//        System.out.println(cmonth);
//        cyear = cyear  + cmonth /12;
//        System.out.println(cyear);
//        cmonth = cmonth % 12;
//        System.out.println(cmonth);
//        cmonth = cmonth + cmonth % 12;
        cyear = cyear + cmonth / 12;
        cmonth = cmonth % 12;

        String month1 = cyear + "/" + cmonth + "/" + day;
        return month1;
    }

    public String addDay(int day) {
        int cday = Integer.parseInt(this.day);
        int cmonth = Integer.parseInt(this.month);
        int cyear = Integer.parseInt(this.year);

        cday = cday + day;
        cmonth = cmonth + cday / 30;
        cyear = cyear + cmonth / 12;
        cday = cday % 30;
        cmonth = cmonth % 12;

//        cday = cday + day % 30;
//        day=day/30;
//        cmonth = cmonth + day % 12;
//        cyear = cyear + day/12;

        String day1 = (cyear + "/" + cmonth + "/" + cday);
        return day1;
    }

    public String  addYear(int year) {
        int cyear = Integer.parseInt(this.year);
        int cmonth = Integer.parseInt(this.month);
        int cday = Integer.parseInt(this.day);

        cyear = cyear + year;

        String year1 = (cyear + "/" + cmonth + "/" + cday);
        return year1;
    }
    public String  getDate() {


        String year1 = (year + "/" + month + "/" + day);
        return year1;
    }
}

