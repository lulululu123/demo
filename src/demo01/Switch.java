package demo01;

/**
 * swich(x)直接到case x处运行
 * 有break就直接退出，没有就继续运行，直到完结
 * 如果没有匹配值，就运行default
 */
public class Switch {
    public static void main(String[] args){
        int x=4;
        int y=0;
        switch (6){
            case 1:
                y++;
            case 2:
                y++;
            case 3:
                y++;
            case 4:
                y++;
//                break;
            case 5:
                y++;
            default:
                y++;
        }
        System.out.println(y);
    }
}
