package leet_202203;

/**
 * @Author wanys
 * @Date 2022/3/29 12:15 AM
 * @Version 1.0
 **/
public class MaxConsecutiveAnswers {

    /**
     * 方法一：滑动窗口
     *
     * @param answerKey
     * @param k
     * @return
     */
    public int maxConsecutiveAnswers(String answerKey, int k) {
        //这里要分别求T和F的最大值
        return Math.max(maxConsecutiveChar(answerKey, k, 'T'), maxConsecutiveChar(answerKey, k, 'F'));


    }

    public int maxConsecutiveChar(String answerKey, int k, char c) {
        int result = 0;
        int n = answerKey.length();
        for (int left = 0, right = 0, sum = 0;
             right < n;
             sum+=answerKey.charAt(right)!=c?1:0){//不相等的话就加一
            while (sum>k){
                sum-=answerKey.charAt(left++)!=c?1:0;
            }
            result=Math.max(result,right-left+1);

        }
        return result;
    }
}
