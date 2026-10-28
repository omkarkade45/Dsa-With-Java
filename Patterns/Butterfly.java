import java.util.*;
class Butterfly{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			//stars
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			//space
			for(int j=1;j<=2*(row-i);j++){
				System.out.print(" ");
			}
			//stars
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i=row;i>=1;i--){
			//stars
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			//space
			for(int j=1;j<=2*(row-i);j++){
				System.out.print(" ");
			}
			//stars
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}