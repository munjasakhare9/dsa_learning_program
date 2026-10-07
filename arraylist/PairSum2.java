import java.util.ArrayList;

class PairSum2{
	public static boolean pairSum2(ArrayList<Integer> list, int target){
		if(list.size() < 2){
			return false;
		}
		int front=-1;
		for(int i=0;i<list.size()-1;i++){
			if(list.get(i)>list.get(i+1)){
				front=i;
				break;
			}
		}
			
		int left=front+1;
		int right=front;
		while(left!=right){
			int sum=list.get(left)+list.get(right);
			if(sum==target){
				System.out.println("("+list.get(left)+", "+list.get(right)+") "+"target="+target);
				return true;
			}
			else if(sum<target){
				left=(list.size()+(left+1))%list.size();
			}
			else{
				right=(list.size()+(right-1))%list.size();
			}
		}
			
		return false;
	}
		
	public static void main(String args[]){
		
		ArrayList<Integer> list = new ArrayList<>();// len+rear=6+0=6%6=0
		// 15, 16, 6, 8, 9, 10

		list.add(15);
		list.add(16);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(10);

		int target = 16;
		System.out.println(pairSum2(list, target));
		System.out.println(list);
	}
}
