class DecimalToBinary{
	public static void main(String args[]){
		int num=7;
		int bin=0;
		int count=0;
		while(num!=0){
			int rem=num%2;
			bin=bin+(rem*(int)Math.pow(10,count));
			count++;
			num/=2;
		}
		System.out.println(bin);
	}
}