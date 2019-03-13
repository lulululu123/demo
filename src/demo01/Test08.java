package demo01;

public class Test08 {
    public static void main(String[] args){
        final int n=10;
        int i,j;
        int temp=0;
        int a[]={20,10,50,40,30,70,60,80,90,100};
        System.out.println("The Source Data");
        int min=a[0];
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("min:"+min);
        for(i=0;i<n-1;i++){
            if(min>a[i]) {
                temp = a[i];
                System.out.println("a[i]:" + a[i] + "," + "temp:" + temp);
                a[i] = min;
                min = temp;
            }
        }
        System.out.print("min:"+min);

    }
}
