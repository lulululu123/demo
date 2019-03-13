package demo01;

public class Sum01 {
    public static void main(String[] args){
        int i= 1;
        double a=1;
        double b=2;
        double sum=0;
        while(i<21){
            sum = sum+b/a;
            if(i!=1){
                System.out.println("第"+(i-1)+"次相加的和为："+sum);
            }
            double temp = b;
            b = a+b;
            a = temp;
            i++;
        }
    }
}
