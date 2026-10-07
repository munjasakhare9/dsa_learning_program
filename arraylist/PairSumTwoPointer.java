import java.util.ArrayList;

public class PairSumTwoPointer {
	public static boolean pairSum(ArrayList<Integer> list, int target) {
		int i = 0, j = list.size() - 1;
		
		while (i < j) {
			int sum=list.get(i) + list.get(j);
			if (sum == target) {
				return true;
			}
			else if(sum>target) {
				j--;
			}
			else {
				i++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		// 1, 2, 3, 4, 5, 6

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		int target = 10;
		System.out.println(pairSum(list, target));
		System.out.println(list);
	}
}
