class ClearIBit{
	static int clearIBit(int n, int i){
		int bitMask=(-1<<i);//(~0)<<i
		return n&bitMask;
	}
	public static void main(String args[]){
		System.out.println(clearIBit(15,2));
	}
}