import java.util.ArrayList;

public class WaterStoreProblemWithTwoP {
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
		
		int i=0, j=ht.size()-1;//i-> left pointer & j-> right pointer
		int maxWaterStore=0;
		while(i<j) {
			int height=Math.min(ht.get(i), ht.get(j));
			int width=j-i;
			int currWater=height*width;
			maxWaterStore=Math.max(maxWaterStore, currWater);
			
			if(ht.get(i)<ht.get(j)) {
				i++;
			}
			else {
				j--;
			}
		}
		
		System.out.println("Max Water Store :: "+maxWaterStore);
	}
}
