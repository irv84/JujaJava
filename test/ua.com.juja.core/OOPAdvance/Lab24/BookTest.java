package ua.com.juja.core.OOPAdvance.Lab24;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book=new Book("TestNameBook",100,"TestBookAuthor");

    @Test
    public void bookToStringTest(){
        assertEquals("Book{name=TestNameBook,countPages=100,author=TestBookAuthor}", book.toPrint());
    }

}
