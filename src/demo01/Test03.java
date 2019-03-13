package demo01;

/*100以内的质数，5个一行*/
public class Test03 {
    public static void main(String[] args){
      int i,j;
      int k=0;
      for(i=2;i<101;i++){
          for (j=2;j<=i;j++){
              if(i%j==0)
                  break;
          }
          if (i==j) {
              System.out.print(i + " ");
              k++;
              if (k % 5 == 0)
                  System.out.println();
          }
      }
    }
}
