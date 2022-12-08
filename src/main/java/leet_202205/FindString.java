package leet_202205;

/**
 * 面试题 10.05. 稀疏数组搜索
 * @Author wanys
 * @Date 2022/5/21 10:23 AM
 * @Version 1.0
 **/
public class FindString {
    /**
     * 排序好的稀疏数组，那就使用二分查找
     * @param words
     * @param s
     * @return
     */
    public int findString(String[] words, String s) {
        int left=0;
        int right=words.length-1;
        while(left<=right){
            while(left<=right&&words[left].equals("")) left++;
            while(left<=right&&words[right].equals("")) right--;
            int mid=(left+right)>>1;//使用位运算表示  /2
            //如果正好是空格了，则就可以向左或者向右移动，构成了二分非线性
            while(left<mid&&words[mid].equals("")) {//这里选择向左移动
                mid--;
            }
            if(s.equals(words[mid])){
                return mid;
            }
            if(s.compareTo(words[mid])<0){
                right=mid-1;
            }else{
                left=mid+1;
            }

        }
        return -1;
    }

}
