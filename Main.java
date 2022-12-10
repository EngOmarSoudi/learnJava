package omar;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


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
        String c ;
        c= calc();
        System.out.println("Mortgage: " + c );

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
    public void plusMinus(){
        int[] arr={-4 ,3, -9, 0, 4, 1}; double totalng =0,totalze=0,totalpu=0,dpu=0,dne=0,dze=0;
//        System.out.print(arr.length);
        for (int i=0;i<arr.length;i++){
            int n = 0;

            if (arr[i]<0){

                totalng++;
                dne =totalng / arr.length;

            }
            if(arr[i]==0){

                totalze++;
                dze =totalze/ arr.length;

            }
            if(arr[i]>0){

                totalpu++;
                dpu =totalpu/ arr.length;
            }


        }
        System.out.println("pus "+dpu);
        System.out.println("neg "+dne);
        System.out.println("zero "+dze);
    }
}