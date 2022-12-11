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
//        a.basics();
//        System.out.println("Mortgage: " + calc());
//        a.plusMinus();
        a.miniMaxSum();


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
        //hacker rank task
        public void plusMinus(){
            int number;
            double totalng =0,totalze=0,totalpu=0,dpu=0,dne=0,dze=0;
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter the number of elements you want to add");
            number=scanner.nextInt();
            int[] arry=new int[number+1];
            System.out.println("Enter the elements of the array: ");
            for (int i=0;i<number;i++){
                arry[i]=scanner.nextInt();
            }

//        System.out.print(arr.length);
            for (int j : arry) {
                int n = 0;

                if (j < 0) {

                    totalng++;
                    dne = totalng / arry.length;

                }
                if (j == 0) {

                    totalze++;
                    dze = (totalze-1) / arry.length;

                }
                if (j > 0) {

                    totalpu++;
                    dpu = totalpu / arry.length;
                }


            }
            System.out.println("plus "+dpu);
            System.out.println("negative "+dne);
            System.out.println("zero "+dze);
//            System.out.println(totalze);
//            System.out.println(totalng);
//            System.out.println(totalpu);
        }

//        hacker rank task 2
        public void miniMaxSum(){
            int number;

            Scanner scanner=new Scanner(System.in);
            System.out.println("enter the number of elements you want to add");
            number=scanner.nextInt();
            int[] c = new int[number];
            int[] arry1=new int[number];
            System.out.println("Enter the elements of the array: ");
            for (int i=0;i<number;i++){
                arry1[i]=scanner.nextInt();
            }
            System.out.println(Arrays.toString(arry1));
            c=arry1;
            Arrays.sort(c);
            System.out.println(Arrays.toString(c));
            long sum = 0;
            int min = c[0];
            int max = c[0];
            for(int i=0;i<c.length;i++){
                sum+=c[i];
                if(c[i]<min){
                    min = c[i];
                }
                if(c[i]>max){
                    max = c[i];
                }
            }
            System.out.println((sum-max)+" "+(sum-min));
            System.out.println(sum);
        }
//            long min = 0, max = 0;
//            int count=0;
//            for(int i = 0, j = c.length - 1; i < c.length - 1; i++, j--){
//                max = max + c[j];
//                min = min + c[i];
//            }
//            System.out.println(min + " " + max);
//            System.out.println(count);




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