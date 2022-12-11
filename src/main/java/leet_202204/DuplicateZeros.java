package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/27 4:35 PM
 * @Version 1.0
 **/
public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        int possibleDups=0;
        int len=arr.length-1;

        for (int i = 0; i <=len-possibleDups; i++) {
            if (arr[i] == 0) {

                // Edge case: This zero can't be duplicated. We have no more space,
                // as left is pointing to the last element which could be included
                if (i == len - possibleDups) {
                    // For this zero we just copy it without duplication.
                    arr[len] = 0;
                    len -= 1;
                    break;
                }
                possibleDups++;


            }
        }
        int last = len - possibleDups;

        // Copy zero twice, and non zero once.
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }








    }
}
