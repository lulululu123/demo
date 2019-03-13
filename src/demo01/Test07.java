package demo01;

import java.util.Scanner;

/*输入某个月，显示出当月的天数*/
public class Test07 {
   public static void main(String[] args){
       int month,days;
       Scanner sc = new Scanner(System.in);
       System.out.print("month? ");
       month = sc.nextInt();
       if(month>12 || month<1){
           System.out.print("error data");
           System.exit(0);
       }
       switch (month){
           case 4:case 6: case 9:case 11:
               days = 30;
               break;
           case 2:
               int year = sc.nextInt();
               System.out.print("year? ");
               if(year%400==0 || year%4==0 && year%100!=0)
                   days = 29;
               else
                   days = 28;
               break;
           default:
               days = 31;
       }
       System.out.print("days:"+days);
   }
}
