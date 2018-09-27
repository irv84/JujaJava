package ua.com.juja.core.OOPAdvance.Lab27;

public class Library {

    public String getIssueWithCountPagesMoreN(Issue[] catalog, int barrierCountPages) {
        String result="";
        if(catalog.length==0)return result;

        else for (Issue iss:catalog) {
            if(iss.getCountPages()>barrierCountPages)
            result+=iss.toPrint();
        }
        return result;
    }

}
