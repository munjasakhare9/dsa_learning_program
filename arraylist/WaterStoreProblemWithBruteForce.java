import java.util.ArrayList;

public class WaterStoreProblemWithBruteForce {
	public static void main(String[] args) {
		ArrayList<Integer> ht=new ArrayList<>();
		ht.add(1);//0
		ht.add(8);//1
		ht.add(6);//2
		ht.add(2);//3
		ht.add(5);//4
		ht.add(4);//5
		ht.add(8);//6
		ht.add(3);//7
		ht.add(7);//8
		
		int maxWaterStore=0;//49
		for(int i=0;i<ht.size();i++) {//9<9
			for(int j=i+1; j<ht.size();j++) {//9<9
				int height=Math.min(ht.get(i), ht.get(j));//3,7=3
				int width=j-i;//8-7=1
				int waterStore=height*width;//3*1=3
				maxWaterStore=Math.max(maxWaterStore, waterStore);//49,3=49
			}
		}
		
		System.out.println("Max Water Store : "+maxWaterStore);
	}
}
