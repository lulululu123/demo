package demo01;

public class Score {
    public static void main(String[] args){
        int score=182;
        int temp=0;
        if(score>=90&&score<=100){
            temp=1;
        }else if(score>=70&&score<=89){
            temp=2;
        }else if(score>=60&&score<=69){
            temp=3;
        }else if(score>=0&&score<60){
            temp = 4;
        }
        switch (temp){
            case 4:
               System.out.println("不及格");
               break;
            case 3:
                System.out.println("及格");
                break;
            case 2:
                System.out.println("良好");
                break;
            case 1:
                System.out.println("优秀");
                break;
            default:
                System.out.println("输入错误成绩");
        }
    }
}
