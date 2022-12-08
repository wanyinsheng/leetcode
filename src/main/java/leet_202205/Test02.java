package leet_202205;

/**
 * @Author wanys
 * @Date 2022/5/20 12:21 AM
 * @Version 1.0
 **/
public class Test02 {
    public static void main(String[] args) {
        System.out.println(4%2.0==0);
//        System.out.println(1&2);
//        System.out.println(2&2);
        int num=78933;
        method(2);
        System.out.println();

        method(3);
        System.out.println();
        System.out.println(~3);
        method(~3);

    }
    public static void method(int num){
        for (int i = 31; i >=0 ; i--) {
            System.out.print((num&(1<<i))==0?0:1);
        }


    }
}
