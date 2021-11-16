package com.java.assignment4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class KycForm {

    private Date registrationDate;
    private Date currentDate;

    private void printRange(Date beforeDate, Date afterDate, Calendar calender, int currentYear){

        String result1;
        String result2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Calendar beforeDateCalender = Calendar.getInstance();
        Calendar registrationDateCalender = Calendar.getInstance();

        beforeDateCalender.setTime(beforeDate);
        registrationDateCalender.setTime(registrationDate);

        int beforeDateYear = beforeDateCalender.get(Calendar.YEAR);
        int regDateYear = registrationDateCalender.get(Calendar.YEAR);


        // this condition is for when current date is falling before 30 days before registration date anniversary.
        if(currentDate.before(beforeDate) || currentDate.equals(beforeDate)){
            if(regDateYear == (beforeDateYear - 1) || regDateYear == currentYear){
                System.out.println("No Range");
                return;
            }
            calender.set(Calendar.YEAR, currentYear - 1);
            result1 = simpleDateFormat.format(beforeDate);
            result2 = simpleDateFormat.format(afterDate);
            System.out.println(result1 + " " + result2);
        }

        // this condition if for when current date is falling after registration but before 30 days after
        // registration date anniversary.
        else if(currentDate.before(afterDate)){
            result1 = simpleDateFormat.format(beforeDate);
            result2 = simpleDateFormat.format(currentDate);
            System.out.println(result1 + " " + result2);
        }

        // this is for when current date is falling after 30 days of registration day anniversary.
        else{
            result1 = simpleDateFormat.format(beforeDate);
            result2 = simpleDateFormat.format(afterDate);
            System.out.println(result1 + " " + result2);
        }

    }


    public void dateFormat(String rd, String cd) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calender = Calendar.getInstance();
        Calendar calender1 = Calendar.getInstance();

        calender.setTime(simpleDateFormat.parse(rd));
        this.registrationDate = calender.getTime();

        calender1.setTime(simpleDateFormat.parse(cd));
        this.currentDate = calender1.getTime();

        int currentYear = calender1.get(Calendar.YEAR);

        //Base Case : when current date is before 1st anniversary or within same year of sign up.
        if(calender1.get(Calendar.YEAR) - 1900 == calender.get(Calendar.YEAR) - 1900){
            System.out.println("No Range");
            return;
        }

        calender.set(Calendar.YEAR, currentYear);

        // before registration date
        calender.add(Calendar.DATE, -30);
        Date beforeDate = calender.getTime();


        // after registration date +30 days
        calender.add(Calendar.DATE, 60);
        Date afterDate = calender.getTime();

        printRange(beforeDate, afterDate, calender, currentYear);

    }
}