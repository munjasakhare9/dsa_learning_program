class KadanesAlgo3{
	public static void findMaxSumOfSubArr(int numbers[]){
    int cs = numbers[0];//-2
    int ms = numbers[0];//-2

    for(int i=1; i<numbers.length; i++){//7<8
        cs = Math.max(numbers[i], cs + numbers[i]);//-3,4=4
        ms = Math.max(ms, cs);//7,4=7
    }

    System.out.println("Max sum of subArr :- " + ms);
	}
	public static void main(String args[]){
		int arr[]={-2,-3,4,-1,-2,1,5,-3};
		findMaxSumOfSubArr(arr);
	}
}