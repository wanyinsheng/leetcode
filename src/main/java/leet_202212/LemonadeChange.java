package leet_202212;

/**
 * 860. 柠檬水找零
 */
public class LemonadeChange {
	public boolean lemonadeChange(int[] bills) {
		int five = 0, ten = 0;
		for (int bill : bills) {
			if (bill == 5) {
				five++;
			} else if (bill == 10) {
				if (five == 0) {
					return false;
				}
				five--;
				ten++;
			} else {
				if (five > 0 && ten > 0) {//优先找零10+5的
					five--;
					ten--;
				} else if (five >= 3) {
					five -= 3;
				} else {
					return false;
				}
			}
		}
		return true;

	}
}
