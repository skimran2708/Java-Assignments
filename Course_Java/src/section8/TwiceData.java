package section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        Scanner infile;
        PrintWriter pw;
        try {
            infile=new Scanner(new File("/home/imrans/Git Repos/Java-Assignments/Course_Java/src/section8/nums.txt"));
            pw=new PrintWriter("/home/imrans/Git Repos/Java-Assignments/Course_Java/src/section8/twice_nums.txt");
            int input;
            while (infile.hasNext())
            {
                input=infile.nextInt();
                input*=2;
                pw.println(input);
            }
            infile.close();
            pw.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
