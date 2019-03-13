package demo01;

public class Score02 {
    public static void main(String[] args){
        int score,temp;
        score=92;
        if(score==100)
            temp=9;
        else
            temp=8;
        switch (temp){
            case 0: case 1: case 2:case 3: case 4: case 5:
                System.out.println("不及格");
                break;
            case 6:
                System.out.println("及格");
                break;
            case 7: case 8:
                System.out.println("良好");
                break;
            case 9:
                System.out.println("优秀");
                break;
            default:
                System.out.println("输入错误成绩");
        }

    }
}
