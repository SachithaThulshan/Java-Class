public class Test1 {
    public static void main(String[] args) {
        FutureDate futureDate = new FutureDate();
        futureDate.setdate("2023","10","25");
        System.out.println(futureDate.addYear(10));
        System.out.println(futureDate.addMonth(2));
        System.out.println(futureDate.addDay(659));
        System.out.println(futureDate.getDate());
    }
}

//d = "2023/40/43"
//String a[] = d.split("/")