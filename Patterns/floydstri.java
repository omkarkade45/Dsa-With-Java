import java.util.*;
class floydstri{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows :");
		int row=sc.nextInt();
		int count=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}
}