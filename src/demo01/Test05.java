package demo01;

/*n!>1000,求n*/
public class Test05 {
    public static void main(String[] args){
        int i;
        int sum=0;
        for(i=1;;i++){
            sum = sum+i;
            if(sum>10000)

                break;
        }
        System.out.println(i);
        System.out.println(sum);
    }
}
