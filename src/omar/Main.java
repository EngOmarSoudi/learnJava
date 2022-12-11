package omar;

import java.awt.*;
import java.sql.Array;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        LearnBasics a = new LearnBasics();
        HackerRankTasks task=new HackerRankTasks();

//        a.basics();
//        System.out.println("Mortgage: " + calc());
//        task.plusMinus();
//        task.miniMaxSum();
        task.timeConversion();


    }
    public static class LearnBasics{
        public void basics(){
            int age = 25;
            Date now = new Date();
            Point point1 = new Point(1,2);
            Point point2 = point1;
            point1.x=3;
            int[] myArray={1,2};
            System.out.println(Arrays.toString(myArray) );
            //input
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter your name : ");
            String name = scanner.nextLine().trim();
            System.out.print("Enter your age : ");
            age = scanner.nextInt();
            System.out.println("you are : "+name + "your age is " + age);


            System.out.println("Hello ali your age is "+ age+" " + now+" " + point2);
        }

    }

    public static String calc(){
        final byte MONTHS_IN_YEAR=12;
        final byte PERCENT=100;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Principle: ");
        int principle= scanner.nextInt();
        System.out.print("Enter Annual Interest Rate: ");
        double interestRate = scanner.nextDouble();
        double monthlyInterestRate=interestRate/MONTHS_IN_YEAR/PERCENT;
        System.out.print("Enter Period (Years): ");
        int years = scanner.nextInt();
        int numberOfPayment=years*MONTHS_IN_YEAR;
        double mortage= principle
             *(monthlyInterestRate *Math.pow(1+monthlyInterestRate,numberOfPayment))
             /(Math.pow(1+monthlyInterestRate,numberOfPayment)-1);
        String mortageFormatted= NumberFormat.getCurrencyInstance().format(mortage);
        return mortageFormatted;
    }

   //hacker rank task
}