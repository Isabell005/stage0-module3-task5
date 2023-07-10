package lang.print.gaps.task5;

import java.util.Scanner;

public class TimeConvertor {
    public void convert(float minutes) {

        float min,sec;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Minutes");

        min=sc.nextFloat();
        sec=min*60;

        System.out.println("Seconds: "+sec);

    }
}
