import java.util.ArrayList;
import java.util.Collections;

public class Program4 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(5);
		al.add(9);
		al.add(3);
		al.add(6);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
	}
}
