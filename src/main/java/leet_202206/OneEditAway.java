package leet_202206;

/**
 * @Author wanys
 * @Date 2022/6/15 7:26 AM
 * @Version 1.0
 **/
public class OneEditAway {

    public boolean oneEditAway(String first, String second) {
        int m=first.length();
        int n=second.length();
        if(n-m==1){
            return oneInsert(first, second);
        }else if(m-n==1){
            return oneInsert(second, first);
        }else if(m==n){
            boolean foundDifference = false;
            for (int i = 0; i < m; i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    if (!foundDifference) {
                        foundDifference = true;
                    } else {
                        return false;
                    }
                }
            }
            return true;

        }else{
            return false;
        }
    }
    public boolean oneInsert(String shorter, String longer) {
        int length1 = shorter.length(), length2 = longer.length();
        int index1 = 0, index2 = 0;
        while (index1 < length1 && index2 < length2) {
            //index1只有相等才移动，index2始终会移动，因此最后只有相差为1才可以插入
            if (shorter.charAt(index1) == longer.charAt(index2)) {
                index1++;
            }
            index2++;
            if (index2 - index1 > 1) {
                return false;
            }
        }
        return true;
    }

}
