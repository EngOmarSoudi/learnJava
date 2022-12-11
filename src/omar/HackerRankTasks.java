package omar;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class HackerRankTasks {

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
//            long min = 0, max = 0;
//            int count=0;
//            for(int i = 0, j = c.length - 1; i < c.length - 1; i++, j--){
//                max = max + c[j];
//                min = min + c[i];
//            }
//            System.out.println(min + " " + max);
//            System.out.println(count);
    }

//        hacker rank task 3

    public void timeConversion (){
        String str;

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter Time");
        str=scanner.nextLine();
//        System.out.println(str);

        int h1 = (int)str.charAt(1) - '0';
        System.out.println(h1);
        System.out.println(h1 %10);
        int h2 = (int)str.charAt(0) - '0';
        System.out.println(h2);
        System.out.println(h2*10);
        int hh = (h2 * 10 + h1 % 10);
        System.out.println(hh);

        // If time is in "AM"
        if (str.charAt(8) == 'A')
        {
            if (hh == 12)
            {
                System.out.print("00");
                for (int i = 2; i <= 7; i++)
                    System.out.print(str.charAt(i));
            }
            else
            {
                for (int i = 0; i <= 7; i++)
                    System.out.print(str.charAt(i));
            }
        }

        // If time is in "PM"
        else
        {
            if (hh == 12)
            {
                System.out.print("12");
                for (int i = 2; i <= 7; i++)
                    System.out.print(str.charAt(i));
            }
            else
            {
                hh = hh + 12;
                System.out.print(hh);
                for (int i = 2; i <= 7; i++)
                    System.out.print(str.charAt(i));
            }
        }
    }
}
