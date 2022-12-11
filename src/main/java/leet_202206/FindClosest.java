package leet_202206;

/**
 * 面试题 17.11. 单词距离
 * @Author wanys
 * @Date 2022/6/2 1:46 PM
 * @Version 1.0
 **/
public class FindClosest {

    public int findClosest(String[] words, String word1, String word2) {
        int len=words.length;
        int ans=len;//初始化为最大
            int index1=-1;
            int index2=-1;
        for (int i = 0; i <len ; i++) {
            String word=words[i];
            if(word.equals(word1)){
                index1=i;
            }else if(word.equals(word2)){
                index2=i;
            }
            if(index1>=0&&index2>=0){
                ans=Math.min(ans,Math.abs(index1-index2));//找最小值
            }
        }
        return ans;

    }
}
