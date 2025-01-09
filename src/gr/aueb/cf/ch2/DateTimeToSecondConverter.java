package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

public class DateTimeToSecondConverter {
    public static void main(String[] args) {
        final int SEC_PER_DAY = 3600 * 24;
        final int SEC_PER_HOUR = 60 * 24;
        final int SEC_PER_MIN = 60;

        Scanner in = new Scanner(System.in);
        int inputDays;
        int inputMinutes;
        int inputHours;
        int inputSeconds;
        int totalSeconds = 0;


        System.out.println("Please insert days, hours, minutes, seconds: ");
        inputDays = in.nextInt();
        inputHours = in.nextInt();
        inputMinutes = in.nextInt();
        inputSeconds = in.nextInt();

        totalSeconds = inputDays * SEC_PER_DAY + inputHours * SEC_PER_HOUR + inputMinutes * SEC_PER_MIN + inputSeconds;


        System.out.printf(Locale.US,"Total seconds = %d", totalSeconds);




    }
}
