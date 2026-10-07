import java.util.ArrayList;
class Stack{
	ArrayList<Integer> list=new ArrayList<>();
	public static void push(int value){
		list.add(value);
	}
	
	public static int pop(){
		int top=list.size()-1;
		list.remove(list.size()-1);
		return top;
	}
	
}
class MainClass{
	public static void main(String args[]){
		push(10);
		System.out.println(list);
	}
}