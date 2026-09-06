class BinaryToDecimal{
	public static void main(String args[]){
		int num1=1000;
		int dec=0;
		int count=0;
		while(num1!=0){
			int d=num1%10;
			dec=dec+d*((int)Math.pow(2,count));
			count++;
			num1/=10;
		}
		System.out.println(dec);
	}
}