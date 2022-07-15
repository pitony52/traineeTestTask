package ru.yandex;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class WithProblemsTests {

    private final static String bd = "pui";

        @Test
        public void equalsOneToOne(){
            assertEquals("1", "1");
        }


        @Test
        public void assignValueToConstVar(){
            String CONST = "newValue";
            assertEquals("newValue", CONST);
        }


        @Test
        public void equalsOneToOneX(){
            assertEquals(1, 1);
        }

    @Test
    public void stringsMustBeEquals(){
        String res = "a";

            if (bd.equals(new String("pui"))) {
                res = "asd";
            }

        assertEquals("asd", res);
    }

    @Test
    public void successfullyRemovingFirstElementFromList(){
        ArrayList<String> sourceData = new ArrayList<String>(Arrays.asList("1", "viskas", "chupocabra"));
        sourceData.remove(0);
        assertFalse(sourceData.contains("1"));
    }

}

