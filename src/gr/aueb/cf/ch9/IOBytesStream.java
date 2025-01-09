package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOBytesStream {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("C:/tmp/tmp2/logo.png");
             FileOutputStream out = new FileOutputStream("C:/tmp/tmp2/logoCopy.png");){
            int b, count=0;
            while ((b = in.read()) != -1) {
                out.write(b);
                count++;
            }
            System.out.printf("To arxeio me megethos %d kbytes (%d bytes) antigrafike", count/1024, count);



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
