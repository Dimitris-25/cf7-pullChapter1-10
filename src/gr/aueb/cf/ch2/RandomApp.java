package gr.aueb.cf.ch2;

public class RandomApp {
    public static void main(String[] args) {

        int die1 = (int) (Math.random() * 6) + 1;
        int die2 = (int) (Math.random() * 6) + 1;
        int numToPlayDie1 = die1;
        int numToPlayDie2 = die2;

        System.out.println("Its your turn to play, your die1 = " + numToPlayDie1 + " " + ", " + "your die2 = " +  numToPlayDie2);

    }







}
