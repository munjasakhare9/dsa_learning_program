class FindShortestPath{
	public static double getPath(int x, int y, String s1){
		for(int i=0;i<s1.length();i++){
			char c=s1.charAt(i);
			if(c=='N'){
				y++;
			}
			else if(c=='S'){
				y--;
			}
			else if(c=='E'){
				x++;
			}
			else{
				x--;
			}
		}
		int sum=x*x+y*y;
		return Math.sqrt(sum);
	}
	public static void main(String args[]){
		String s1="WNEENESENNN";
		double path=getPath(0,0,s1);
		System.out.println(path);
	}
}