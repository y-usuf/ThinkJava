public class Time {
    public static void main(String[] args) {
        int hour = 0;
        int minute = 15;
        int second = 45;

        // Number of seconds since midnight.
        int timeAfterMidnight = ((hour * 3600) + (minute * 60) + second);
        System.out.println("Time after midnight in seconds: " + timeAfterMidnight);

        // Number of seconds remaining in the day.
        int secondsRemaining = ((24 * 3600) - timeAfterMidnight);
        System.out.println("Number of seconds remaining in the day: " + secondsRemaining);

        // Percentage of the day that has passed.
        double dayPassed = ((double) (timeAfterMidnight) * 100) / (24.0 * 3600.0);
        System.out.println(dayPassed + "% of the day has passed.");

        // Elapsed time since working on this code
        int currentHour = 0;
        int currentMinute = 27;
        int currentSecond = 15;

        int currentTimeAfterMidnight = ((currentHour * 3600) + (currentMinute * 60) + currentSecond);
        int elapsedTime = (currentTimeAfterMidnight - timeAfterMidnight);
        System.out.println(elapsedTime + (" Seconds have passed since I started working on this exercise"));
    }
}
