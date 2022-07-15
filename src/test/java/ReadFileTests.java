import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileTests {

    @Test
    public void secondLineShouldHabAlloha(){
        //write here second task
        try (FileReader reader = new FileReader("ReadFileTests.txt");
             BufferedReader br = new BufferedReader(reader)) {
            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals("аллоха")) {
                    System.out.println("да, есть такое слово аллоха!");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
