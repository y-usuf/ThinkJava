import java.util.Scanner;

public class SecondsConversion {
    public static void main(String[] args){

        int sec, min, hours, timeSec;

        Scanner in = new Scanner(System.in);

        // Prompt user to input time in seconds and store it in sec
        System.out.print("Please input time in seconds: ");
        timeSec = in.nextInt();

        // Calculating the results and displaying
        hours = timeSec / 3600;
        min = (timeSec % 3600) / 60;
        sec = (timeSec % 3600) % 60;
        System.out.printf("%d seconds = %d hours, %d minutes, %d seconds.", timeSec, hours, min, sec);
    }
}
