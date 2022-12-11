package leet_202205;

/**
 * @Author wanys
 * @Date 2022/5/20 1:50 PM
 * @Version 1.0
 **/
public class CompareVersion {

    public int compareVersion(String version1, String version2) {
        int len1 = version1.length();
        int len2 = version2.length();
        int i = 0, j = 0;
        //双指针
        while (i < len1 || j < len2) {
            int x = 0;//如果没有，那就是0，
            for (; i <len1&&version1.charAt(i)!='.' ; i++) {
                x=x*10+(version1.charAt(i)-'0');
            }
            //找到了一个数，跳过点号
            i++;
            int y=0;//如果没有，那就是0
            for (; j <len2&&version2.charAt(j)!='.' ; j++) {
                y=y*10+(version2.charAt(j)-'0');
            }
            j++;
            //不相等就可以退出了，
            if(x!=y){
                return x>y?1:-1;
            }
        }
        return 0;
    }
}
