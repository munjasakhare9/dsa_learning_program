class LargestString{
	public static void main(String args[]){
		String s1[]={"apple", "mango", "banana"};
		String max=s1[0];
		for(int i=1;i<s1.length;i++){
			if(max.compareTo(s1[i])<0){//max.compareToIgnoreCase(s1[i])<0
				max=s1[i];
			}
		}
		System.out.println(max);
	}
}