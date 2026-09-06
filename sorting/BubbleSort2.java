import java.util.Arrays;
class BubbleSort2{
	public static void sort(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String args[]){
		int arr[]={8,9,5,4,3,1,2,6,7};
		sort(arr);
	}
}
/*
45312
43512
43152
43125

34125
31425
31245

13245
12345

12345
*/