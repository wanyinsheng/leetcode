package leet_202207;

/**
 * 744. 寻找比目标字母大的最小字母
 * @Author wanys
 * @Date 2022/7/1 3:54 下午
 * @Version 1.0
 **/
public class NextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int length = letters.length;
        //在比较时，字母是依序循环出现的。所以letters最后一个字母的下一个字母就是letters[0]
        if (target >= letters[length - 1]) {
            return letters[0];
        }
        int low = 0, high = length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (letters[mid] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return letters[low];

    }
}
