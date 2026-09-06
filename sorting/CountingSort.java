import java.util.Arrays;
class CountingSort{
	public static void countingSort(int arr[]){
		int largest=arr[0];
		for(int i=1;i<arr.length;i++){
			if(largest<arr[i]){
				largest=arr[i];
			}
		}
		
		int frequencyCount[]=new int[largest+1];
		
		System.out.println(largest);
		for(int i=0;i<frequencyCount.length;i++){
			frequencyCount[arr[i]]++;//frequencyCount[1]+=1
		}
		System.out.println(frequencyCount.length);
		int j=0;
		for(int i=0;i<frequencyCount.length;i++){
			while(frequencyCount[i]>0){
				arr[j]=i;
				j++;
				frequencyCount[i]--;
			}
		}
	}
	public static void main(String args[]){
		int arr[]={1,4,1,3,2,4,3,7};
		countingSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
