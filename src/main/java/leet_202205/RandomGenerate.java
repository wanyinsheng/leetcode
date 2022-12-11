package leet_202205;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

/**
 * @Author wanys
 * @Date 2022/5/20 8:02 AM
 * @Version 1.0
 **/
public class RandomGenerate {

    public static int[] gene() {
        int maxLen = 10000;
        int maxNum = 1000;
        int len = (int) (Math.random() * maxLen);
        int[] arr = new int[len];
        for (int i = 0; i <len ; i++) {
            arr[i]=(int)(Math.random()*maxNum);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(gene()));
    }

}
