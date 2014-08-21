import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * n2
 * pay attention to duplicate result
 */
public class ThreeSum {
	
	
	public List<List<Integer>> threeSum(int[] num) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (num.length < 3) {
			return result;
		}
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {

			if (i == 0 || num[i] > num[i - 1]) {

				int first = num[i];
				int left = i + 1;
				int right = num.length - 1;
				while (left < right) {
					if (first + num[left] + num[right] == 0) {
						List<Integer> temp = new ArrayList<Integer>();
						temp.add(first);
						temp.add(num[left]);
						temp.add(num[right]);
						result.add(temp);
						left++;
						right--;

						while (left < right && num[right] == num[right + 1]) {
							right--;
						}
						while (left < right && num[left] == num[left - 1]) {
							left++;
						}

					} else if (first + num[left] + num[right] < 0) {
						left++;
					} else {
						right--;
					}
				}
			}
		}
		return result;
	}
}