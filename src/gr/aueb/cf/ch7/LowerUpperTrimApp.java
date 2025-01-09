package gr.aueb.cf.ch7;

public class LowerUpperTrimApp {
    public static void main(String[] args) {
        String s = "   Athens University of Economics and Business   ";
        String lowercase;
        String upperCase;
        String trimmed;

        lowercase = s.toLowerCase();
        upperCase = s.toUpperCase();
        trimmed = s.trim();

        System.out.printf("Lexeme: %s, Lowercase: %s\n", s,lowercase);
        System.out.printf("Lexeme: %s, Uppercase: %s\n",s, upperCase);
        System.out.printf("Lexeme: %s, Trimmed: %s\n", s,trimmed);

    }
}
