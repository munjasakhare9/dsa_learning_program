class KadanesAlgo{
	public static void findMaxSumOfSubArr(int numbers[]){
		int maxSum=0;
		int currSum=0;
		for(int i=0;i<numbers.length;i++){//4<5
			currSum=currSum+numbers[i];//10
			if(currSum<0){//20<0
				currSum=0;
			}
			
			maxSum=Math.max(currSum,maxSum);//20,12=20
		}
		System.out.println("Max Sum :- "+maxSum);
	}
	public static void main(String args[]){
		int arr[]={-2,-3,4,-1,-2,1,5,-3};
		findMaxSumOfSubArr(arr);
	}
}