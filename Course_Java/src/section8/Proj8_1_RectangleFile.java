package section8;

import section7.Rectangle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_1_RectangleFile {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangleList;
        rectangleList=new ArrayList<Rectangle>();
        fillArrayList(rectangleList);
        printRectangles(rectangleList);
    }
    public static void fillArrayList(ArrayList<Rectangle> rectangleAL)
    {
        Scanner infile;
        try {
            infile=new Scanner(new File("/home/imrans/Git Repos/Java-Assignments/Course_Java/src/section8/rectangle_data.txt"));
            Rectangle temp;
            double length;
            double width;
            while (infile.hasNext())
            {
                length=infile.nextDouble();
                width=infile.nextDouble();
                temp=new Rectangle(length,width);
                rectangleAL.add(temp);
            }

            infile.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void printRectangles(ArrayList<Rectangle> rectangleAL)
    {
        for(Rectangle r:rectangleAL)
        {
            System.out.println("length : "+r.getLength());
            System.out.println("width : "+r.getWidth());
            System.out.println("area : "+r.area());
            System.out.println("perimeter : "+r.perimeter());
            System.out.println();
        }
    }
}
