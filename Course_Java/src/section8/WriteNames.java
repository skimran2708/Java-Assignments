package section8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("imran");
        names.add("shaik");
        names.add("john");
        names.add("ram");
        names.add("shyam");
        try
        {
            PrintWriter pw = new PrintWriter("/home/imrans/Git Repos/Java-Assignments/Course_Java/src/section8/names.txt");
            for(String name:names)
            {
                pw.println(name);
            }
            pw.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
