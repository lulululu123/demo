package demo01;

/*四位数翻转*/
public class Test04 {
    public static void main(String[] args){
        int count=2352;
        int a=count%10;
        int b=count/10%10;
        int c=count/100%10;
        int d=count/1000;
        int temp=1000*a+100*b+10*c+d;
        System.out.println(temp);
    }

}
