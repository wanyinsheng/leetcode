package OD;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author wanys
 * @Date 2023/3/29 16:37
 * @Version 1.0
 **/
public class 报数游戏 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num <= 1 || num >= 100) {
			System.out.println("ERROR!");
			return;
		}
		Map<Integer,Integer> map = new HashMap<>();
		// 1 to  100
		for (int i = 0; i < 100; i++) {
			map.put(i + 1, i + 1);
		}
		int startVal = 1;
		while (num < map.size()) {
			Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

			while (iterator.hasNext()) {
				Map.Entry<Integer, Integer> next = iterator.next();
				Integer key=next.getKey();
				map.put(key,startVal++);
				Integer value = next.getValue();
				if(value==num){
					iterator.remove();
					startVal=1;
				}
			}


		}


		StringBuilder stringBuilder = new StringBuilder();
		for (Map.Entry<Integer, Integer> entry :map.entrySet()) {
			stringBuilder.append(entry.getKey()).append(",");
		}
		//删除最后的逗号
		stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
		System.out.println(stringBuilder);
	}
}

