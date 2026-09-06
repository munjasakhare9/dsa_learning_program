class KadanesAlgo2{
	public static void findMaxSumOfSubArr(int numbers[]){
		boolean allNegative = true;
		int maxNegative = Integer.MIN_VALUE;
		int maxSum=0;
		int currSum=0;
		for(int num : numbers){
			if(num >= 0){
				allNegative = false;
				break;
				
			}
			maxNegative = Math.max(maxNegative, num);
		}
		
		if(!allNegative){
			for(int i=0;i<numbers.length;i++){
				currSum=currSum+numbers[i];
				if(currSum<0){
					currSum=0;
				}
				maxSum=Math.max(currSum,maxSum);//20,12=20
			}
			System.out.println("Max Sum :- "+maxSum);
		}
		else{
			System.out.println("Max sum :- "+maxNegative);
		}
	}
	public static void main(String args[]){
		int arr[]={2,4,6,8,10};//-2,-3,4,-1,-2,1,5,-3
		findMaxSumOfSubArr(arr);
	}
}