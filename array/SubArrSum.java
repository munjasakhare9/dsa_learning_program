class SubArrSum{
	public static void main(String args[]){
		int arr[]={2,4,6,8,10};
		int maxSum=0, minSum=arr[0];
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				int subArrSum=0;
				for(int k=i;k<=j;k++){
					System.out.print(arr[k]+" ");
					subArrSum+=arr[k];
				}
				System.out.println("sum :- "+subArrSum);
				if(maxSum<subArrSum){
					maxSum=subArrSum;
				}
				if(minSum>subArrSum){
					minSum=subArrSum;
				}
			}
			System.out.println();
		}
		System.out.println("Maximum sum of subArrSum:- "+maxSum);
		System.out.println("Minimum sum of subArrSum:- "+minSum);
	}
}