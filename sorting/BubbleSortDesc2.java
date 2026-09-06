import java.util.Arrays;
class BubbleSortDesc2{
	public static void sortDescOrder(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			boolean swapped=false;
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]<arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(!swapped){
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String args[]){
	int arr[]={5,4,3,1,2};
	sortDescOrder(arr);
	}
}