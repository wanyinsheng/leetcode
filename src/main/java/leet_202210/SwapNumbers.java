package leet_202210;

/**
 * @Author wanys
 * @Date 2022/10/19 22:37
 * @Version 1.0
 **/
public class SwapNumbers {
    public int[] swapNumbers(int[] numbers) {
        numbers[0]^=numbers[1];
        numbers[1]^=numbers[0];
        numbers[0]^=numbers[1];
        return numbers;

    }
}
