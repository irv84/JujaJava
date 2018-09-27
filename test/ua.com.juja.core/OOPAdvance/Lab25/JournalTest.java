package ua.com.juja.core.OOPAdvance.Lab25;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class JournalTest {
    Journal journal=new Journal("Journal",100,"2018","12");

    @Test
    public void journalToPrintTest(){
        assertEquals("Journal{name=Journal,countPages=100,year=2018,number=12}", journal.toPrint());

}
}
