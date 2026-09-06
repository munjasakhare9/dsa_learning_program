import java.util.Arrays;
class SelectionSort{
	public static void main(String args[]){
		int a[]={1,5,4,2,3,6,9,1,7,8,8,9,6,7};
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}
	
	private static void selectionSort(int a[]){
		for(int i=0;i<a.length-1;i++){
			int minPos=i;
			for(int j=i+1;j<a.length;j++){
				if(a[minPos]>a[j]){
					minPos=j;
				}
			}
			int temp=a[minPos];
			a[minPos]=a[i];
			a[i]=temp;
		}
	}
}