class FirstOccurance{
	private static int findFirstOccurance(int a[], int key,int i){
		if(i==a.length){
			return -1;
		}
		if(key==a[i]){
			return i;
		}
		return findFirstOccurance(a,key,i+1);
	}
	public static void main(String args[]){
		int a[]={8,3,6,9,5,10,2,5,3,7};
		int key=5;
		int pos=findFirstOccurance(a,key,0);
		System.out.println(pos);
	}
}