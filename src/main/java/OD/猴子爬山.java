package OD;

/**
 * @Author wanys
 * @Date 2023/3/28 15:42
 * @Version 1.0
 **/
public class 猴子爬山 {
    public static void main(String[] args) {
        //参数
        int step = 0;

        System.out.println(get(step));



    }
    //递归
    public static int get(int step){
        if (step < 3) {
            return 1;
        }
        return get(step-1)+get(step-3);
    }
}
