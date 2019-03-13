package demo01;

public class Test02 {
    public static void main(String[] args){
        int i=1;
        System.out.print("1000以内可以被3又被7整除的数：");
        for(i=0;i<1001;i++) {
            if (i%3==0&&i%7==0) {
                System.out.print(i+" ");
            }
        }
    }
}
