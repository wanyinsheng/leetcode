package leet_202205;

/**
 * 2114. 句子中的最多单词数
 * @Author wanys
 * @Date 2022/5/21 1:08 PM
 * @Version 1.0
 **/
public class MostWordsFound {
    public int mostWordsFound(String[] sentences) {
        int maxLen=0;
        //单词数=空格数+1
        //首尾不包含空格
        for (int i = 0; i < sentences.length; i++) {
            //计算每个句子的长度
            int count=0;
            for (int j = 1; j < sentences[i].length()-1; j++) {
                if(sentences[i].substring(j,j+1).equals(" "))
                    count++;
            }
            if(maxLen<count)
                maxLen=count;

        }
        return maxLen+1;

    }

}
