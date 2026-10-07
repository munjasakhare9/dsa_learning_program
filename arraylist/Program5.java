import java.util.ArrayList;

public class Program5 {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		ArrayList<Integer> al3=new ArrayList<>();
		
		for(int i=1;i<=5;i++) {
			al1.add(i*1);
			al2.add(i*2);
			al3.add(i*3);
		}
		
		mainList.add(al1);
		mainList.add(al2);
		mainList.add(al3);
		System.out.println(mainList);
		al2.remove(0);
		al2.remove(1);
		System.out.println(mainList);
		for(int i=0;i<mainList.size();i++) {
			ArrayList<Integer> currList=mainList.get(i);
			for(int j=0;j<currList.size();j++) {
				System.out.print(currList.get(j)+" ");
			}
			System.out.println();
		}
	}
}
