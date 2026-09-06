class BinarySearch{
	public int BinarySearchArr(int arr[], int key){
		int start=0, end=arr.length-1;//0,6
		while(start<=end){//0<=2
			int mid=(start+end)/2;//0+1=1 1/2=0
			if(arr[mid]==key){//arr[1]==5-true
				return mid;
			}
			else if(arr[mid]<key){//arr[mid]<5
				start=mid+1;//start=
			}
			else{
				end=mid-1;//end=2-1=1
			}
		}
		return -1;
	}
	
	public static void main(String args[]){
		int arr[]={5,15,20,25,27,45};
		int key=45;				
		BinarySearch b1=new BinarySearch();
		int res=b1.BinarySearchArr(arr,key);
		System.out.println(key+" is placed at :- "+res);
	}
}