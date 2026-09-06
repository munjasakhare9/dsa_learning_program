class PrefixSum1{
	public static void findMaxSubArrSum(int numbers[]){
		int currSum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=1;i<numbers.length;i++){
			numbers[i]=numbers[i-1]+numbers[i];//[1,-1,5,4,7]
		}
		for(int i=0;i<numbers.length;i++){//4<5
			for(int j=i;j<numbers.length;j++){//4<5
				currSum=(i==0)?numbers[j]:numbers[j]-numbers[i-1];//8
				if(maxSum<currSum){
					maxSum=currSum;//8
				}
			}
		}
		System.out.println("max sum = "+maxSum);
	}
	public static void main(String args[]){
		int arr[]={1,-2,6,-1,3};
		findMaxSubArrSum(arr);
	}
}