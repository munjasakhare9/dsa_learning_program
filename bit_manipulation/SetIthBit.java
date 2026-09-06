class SetIthBit{
	static void setBit(int n, int i){
		int bitMask=1<<i;
		System.out.println(n|bitMask);
	}
	public static void main(String args[]){
		setBit(10,2);
	}
}