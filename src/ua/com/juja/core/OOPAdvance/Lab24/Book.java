package ua.com.juja.core.OOPAdvance.Lab24;

class Book extends Issue {
    private String authorBook;

    public Book(String name, int countPages, String authorBook) {
        super(name, countPages);
        this.authorBook=authorBook;
        }

    public String toPrint() {
        return "Book{"+super.toPrint()+",author=" + authorBook+"}";
    }


}

