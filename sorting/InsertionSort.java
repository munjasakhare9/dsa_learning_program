import java.util.Arrays;
class InsertionSort{
	public static void main(String args[]){
		int a[]={5,4,1,3,2};
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}
	private static void insertionSort(int a[]){
		for(int i=1;i<a.length;i++){
			int curr=a[i];
			int prev=i-1;
			while(prev>=0&&a[prev]>curr){
				a[prev+1]=a[prev];
				prev--;
			}
			a[prev+1]=curr;
		}
	}
}