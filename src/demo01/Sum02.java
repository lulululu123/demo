package demo01;

public class Sum02 {
    public static void main(String[] args){
        int i =1;
        double a=1;
        double b=2;
        double sum=0;
        for(i=1;i<21;i++){
            sum = sum+b/a;
            double temp=b;
            b = a+b;
            a = temp;
            if(i!=1){
                System.out.println("第"+(i-1)+"次相加的和为："+sum);
            }
        }
    }
}
