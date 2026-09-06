import java.util.Scanner;
class CreatingMatrix{
	public static void printSpecificElement(int matrix[][],int a, int b){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(i==a&&j==b){
					System.out.println(String.format("On Position of (%d,%d) Element is :- %d",a,b,matrix[i][j]));
					break;
				}
			}
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int matrix[][]=new int[3][3];
		System.out.print("Enter your elements :- ");
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				matrix[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Print Matrix :- ");
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		printSpecificElement(matrix,1,1);
	}
}