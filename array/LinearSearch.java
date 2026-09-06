class LinearSearch{
	public static int findNumPosition(int arr[], int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[]){
		int arr[]={10,15,20,7,12,9};
		int key=7;
		int index=findNumPosition(arr,key);
		if(index==-1){
			System.out.println("Not Found");
		}
		System.out.println(key+" found at position "+index);
	}
}