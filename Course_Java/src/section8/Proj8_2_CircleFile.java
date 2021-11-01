package section8;

import section7.Circle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_2_CircleFile {
    public static void main(String[] args) {
        ArrayList<Circle> circleList;
        circleList=new ArrayList<>();
        fillArrayList(circleList);
        printArrayList(circleList);

    }
    private static void fillArrayList(ArrayList<Circle> circleAL)
    {
        Scanner infile;
        try {
            infile=new Scanner(new File("/home/imrans/Git Repos/Java-Assignments/Course_Java/src/section8/circle_data.txt"));
            Circle temp;
            double radius;
            while (infile.hasNext())
            {
                radius=infile.nextDouble();
                temp=new Circle(radius);
                circleAL.add(temp);
            }

            infile.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

    }
    private static void printArrayList(ArrayList<Circle> circleAL)
    {
        PrintWriter pw;
        try {
            pw=new PrintWriter("/home/akhipsm/Desktop/zemoso/java/course/section8/circles_output.txt");
            for(Circle c:circleAL)
            {
                System.out.println("radius : "+c.getRadius());
                System.out.println("circumference : "+c.circumference());
                System.out.println("area : "+c.area());
                System.out.println();

                pw.println("radius : "+c.getRadius());
                pw.println("circumference : "+c.circumference());
                pw.println("area : "+c.area());
                pw.println();

            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
