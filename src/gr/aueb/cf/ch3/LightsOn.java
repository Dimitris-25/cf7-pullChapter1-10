package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LightsOn {
    public static void main(String[] args) {
        final int CAR_MAX_SPEED = 100;
        Scanner in = new Scanner(System.in);
        boolean isDark = false;
        boolean isCarRunning = false;
        boolean isRaining = false;
        boolean areLightsOn = false;
        int carSpeed;

        System.out.println("Please insert if is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if is dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed");
        carSpeed = in.nextInt();

        isCarRunning = carSpeed > CAR_MAX_SPEED;
        areLightsOn = isRaining && (isDark || isCarRunning);
        // areLightsOn = (isRaining && isDark) || (isRaining && isCarRunning);

        System.out.println("Is lights on: " + areLightsOn);

    }
}
