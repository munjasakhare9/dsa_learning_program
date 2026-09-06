class LargestInArray{
	public static int findLargest(int arr[]){
		int largest=arr[0];
		for(int i=1;i<arr.length;i++){
			if(largest<arr[i]){
				largest=arr[i];
			}
		}
		return largest;
		
	}
	public static void main(String args[]){
		int arr[]={10,50,60,110,20,90,70};
		System.out.println("Largest in array is :- "+findLargest(arr));
	}
}