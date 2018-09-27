package ua.com.juja.core.OOPAdvance.Lab26;

public class Library {

    public String printCatalog(Issue[] catalog) {
        String result="";
        if(catalog.length==0)return result;

        else for (Issue iss:catalog) {
            result+=iss.toPrint();
        }
        return result;
    }

}