class CheckPower{
	static void checkPower(int n){
		
		for(int i=1;i<=n;i++){
			int bitMask=1<<i;
			if(bitMask==n){
				System.out.println(n+" It is 2's Power");
				break;
			}
			else if(bitMask>n){
				System.out.println(n+" It is not 2's Power");
				break;
			}
			
		}
	}
	public static void main(String args[]){
		checkPower(7);
	}
}