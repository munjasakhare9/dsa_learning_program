class TrappingRainWater{
	public static void calculateRainWater(int barArr[]){
		if (barArr == null || barArr.length == 0) {
			System.out.println("Water Trapped :- 0");
			return;
		}
		int leftMaxBoundary[]=new int[barArr.length];
		int rightMaxBoundary[]=new int [barArr.length];
		int waterTrapped=0;
		leftMaxBoundary[0]=barArr[0];
		rightMaxBoundary[barArr.length-1]=barArr[barArr.length-1];
		for(int i=1;i<barArr.length;i++){
			leftMaxBoundary[i]=Math.max(leftMaxBoundary[i-1],barArr[i]);
		}
		
		for(int i=barArr.length-2;i>=0;i--){
			rightMaxBoundary[i]=Math.max(barArr[i],rightMaxBoundary[i+1]);
		}
		
		for(int i=0;i<barArr.length;i++){
			int waterLevel=Math.min(leftMaxBoundary[i],rightMaxBoundary[i]);
			waterTrapped+=waterLevel-barArr[i];
		}
		
		System.out.println("Water Trapped :- "+waterTrapped);
	}
	public static void main(String args[]){
		int arr[]={4,2,0,6,3,2,5};
		calculateRainWater(arr);
	}
}