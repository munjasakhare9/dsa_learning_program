class LastOccurance{
	private static int findLastOccurence(int a[], int key, int i){//a,5,0
		if(i==a.length-1){
			return -1;
		}
		int isFound=findLastOccurence(a, key, i+1);
		if(isFound==-1 && a[i]==key){
			return i;
		}
		return isFound;
	}
	public static void main(String args[]){
		int a[]={8,3,6,9,5,10,2,5,3,7};
		int key=5;
		int pos=findLastOccurence(a, key, 0);
		System.out.println(pos);
	}
}