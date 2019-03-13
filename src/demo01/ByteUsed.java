package demo01;

public class ByteUsed {
    public static void main(String[] args){
       // byte b=3;
        int b=3;

        b = b+3; //3默认是int型，所以不能通过编译，把byte改为大于int的就行
        System.out.println("b="+b);
    }
}
