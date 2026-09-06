import java.util.Arrays;
class ReverseArr{
	public static void main(String args[]){
		int arr[]={2,4,6,8,10};
		int start=0, end=arr.length-1;
		while(start<end){
			arr[start]+=arr[end];
			arr[end]=arr[start]-arr[end];
			arr[start]-=arr[end];
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
	}
}