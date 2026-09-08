class CountSetBits{
	static int countSetBits(int n){
		int temp=n;
		int count=0;
		while(temp!=0){
			if(temp%2!=0){
				count++;
			}
			temp=temp>>1;
		}
		return count;
	}
	
	public static void main(String args[]){
		System.out.println("Number of set bits are :- "+countSetBits(16));
	}
}