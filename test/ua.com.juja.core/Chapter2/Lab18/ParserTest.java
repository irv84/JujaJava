package ua.com.juja.core.Chapter2.Lab18;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {

        @Test
                public void testString() {
            assertEquals(123, Parser.eval("123"));
        }

    @Test
    public void testMultiple() {
        assertEquals(6, Parser.eval("2*3"));
    }

    @Test
    public void testWithBrackets() {
        assertEquals(8, Parser.eval("(1+3)*2"));
    }

    @Test
    public void testMore() {
        assertEquals(8, Parser.eval("((13/6)*2-5)+1"));
    }



}