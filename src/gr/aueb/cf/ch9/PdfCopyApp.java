package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Αντιγραφει ενα pdf αρχειο (ως binary file)
 */

public class PdfCopyApp {
    public static void main(String[] args) {

        int b;
        int counter = 0;
        int start;
        long end;
        double elapsedTime = 0.0;

        try (FileInputStream fis = new FileInputStream("C:/tmp/dummy.pdf");
             FileOutputStream fos = new FileOutputStream("C:/tmp/dummy-out.pdf")) {
            start = (int) System.currentTimeMillis();
            while ((b = fis.read()) != -1) {
                fos.write(b);
                counter++;
            }
            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0;

            System.out.printf("To αρχειο με μεγεθος %.1fkb (%d bytes) αντιγραφηκε επιτυχως",
                    (counter / 1024.0), counter);
            System.out.println("Elapsed time: " + elapsedTime + "seconds");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}






