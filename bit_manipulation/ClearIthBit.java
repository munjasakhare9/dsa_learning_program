class ClearIthBit{
	static void clearBit(int n, int i){
		int bitMask=~(1<<i);
		System.out.println(n&bitMask);
	}
	public static void main(String args[]){
		clearBit(10,3);
	}
}