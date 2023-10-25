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









//        if (month >= 12) {
//            year += month / 12;
//        }
//        else
//            month = month % 12;
//        if ( day >= 30) {
//            month += day / 30;
//
//        }
//        else {
//            day = day % 30;
//
//        }
//    }
//    public String getDate(){
//
//        String futureDates = String.valueOf(year)+ String.valueOf(month) + String.valueOf(day);
//        return futureDates;
//    }
//}
////class Test{
////    public static void main(String[] args) {
////        FutureDate futureDate = new FutureDate();
////        futureDate.setDate(0,0,25);
////        System.out.println(futureDate.getDate());
////    }
////}
