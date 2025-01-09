package gr.aueb.cf.ch9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class AutoFlushApp {
    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/autoflush-file.txt"),true))
        {ps.println("Hello");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
