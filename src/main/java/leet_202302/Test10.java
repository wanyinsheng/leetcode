package leet_202302;

/**
 * @Author wanys
 * @Date 2023/2/20 10:59
 * @Version 1.0
 **/
public class Test10 {
    public static void main(String[] args) {
        String res="helloword";
        String a="hello";
        String b="word";
        int aLen=a.length();
        int bLen=b.length();
        int index1=0;
        int index2=0;
        int index=0;
        while(index1<aLen&&index2<bLen){
            if(res.charAt(index)==a.charAt(index1)){
                index1++;
                index++;

            }else if(res.charAt(index)==b.charAt(index2)){
                index2++;
                index++;
            }else{
                System.out.println("false");
            }

        }
//        System.out.println(index1);
//        System.out.println(index2);
        //最后的合并
        if(index1==aLen){
            if(res.charAt(index)==b.charAt(index2)){
                index2++;
                index++;
            }
        }
        if(index2==bLen){
            if(res.charAt(index)==a.charAt(index1)){
                index1++;
                index++;
            }
        }
        if(index1+index2==index) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
