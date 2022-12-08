package leet_202205;

/**
 * @Author wanys
 * @Date 2022/5/20 7:23 AM
 * @Version 1.0
 **/
public class Rand10 {
    public int rand10() {
        int num=f1();
        if(num<=10)
            return num;
        return rand10();

    }

    public int f1() {
        //0000~1111等概率
        return f()<<3+f()<<2+f()<<1+f();

    }



    public int f(){
        if(rand7()<=3) return 0;
        if(rand7()>=5) return 1;
        //4的话继续随机
        return  f();
    }

    public int rand7(){
        return 0;
    }
}
