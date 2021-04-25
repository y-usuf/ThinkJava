
public class Date {

    public static void printAmerican(int date, String month, int year, String day){
        System.out.println("American Format:");
        System.out.println(day + ", " + month + " " + date + ", " + year + ".");
    }

    public static void printEuropean(String day, int date, String month, int year){
        System.out.println("European format:");
        System.out.println(day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {

        String day = "Monday";
        int date = 12;
        String month = "April";
        int year = 2021;

        printAmerican(date, month, year, day);
        printEuropean(day, date, month, year);


    }
}
